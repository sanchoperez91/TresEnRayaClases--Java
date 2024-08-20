
package tres_en_raya_clases;

import java.util.Scanner;

public class Funciones {
    int fila;
    int columna;
    int mi_matriz[][]= new int[3][3];
    Scanner scan=new Scanner(System.in);
    
    public Funciones(){
    }
    public void mostrarTableroInicial(){
      System.out.println("__________________________________");
      System.out.println("COMENZAMOS !!!!!!!!!!!");
      System.out.println("Les vamos a mostrar el tablero de las tres en raya, en el cual se ve cada posicion:");
      System.out.println("|_0,0_|_0,1_|_0,2_|");
      System.out.println("|_1,0_|_1,1_|_1,2_|");
      System.out.println("|_2,0_|_2,1_|_2,2_|");
      System.out.println("A la hora de poner la ficha, cada jugador debe indicar primero la fila y despues la columna. Las posiciones libres apareceran como un 0. No puede seleccionar una posicion que ya este ocupada por una ficha");         
      System.out.println("Comienza el jugador numero 1");
    }  
    public int[][] colocarFicha(int jugador){
        do{
        System.out.println("Jugador "+jugador+", indique la posicion de la fila");
            fila=scan.nextInt();
        System.out.println("Jugador "+jugador+", indique la posicion de la columna");
            columna=scan.nextInt();
            if(fila>=0 && fila<3 && columna>=0 && columna<3 ){
                if(mi_matriz[fila][columna]!=1 && mi_matriz[fila][columna]!=2){
                    if(jugador==1){
                    mi_matriz[fila][columna]=1;
                    }else {mi_matriz[fila][columna]=2;
                    }
                    return mi_matriz;
                }else{System.out.println("Error, esa posicion esa ocupada");}
            }else{System.out.println("Error, esa posicion no es valida");}
        }while(fila<0 || fila>2 || columna<0 || columna>2 || mi_matriz[fila][columna]!=1 || mi_matriz[fila][columna]!=2);{
         System.out.println("Esa casilla no es posible.");}
        return null;
    }
    
    public void imprimirTablero(){
        System.out.println("El tablero esta ahora asi:");
        for(int x=0; x<3; x++){
            for(int y=0; y<3; y++){
                System.out.print("|_"+mi_matriz[x][y]+"_|");
            }
            System.out.println(""); 
        }
    }
    
    public boolean comprobar(int jugador){
        if(mi_matriz[0][0]==jugador && mi_matriz[0][1]==jugador && mi_matriz[0][2]==jugador){
            return true; 
        }
        if(mi_matriz[1][0]==jugador && mi_matriz[1][1]==jugador && mi_matriz[1][2]==jugador){
            return true;
        }
        if(mi_matriz[2][0]==jugador && mi_matriz[2][1]==jugador && mi_matriz[2][2]==jugador){
            return true;
        }
        if(mi_matriz[0][0]==jugador && mi_matriz[1][0]==jugador && mi_matriz[2][0]==jugador){
            return true;
        }
        if(mi_matriz[0][1]==jugador && mi_matriz[1][1]==jugador && mi_matriz[2][2]==jugador){
            return true;
        }
        if(mi_matriz[0][2]==jugador && mi_matriz[1][2]==jugador && mi_matriz[2][2]==jugador){
            return true;
        }
        if(mi_matriz[0][0]==jugador && mi_matriz[1][1]==jugador && mi_matriz[2][2]==jugador){
            return true;
        }
        if(mi_matriz[0][2]==jugador && mi_matriz[1][1]==jugador && mi_matriz[2][0]==jugador){
            return true;
        }
        return false;
    }
    
    public boolean nuevaPartida(int jugador){
        System.out.println("Enhorabuena has ganado jugador "+jugador+" !!!!!!!!!!!!!!");
        System.out.println("Si quieres jugar nueva partida pulsa 1, en caso contrario pulsa cualquier otro numero");
        int decision=scan.nextInt();
        if(decision==1){
            return true;
        }else{
            System.out.println("Fin de la partida. ADIOS!!!");
            return false;
        }
    }
}
