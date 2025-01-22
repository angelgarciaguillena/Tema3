package examenes;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class BuscaMinas2 {
	
	/*Creamos el tablero solucion y el tablero del jugador*/
	static char tableroSolucion[][] = new char[5][5];
	static char tableroJugador[][] = new char[5][5];
	
	/*Creamos el Scanner*/
	static Scanner sc = new Scanner(System.in);
	
	/*Creamos la clase Random*/
	static Random rand = new Random();
	
	public static void main(String[] args) {
		
		/*Creamos una variable para contar cuantas casillas se han desbloqueado*/
		int contadorCasillas = 0;
		
		/*Creamos una variable para almacenar la posicion de la fila introducida por el usuario*/
		int posFila = 0;
		
		/*Creamos una variable para almacenar la posicion de la fila introducida por el usuario*/
		int posColumna = 0;
		
		/*Creamos una variable para almacenar si se comete un error*/
		boolean error;
		
		/*Inicializamos los tableros llamando a la funcion*/
		inicializaTableros();
		
		/*Pintamos el tablero con la solucion llamando a la funcion*/
		pintarTableroSolucion();
		
		
		
		/*Creamos un bucle while para que se sigan mostrando casillas hasta que toque una mina o muestre todas las casillas que no tengan minas*/
		do {
			
			/*Creamos un bucle do while para que mientras la casilla se haya rellenado volver a pedir de nuevo al usuario*/
			do {
				
				/*Creamos un bucle do while para que se repita hasta que la posicion sea valida*/
				do {
					
					/*Creamos un try catch para notificar al usuario de los errores que pueda cometer*/
					try {
						
						/*Pedimos al usuario que introduzca una posicion de fila*/
						System.out.println("Introduce una posicion de fila");
						
						/*leemos la posicion de fila del usuario*/
						posFila = sc.nextInt();
						
						/*Creamos un assert para notificar al usuario en caso de que el valor se salga fuera del rango*/
						assert posFila >= 0 && posFila <= 4 : "Error: El numero introducido no se encuentra dentro del rango del tablero (0-4)";
						
						/*Asignamos que el error es falso*/
						error = false;
						
					/*Si se produce el siguiente error*/
					} catch(AssertionError e) {
						
						/*Mostramos el error al usuario*/
						System.err.println(e.getMessage());
						
						/*Asignamos que existe un error*/
						error = true;
						
					/*Si se produce el siguiente error*/	
					} catch(InputMismatchException e) {
						
						/*Mostramos el error al usuario*/
						System.err.println("Error: No has introducido un numero entero");
						
						/*Asignamos que existe un error*/
						error = true;
					} finally {
						sc.nextLine();
					}
				} while(error);
				
				/*Creamos un bucle do while para que se repita hasta que la posicion sea valida*/
				do {
					
					/*Creamos un try catch para notificar al usuario de los errores que pueda cometer*/
					try {
						
						/*Pedimos al usuario que introduzca una posicion de columna*/
						System.out.println("Introduce una posicion de columna");
						
						/*leemos la posicion de columna del usuario*/
						posColumna = sc.nextInt();
						
						/*Creamos un assert para notificar al usuario en caso de que el valor se salga fuera del rango*/
						assert posColumna >= 0 && posColumna <= 4 : "Error: El numero introducido no se encuentra dentro del rango del tablero (0-4)";
						
						/*Asignamos que el error es falso*/
						error = false;
						
					/*Si se produce el siguiente error*/
					} catch(AssertionError e) {
						
						/*Mostramos el error al usuario*/
						System.err.println(e.getMessage());
						
						/*Asignamos que existe un error*/
						error = true;
					
					/*Si se produce el siguiente error*/
					} catch(InputMismatchException e) {
						
						/*Mostramos el error al usuario*/
						System.err.println("Error: No has introducido un numero entero");
						
						/*Asignamos que existe un error*/
						error = true;
					} finally {
						sc.nextLine();
					}
				} while(error);
				
				/*Si ya se ha introducido esa casilla mostramos un mensaje al usuario pidiendo que introduzca otra*/
				if(tableroJugador[posFila][posColumna] != 'X') {
					System.out.println("Esa posicion ya habia sido introducida antes, introduce otra");
				}
			} while(tableroJugador[posFila][posColumna] != 'X');
			
			/*Almacenamos la casilla en el tablero jugador*/
			tableroJugador[posFila][posColumna] = tableroSolucion[posFila][posColumna];
					
			/*Mostramos el tablero al jugador*/
			mostrarTableroJugador();
					
			/*Sumamos 1 al contador de casillas*/
			contadorCasillas++;
					
		} while(contadorCasillas < 19 && tableroJugador[posFila][posColumna] != '*');
		
		/*Si el contador es menor a 19 habra encontrado una mina sino habra ganado*/
		if(contadorCasillas < 19) {
			System.out.println("Has encontrado una mina. Has perdido");
		} else {
			System.out.println("Has ganado el juego");
		}
		
		/*Mostramos al usuario un mensaje de que el juego ha terminado*/
		System.out.println("Fin del juego");
		
		/*Cerramos el Scanner*/
		sc.close();
	}
	
	/*Creamos una funcion para inicializar el tablero del jugador*/
	static void inicializaTableros(){
		
		/*Creamos un bucle for para inicializar el tablero del jugador*/
		for(int i = 0; i < tableroJugador.length; i++) {
			Arrays.fill(tableroJugador[i], 'X');
		}
		
		/*Creamos un bucle for para inicializar el tablero solucion*/
		for(int i = 0; i < tableroSolucion.length; i++) {
			Arrays.fill(tableroSolucion[i], 'X');
		}
		
	}
	
	/*Creamos una funcion que se encarge de generar las minas y pintar el numero de minas que hay alrededor de la casilla*/
	static void pintarTableroSolucion() {
		
		/*Creamos una variable para almacenar la posicion de la fila de la mina*/
		int posFilaMina = 0;
		
		/*Creamos una variable para almacenar la posicion de la columna de la mina*/
		int posColumnaMina = 0;
		
		/*Creamos una variable que nos servira como contador*/
		int contador = 0;
		
		/*Creamos una variable contador para que almacene cuantas minas se encuentran alrededor de la casilla*/
		int contadorMinas = 0;
		
		/*Creamos un bucle while para colocar las minas en posiciones aleatorias del tablero*/
		while(contador < 6) {
			
			/*Generamos una posicion aleatoria de las minas*/
			posFilaMina = rand.nextInt(0, tableroSolucion.length);
			posColumnaMina = rand.nextInt(0, tableroSolucion.length);
			
			/*Si en la posicion de la mina no hay ninguna otra mina sumar 1 al contador de minas introducidas y almacenar la mina*/
			if(tableroSolucion[posFilaMina][posColumnaMina] == 'X') {
				tableroSolucion[posFilaMina][posColumnaMina] = '*';
				contador++;
			}
		}
		
		/*Creamos un bucle for anidado para recorrer todo el tablero*/
		for(int i = 0; i < tableroSolucion.length; i++) {
			for(int j = 0; j < tableroSolucion[i].length; j++) {
				
				/*Si la casilla no tiene una mina*/
				if(tableroSolucion[i][j] != '*') {
					
					/*Si la mina se encuentra en una de las casillas de alrededor sumar 1 al contador*/
					
					/*Casilla arriba izquierda*/
					if(i > 0 && j > 0 && tableroSolucion[i-1][j-1] == '*') { 
						contadorMinas++;
					}
					
					/*Casilla arriba*/
					if(i > 0  && tableroSolucion[i-1][j] == '*') { 
						contadorMinas++;
					} 
					
					/*Casilla arriba derecha*/
					if(i > 0 && j < tableroSolucion.length-1 && tableroSolucion[i-1][j+1] == '*') { 
						contadorMinas++;
					} 
					
					/*Casilla central izquierda*/
					if(j > 0 && tableroSolucion[i][j-1] == '*') { 
						contadorMinas++;
					} 
					
					/*Casilla central derecha*/
					if(j < tableroSolucion.length-1 && tableroSolucion[i][j+1] == '*') { 
						contadorMinas++;
					}  
					
					/*Casilla abajo izquierda*/
					if(i < tableroSolucion.length-1 && j > 0 && tableroSolucion[i+1][j-1] == '*') { 
						contadorMinas++;
					} 
					
					/*Casilla abajo*/
					if(i < tableroSolucion.length-1  && tableroSolucion[i+1][j] == '*') { 
						contadorMinas++;
					} 
					
					/*Casilla abajo derecha*/
					if(i < tableroSolucion.length-1 && j < tableroSolucion.length-1 && tableroSolucion[i+1][j+1] == '*') {  
						contadorMinas++;
					} 
					
					/*Almacenamos en la casilla cuantas minas hay alrededor*/
					tableroSolucion[i][j] = (char) (contadorMinas + '0');
				
					/*Reiniciamos el contador*/
					contadorMinas = 0;
				}
			}
		}
	}
	
	/*Creamos una funcion para mostrar el tablero del jugador*/
	static void mostrarTableroJugador() {
		
		/*Notificamos al usuaio de lo que se muestra*/
		System.out.println("Tablero:");
		
		/*Creamos un bucle for anidado para recorrer el tablero del jugador*/
		for(int i = 0; i < tableroJugador.length; i++) {
			for(int j = 0; j < tableroJugador[i].length; j++) {
				System.out.print(tableroJugador[i][j] + "\t");
			}
			
			/*Hacemos un salto de linea*/
			System.out.println();
		}
	}
}