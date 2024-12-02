package boletin5;

import java.util.Scanner;

public class Ejercicio4 {
	public static void main(String[] args) {
		
		/*Creamos una variable para almacenar la posicion de las filas*/
		int posFila;
		
		/*Creamos una variable para almacenar la posicion de las columnas*/
		int posColumna;
		
		/*Creamos una variable para almacenar la pieza que quiere el usuario*/
		char pieza;
		
		/*Creamos una tabla para almacenar el resultado de los movimientos de la pieza*/
		char resultado[][] = new char[8][8];
		
		/*Creamos un Scanner*/
		Scanner sc = new Scanner(System.in);
		
		/*Pedimos al usuario que introduzca la posicion de la fila*/
		System.out.println("Introduce la posicion de la fila");
		
		/*Leemos la posicion del usuario*/
		posFila = sc.nextInt();
		
		/*Pedimos al usuario que introduzca la posicion de la columna*/
		System.out.println("Introduce la posicion de la columna");
		
		/*Leemos la posicion del usuario*/
		posColumna = sc.nextInt();
		
		/*Pedimos al usuario que introduzca la pieza*/
		System.out.println("Introduce la pieza");
		
		/*Leemos la pieza del usuario*/
		pieza = sc.next().toUpperCase().charAt(0);
		
		/*Creamos un switch para llamar a la funcion*/
		switch(pieza) {
			case 'T' ->{
				resultado = torre(posFila, posColumna, pieza);
			}
			case 'A' ->{
				resultado = alfil(posFila, posColumna, pieza);
			}
			case 'D' ->{
				resultado = dama(posFila, posColumna, pieza);
			}
			case 'C' ->{
				resultado = caballo(posFila, posColumna, pieza);
			}
			default ->{
				System.out.println("Pieza no válida");
			}
		}
		
		/*Creamos un bucle for para mostrar al usuario los movimientos de la pieza*/
		for(int i = 0; i < resultado.length; i++) {
			for(int j = 0; j < resultado[i].length; j++) {
				System.out.print(resultado[i][j] + " ");
			}
			/*Hacemos un salto de linea*/
			System.out.println();
		}
		
		/*Cerramos el Scanner*/
		sc.close();
	}
	
	/*Creamos una funcion para la torre*/
	static char[][] torre(int posFila, int posColumna, char pieza) {
		
		/*Creamos una tabla que sera el tablero de ajedrez*/
		char tablero[][] = new char[8][8];
		
		/*Creamos un bucle for para rellenar el tablero con asteriscos simulando que los asteriscos son una casilla del tablero*/
		for(int i = 0; i < tablero.length; i++) {
			for(int j = 0; j < tablero[i].length; j++) {
				tablero[i][j] = '*';
			}
		}
		
		/*Establecemos la posicion inicial de la torre segun el usuario*/
		tablero[posFila][posColumna] = 'T';
		
		/*Creamos un bucle for para recorrer las filas y columnas de la tabla*/
		for(int i = 0; i < tablero.length; i++) {
			for(int j = 0; j < tablero[i].length; j++) {
				
				/*Creammos un if para dibujar los movimientos de la torre*/
				if(tablero[i][posColumna] == '*') {/*Si la columna donde se encuentra la posicion introducida por el usuario tiene asterisco, cambiarlo por una X*/
					tablero[i][posColumna] = 'X';
					
				} else if (tablero[posFila][j] == '*') { /**Si la fila donde se encuentra la posicion introducida por el usuario tiene asterisco, cambiarlo por una X*/
					tablero[posFila][j] = 'X';
				}
			}
		}
		
		/*Devolvemos el tablero con los movimientos de la torre*/
		return tablero;
	}
	
	/*Creamos una funcion para la alfil*/
	static char[][] alfil(int posFila, int posColumna, char pieza) {
		
		/*Creamos una tabla que sera el tablero de ajedrez*/
		char tablero[][] = new char[8][8];
		
		/*Creamos un bucle for para rellenar el tablero con asteriscos simulando que los asteriscos son una casilla del tablero*/
		for(int i = 0; i < tablero.length; i++) {
			for(int j = 0; j < tablero[i].length; j++) {
				tablero[i][j] = '*';
			}
		}
		
		/*Establecemos la posicion inicial del alfil segun el usuario*/
		tablero[posFila][posColumna] = 'A';
		
		/*Creamos un bucle for para recorrer las filas y las columnas*/
		for(int i = posFila; i < tablero.length; i++) {
			for(int j = 0; j < tablero[i].length; j++) {
				if(tablero[posFila+j][posColumna+j] == '*') {
					tablero[posFila+j][posColumna+j] = 'X';
				} 
			}
			
		}
		
		/*Devolvemos el tablero con los movimientos del alfil*/
		return tablero;
	}
	
	/*Creamos una funcion para la dama*/
	static char[][] dama(int posFila, int posColumna, char pieza) {
		
		/*Creamos una tabla que sera el tablero de ajedrez*/
		char tablero[][] = new char[8][8];
		
		/*Creamos un bucle for para rellenar el tablero con asteriscos simulando que los asteriscos son una casilla del tablero*/
		for(int i = 0; i < tablero.length; i++) {
			for(int j = 0; j < tablero[i].length; j++) {
				tablero[i][j] = '*';
			}
		}
		
		/*Establecemos la posicion inicial de la dama segun el usuario*/
		tablero[posFila][posColumna] = 'D';
		
		/*Devolvemos el tablero con los movimientos de la dama*/
		return tablero;
	}
	
	/*Creamos una funcion para el caballo*/
	static char[][] caballo(int posFila, int posColumna, char pieza) {
		
		/*Creamos una tabla que sera el tablero de ajedrez*/
		char tablero[][] = new char[8][8];
		
		/*Creamos un bucle for para rellenar el tablero con asteriscos simulando que los asteriscos son una casilla del tablero*/
		for(int i = 0; i < tablero.length; i++) {
			for(int j = 0; j < tablero[i].length; j++) {
				tablero[i][j] = '*';
			}
		}
		
		/*Establecemos la posicion inicial del caballo segun el usuario*/
		tablero[posFila][posColumna] = 'C';
		
		/*Devolvemos el tablero con los movimientos del caballo*/
		return tablero;
	}
}
