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
				if(tablero[i][posColumna] == '*') {/*Si la columna donde se encuentra la posicion introducida por el usuario tiene asterisco, cambiarlo por una X en cada fila*/
					tablero[i][posColumna] = 'X';
					
				} else if (tablero[posFila][j] == '*') { /*Si la fila donde se encuentra la posicion introducida por el usuario tiene asterisco, cambiarlo por una X en cada columna*/
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
		
		/*Creamos una variable que nos servira como contador*/
		int contador = 0;
		
		/*Creamos un bucle for para rellenar el tablero con asteriscos simulando que los asteriscos son una casilla del tablero*/
		for(int i = 0; i < tablero.length; i++) {
			for(int j = 0; j < tablero[i].length; j++) {
				tablero[i][j] = '*';
			}
		}
		
		/*Establecemos la posicion inicial del alfil segun el usuario*/
		tablero[posFila][posColumna] = 'A';
		
		/*Creamos un bucle for para recorrer las filas y las columnas y trazar los movimientos en la parte inferior de la pieza*/
		for(int i = posFila; i < tablero.length; i++) {
			for(int j = 0; j < tablero[i].length; j++) {
				
				if(j != posColumna) { /*Si j es diferente a la posicion de la columna*/
					
					if(j == (posColumna - contador) || j == (posColumna + contador)) {/*Si j es igual a posicion de la columna menos el contador guardar X o Si j es igual a posicion de la columna mas el contador guardar X*/
						tablero[i][j] = 'X';
					} 
				}
			}
			/*Sumo 1 al contador*/
			contador++;	
		}
		
		/*Reiniciamos el contador*/
		contador = 0;
		
		/*Creamos un bucle for para recorrer las filas y las columnas y trazar los movimientos en la parte superior de la pieza*/
		for(int i = posFila; i >= 0; i--) {
			for(int j = 0; j < tablero[i].length; j++) {
				
				if(j != posColumna) { /*Si j es diferente a la posicion de la columna*/
					
					if(j == (posColumna - contador) || j == (posColumna + contador)) {/*Si j es igual a posicion de la columna menos el contador guardar X o Si j es igual a posicion de la columna mas el contador guardar X*/
						tablero[i][j] = 'X';
					}
				}
			}
			/*Sumo 1 al contador*/
			contador++;	
		}
		
		/*Devolvemos el tablero con los movimientos del alfil*/
		return tablero;
	}
	
	/*Creamos una funcion para la dama*/
	static char[][] dama(int posFila, int posColumna, char pieza) {
		
		/*Creamos una tabla que sera el tablero de ajedrez*/
		char tablero[][] = new char[8][8];
		
		/*Creamos una variable que nos servira como contador*/
		int contador = 0;
		
		/*Creamos un bucle for para rellenar el tablero con asteriscos simulando que los asteriscos son una casilla del tablero*/
		for(int i = 0; i < tablero.length; i++) {
			for(int j = 0; j < tablero[i].length; j++) {
				tablero[i][j] = '*';
			}
		}
		
		/*Establecemos la posicion inicial de la dama segun el usuario*/
		tablero[posFila][posColumna] = 'D';
		
		/*Creamos un bucle for para recorrer las filas y columnas y indicar los movimientos de la dama como torre con una X*/
		for(int i = 0; i < tablero.length; i++) {
			for(int j = 0; j < tablero[i].length; j++) {
				
				if(tablero[i][posColumna] == '*') { /*Si la columna donde se encuentra la posicion introducida por el usuario tiene asterisco, cambiarlo por una X en cada fila*/
					tablero[i][posColumna] = 'X';
					
				} else if(tablero[posFila][j] == '*') { /*Si la fila donde se encuentra la posicion introducida por el usuario tiene asterisco, cambiarlo por una X en cada columna*/
					tablero[posFila][j] = 'X';
				}
			}
		}
		
		/*Creamos un bucle for para recorrer las filas y columnas y indicar los movimientos de la dama como alfil en la parte superior*/
		for(int i = posFila; i >= 0; i--) {
			for(int j = 0; j < tablero[i].length; j++) {
				
				if(j != posColumna) { /*Si j es diferente a la posicion de la columna*/
					
					if(j == (posColumna - contador) || j == (posColumna + contador)) { /*Si j es igual a posicion de la columna menos el contador guardar X o Si j es igual a posicion de la columna mas el contador guardar X*/
						tablero[i][j] = 'X';
					} 
				}
			}
			/*Sumamos 1 al contador*/
			contador++;
		}
		
		/*Reiniciamos el contador*/
		contador = 0;
		
		/*Creamos un bucle for para recorrer las filas y columnas y indicar los movimienos de la dama como alfil en la parte inferior*/
		for(int i = posFila; i < tablero.length; i++) {
			for(int j = 0; j < tablero[i].length; j++) {
				
				if(j != posColumna) { /*Si j es diferente a la posicion de la columna*/
					
					if(j == (posColumna - contador) || j == (posColumna + contador)) { /*Si j es igual a posicion de la columna menos el contador guardar X o Si j es igual a posicion de la columna mas el contador guardar X*/
						tablero[i][j] = 'X';
					}
				}
			}
			/*Sumamos 1 al contador*/
			contador++;
		}
		
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
		
		/*Creamos un bucle for para recorrer las filas y columnas y trazar los movimientos del caballo en la parte superior*/
		for(int i = posFila; i >= 0; i--) {
			for(int j = 0; j < tablero[i].length; j++) {
				
				if((i == posFila - 1 && j == posColumna + 2) || (i == posFila - 2 && j == posColumna + 1)) { //Si la i es igual a la posicion de la fila menos 1 y j es igual a la posicion de la columna mas 2 
					tablero[i][j] = 'X';																	 //o Si i es igual a la posicion de la fila menos 2 y j es igual a la posicion de la columna mas 1*/
					
				} else if((i == posFila - 1 && j == posColumna - 2) || (i == posFila - 2 && j == posColumna -1)) { //Si la i es igual a la posicion de la fila menos 1 y j es igual a la posicion de la columna menos 2 
					tablero[i][j] = 'X';																		   //o Si i es igual a la posicion de la fila menos 2 y j es igual a la posicion de la columna mas 1*/
					
				}
			}
		}
		
		/*Creamos un bucle for para recorrer las filas y columnas y trazar los movimientos del caballo en la parte inferior*/
		for(int i = posFila; i < tablero.length; i++) {
			for(int j = 0; j < tablero[i].length; j++) {
				
				if((i == posFila + 1 && j == posColumna + 2) || (i == posFila + 2 && j == posColumna + 1)) { //Si la i es igual a la posicion de la fila mas 1 y j es igual a la posicion de la columna mas 2 
					tablero[i][j] = 'X';																	 //o Si i es igual a la posicion de la fila mas 2 y j es igual a la posicion de la columna mas 1*/
					
				} else if((i == posFila + 1 && j == posColumna - 2) || (i == posFila + 2 && j == posColumna -1)) { //Si la i es igual a la posicion de la fila mas 1 y j es igual a la posicion de la columna menos 2 
					tablero[i][j] = 'X';																		   //o Si i es igual a la posicion de la fila mas 2 y j es igual a la posicion de la columna mas 1*/
					
				}
			}
		}
		
		/*Devolvemos el tablero con los movimientos del caballo*/
		return tablero;
	}
}