# Proyecto 3 en Raya en Java 🎮

Este proyecto implementa el juego de **3 en raya** (Tic-Tac-Toe) en el lenguaje de programación Java. La aplicación permite a dos jugadores competir en el mismo tablero, introduciendo sus movimientos a través de la consola. El código emplea estructuras fundamentales de Java como bucles, arrays y lógica de programación, utilizando también programación orientada a objetos (POO) para organizar las funcionalidades en clases y métodos.

## 🗂️ Estructura del Proyecto

El proyecto se compone de dos clases principales:

- **Clase `Funciones`**: Contiene los métodos necesarios para gestionar el tablero, colocar fichas, imprimir el tablero y comprobar si hay un ganador. También controla si los jugadores desean iniciar una nueva partida.
  
- **Clase `Tres_en_raya_clases`**: Es la clase principal del programa, que contiene el método `main` para ejecutar el flujo del juego. En cada partida, el flujo controla los turnos de cada jugador, verifica si hay un ganador después de cada movimiento y permite a los jugadores decidir si desean una nueva partida.

## ⚙️ Características del Código

### Lenguaje y Estructuras Utilizadas

- **Lenguaje**: Java ☕
- **Conceptos aplicados**:
  - **Bucles** 🔄: Para gestionar los turnos de los jugadores y el flujo de juego hasta que uno gane o haya un empate.
  - **Arrays** 📊: La matriz `mi_matriz[][]` representa el tablero de juego.
  - **Lógica de programación** 🧠: Para validar las posiciones de los jugadores y verificar si hay un ganador en cada turno.
  - **POO** 🧩: La estructura del código se basa en clases y métodos, lo que permite una organización modular y mejora la legibilidad.

### 📝 Descripción de las Funciones Clave

#### Clase `Funciones`

1. **`mostrarTableroInicial()`**: Imprime el tablero inicial para que los jugadores conozcan las posiciones de cada celda.
2. **`colocarFicha(int jugador)`**: Permite a cada jugador colocar su ficha en una posición del tablero, verificando si la posición está libre y si es válida.
3. **`imprimirTablero()`**: Muestra el estado actual del tablero después de cada movimiento.
4. **`comprobar(int jugador)`**: Verifica si el jugador ha conseguido tres en línea (horizontal, vertical o diagonal) y, por tanto, ha ganado la partida.
5. **`nuevaPartida(int jugador)`**: 🎉 Felicita al ganador y da la opción de iniciar una nueva partida.

#### Clase `Tres_en_raya_clases`

Esta clase contiene el método `main`, que controla el flujo del juego. Durante cada partida:
- Se inicializa el tablero y se alternan los turnos de los jugadores.
- Después de cada turno, se llama al método `comprobar` para verificar si alguno de los jugadores ha ganado.
- Si un jugador gana, el programa permite decidir si jugar otra vez o terminar el juego.

## 🚀 Ejecución del Programa

1. Clona este repositorio o descarga el código fuente.
2. Compila el código desde la terminal:

    ```bash
    javac tres_en_raya_clases/*.java
    ```

3. Ejecuta el programa con el siguiente comando:

    ```bash
    java tres_en_raya_clases.Tres_en_raya_clases
    ```

## 🎲 Ejemplo de Juego

Al iniciar el juego, se muestra el tablero vacío. Los jugadores deben seleccionar una posición indicando la fila y columna de la casilla deseada. El tablero se va actualizando tras cada movimiento. Si un jugador consigue tres en línea, se declara el ganador 🏆. Si no hay posiciones libres y nadie ha ganado, el juego termina en empate.

## 🤝 Contribuciones

Las contribuciones son bienvenidas. Si tienes ideas para mejorar el código o agregar nuevas funcionalidades, puedes abrir un pull request.

## 📜 Licencia

Este proyecto está bajo la licencia MIT. Para más detalles, consulta el archivo `LICENSE`.
