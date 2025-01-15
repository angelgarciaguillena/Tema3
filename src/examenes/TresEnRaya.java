package examenes;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class TresEnRaya {
		
	/*Creamos una tabla para almacenar el tablero*/
	static char tablero[][] = new char[9][9];
	
	/*Creamos el Scanner*/
	static Scanner sc = new Scanner(System.in);
	
	/*Creamos la clase Random*/
	static Random rand = new Random();
		

	public static void main(String[] args) {
		
		/*Creamos una variable para almacenar el numero que indica quien empezara el juego*/
		int empieza;
		
		/*Llamamos a la funcion*/
		imprimeTablero();
		
		/*Llamamos a la funcion*/
		empieza = jugadorInicial();
		
		/*Cerramos el Scanner*/
		sc.close();		
	}
	
	/*Creamos una funcion para imprimir el tablero por pantalla*/
	static void imprimeTablero(){
		
		/*Creamos un bucle for para inicializar el tablero con guiones*/
		for(int i = 0; i < tablero.length; i++) {
			Arrays.fill(tablero[i], '-');
		}
		
		/*Creamos un bucle for anidado para mostrar el tablero*/
		for(int i = 0; i < tablero.length; i++) {
			for(int j = 0; j < tablero[i].length; j++) {
				System.out.print(tablero[i][j] + "\t");
			}
			
			/*Hacemos un salto de linea*/
			System.out.println();
		}
	}
	
	/*Creamos una funcion que generara un numero aleatorio entre el 0 y el 1 que indicara quien empezara
	 * el juego y devolvera ese numero generado*/
	static int jugadorInicial() {
		
		/*Creamos una variable para almacenar el numero que indicara quien empieza el juego*/
		int empiezaJuego;
		
		/*Generamos un numero aleatorio y lo almacenamos en la variable*/
		empiezaJuego = rand.nextInt(0, 2);
		
		/*Devolvemos el numero que indica quien empieza el juego*/
		return empiezaJuego;
	}
	
	/*Creamos una funcion que se encargara de poner una ficha en una posicion aleatoria del tablero
	 * comprobando que esa casilla no este asignada por el jugador*/
	static void mueveFichaAleatoria() {
		
		/*Creamos una variable para almacenar la posicion aleatoria de la fila*/
		int posFila;
		
		/*Creamos una variable para almacenar la posicion aleatoria de la columna*/
		int posColumna;
		
		/*Generamos una posicion aleatoria para la fila y la columna*/
		posFila = rand.nextInt(0, 10);
		posColumna = rand.nextInt(0, 10);
		
		/*Creamos un bucle while para que si la posicion esta ocupada repetir la generacion del numero*/
		while(tablero[posFila][posColumna] == 'X' || tablero[posFila][posColumna] == 'O') {
			/*Generamos una posicion aleatoria para la fila y la columna*/
			posFila = rand.nextInt(0, 10);
			posColumna = rand.nextInt(0, 10);
		}
		
		/*Almacenamos el valor en el tablero*/
		tablero[posFila][posColumna] = 'X';		
	}
	
	static boolean usuarioMueveFicha() {
		
		/*Creamos una variable para almacenar si la casilla es valida o no*/
		boolean esValida = true;
		
		/*Creamos una variable para almacenar la posicion de fila del jugador*/
		int posFilaJugador;
		
		/*Creamos una variable para almacenar la posicion de columna del jugador*/
		int posColumnaJugador;
		
		/*Pedimos al usuario que introduzca una posicion de fila*/
		System.out.println("Introduce una posicion de fila");
		
		/*Leemos la posicion de fila del usuario*/
		posFilaJugador = sc.nextInt();
		
		/*Pedimos al usuario que introduzca una posicion de columna*/
		System.out.println("Introduce una posicion de columna");
		
		/*Leemos la posicion de columna del usuario*/
		posColumnaJugador = sc.nextInt();
		
		/*Si la posicion tiene algun de los dos tipos de fichas devolver false*/
		if(tablero[posFilaJugador][posColumnaJugador] == 'X' || tablero[posFilaJugador][posColumnaJugador] == 'O') {
			esValida = false;
		}
		
		/*Devolvemos si la casilla es valida*/
		return esValida;
	}
	
	/*Creamos una funcion para limpiar el tablero y eliminar todas las fichas*/
	static void limpiarTablero() {
		
		/*Creamos un bucle for para inicializar el tablero eliminando todas las fichas*/
		for(int i = 0; i < tablero.length; i++) {
			Arrays.fill(tablero, '-');
		}
	}
	
	/*Creamos una funcion que recibira como parametro la ficha del jugador y indicara si ha ganado el juego*/
	static boolean esGanador(char ficha) {
		
		/*Creamos una variable para almacenar si la ficha ha ganado*/
		boolean ganador = false;
		
		/*Creamos un bucle for anidado para recorrer el tablero*/
		for(int i = 0; i < tablero.length; i++) {
			for(int j = 0; j < tablero.length; j++) {
				/*Creamos un if para que si la i es 0 o la j es 0*/
				if(i != 0 && j != 0 && i != tablero.length-1 && j != tablero.length-1) {
					/*Si las fichas se encuentran en fila, columna, en diagonal izquierda o en diagonal derecha, habra ganado*/
					if(tablero[i][j+1] == ficha && tablero[i][j-1] == ficha) {
						ganador = true; //En fila
					} else if(tablero[i-1][j] == ficha && tablero[i+1][j] == ficha) {
						ganador = true; //En columna
					} else if(tablero[i+1][j+1] == ficha && tablero[i-1][j-1] == ficha) {
						ganador = true; //En diagonal izquierda
					} else if(tablero[i+1][j-1] == ficha && tablero[i-1][j+1] == ficha) {
						ganador = true;
					}
				}
			}
		}
		
		/*Devolver si la ficha es ganador*/
		return ganador;
	}
}