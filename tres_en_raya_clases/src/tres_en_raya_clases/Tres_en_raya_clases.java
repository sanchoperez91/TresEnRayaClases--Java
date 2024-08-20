
package tres_en_raya_clases;

public class Tres_en_raya_clases {

    public static void main(String[] args) {
       boolean nuevapartida=true;
        do{
            int mi_matriz[][]= new int[3][3];
            Funciones mi_funcion=new Funciones();

            mi_funcion.mostrarTableroInicial();
            mi_funcion.colocarFicha(1);
            mi_funcion.imprimirTablero();
            mi_funcion.colocarFicha(2);
            mi_funcion.imprimirTablero();
            mi_funcion.colocarFicha(1);
            mi_funcion.imprimirTablero();
            mi_funcion.colocarFicha(2);
            mi_funcion.imprimirTablero();
            mi_funcion.colocarFicha(1);
            if(mi_funcion.comprobar(1)){
                 mi_funcion.imprimirTablero();
                 nuevapartida=mi_funcion.nuevaPartida(1);
            }else{
                mi_funcion.imprimirTablero();
                nuevapartida=false;
                mi_funcion.colocarFicha(2);
                if(mi_funcion.comprobar(2)){
                    mi_funcion.imprimirTablero();
                    nuevapartida=mi_funcion.nuevaPartida(2);
                }else{
                    mi_funcion.imprimirTablero();
                    nuevapartida=false;
                    mi_funcion.colocarFicha(1);
                    if(mi_funcion.comprobar(1)){
                        mi_funcion.imprimirTablero();
                        nuevapartida=mi_funcion.nuevaPartida(1);
                    }else{
                        mi_funcion.imprimirTablero();
                        nuevapartida=false;
                        mi_funcion.colocarFicha(2);
                        if(mi_funcion.comprobar(2)){
                            mi_funcion.imprimirTablero();
                            nuevapartida=mi_funcion.nuevaPartida(2);
                        }else{
                            System.out.println("Fin de la partida, han quedado en tablas.");
                            nuevapartida=mi_funcion.nuevaPartida(2);
                        } 
                    }    
                }
            }      
        }while(nuevapartida);
    }
}
