package examenes;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class BuscaMinas {
	
	/*Creamos el Scanner*/
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		/*Creamos una variable para almacenar la posicion a revelar*/
		int posicion = 0;
		
		/*Creamos una variable que nos sirva como contador*/
		int contador = 0;
		
		/*Creamos una variable para almacenar si hay un error*/
		boolean error;
		
		/*Creamos una tabla para almacenar el tablero de solucion*/
		String tableroSolucion[] = new String[20];
		
		/*Creamos una tabla para almacenar el tablero del jugador*/
		String tableroJugador[] = new String[20];
		
		/*Llamamos a la funcion*/
		tableroSolucion = pintarTableroSolucion();
		
		/*Llamamos a la funcion*/
		tableroJugador = pintarTableroUsuario();
		
		/*Creamos un bucle do while para que si se produce el error volver a repetir*/
		do{
			/*Creamos un try catch para notificar del error al usuario en caso de haberlo*/
			try {
				/*Pedimos al usuario que introduzca una posicion*/
				System.out.println("Introduce una posicion");
				
				/*Leemos la posicion del usuario*/
				posicion = sc.nextInt();
				
				/*Creamos un assert para notificar al usuario si se ha salido fuera del rango posible*/
				assert posicion >= 0 && posicion <= tableroJugador.length : "Error: El numero introducido se ha salido fuera del rango";
				
				/*Asignamos que error es falso*/
				error = false;
				
			/*Si el dato introducido no es el correcto*/
			} catch(InputMismatchException e) {
				
				/*Mostramos un mensaje al usuario*/
				System.err.println("Error: Introdue un numero entero");
				
				/*Asignamos que error es verdadero*/
				error = true;
				
			/*Si el dato introducido se sale del rango del tablero*/
			} catch(AssertionError e) {
				
				/*Mostramos un mensaje al usuario del error*/
				System.err.println(e.getMessage());
				
				/*Asignamos que error es verdadero*/
				error = true;
				
			/*Creamos un finally para que se vacie el campo aunque se produzca un error*/
			} finally {
				sc.nextLine();
			}
		} while(error);
		
		
		/*ELIMINAR*/
		System.out.println(Arrays.toString(tableroSolucion));
		
		/*Creamos un bucle while para que mientras que no falle o no acierte todas las minas el jugador siga jugando*/
		while(!tableroSolucion[posicion].equals("*") && contador < 14) {
			
			/*Almacenamos en la tabla del usuario la casilla seleccionada*/
			tableroJugador[posicion] = tableroSolucion[posicion];
			
			/*Mostramos el tablero al usuario*/
			System.out.println(Arrays.toString(tableroJugador));
			
			/*Sumamos 1 al contador de aciertos*/
			contador++;
			/*Creamos un bucle do while para que si se produce el error volver a repetir*/
			do{
				/*Creamos un try catch para notificar del error al usuario en caso de haberlo*/
				try {
					/*Pedimos al usuario que introduzca una posicion*/
					System.out.println("Introduce otra posicion");
					
					/*Leemos la posicion del usuario*/
					posicion = sc.nextInt();
					
					/*Creamos un assert para notificar al usuario si se ha salido fuera del rango posible*/
					assert posicion >= 0 && posicion < tableroJugador.length : "Error: El numero introducido se ha salido fuera del rango";
					
					/*Asignamos que error es falso*/
					error = false;
					
				/*Si el dato introducido no es el correcto*/
				} catch(InputMismatchException e) {
					
					/*Mostramos un mensaje al usuario*/
					System.err.println("Error: Introdue un numero entero");
					
					/*Asignamos que error es verdadero*/
					error = true;
					
				/*Si el dato introducido se sale del rango del tablero*/
				} catch(AssertionError e) {
					
					/*Mostramos un mensaje al usuario del error*/
					System.err.println(e.getMessage());
					
					/*Asignamos que error es verdadero*/
					error = true;
					
				/*Creamos un finally para que se vacie el campo aunque se produzca un error*/
				} finally {
					sc.nextLine();
				}
			} while(error);
			
			
		}
		
		/*Almacenamos en la tabla del usuario la casilla seleccionada*/
		tableroJugador[posicion] = tableroSolucion[posicion];
		
		/*Mostramos el tablero al usuario*/
		System.out.println(Arrays.toString(tableroJugador));
		
		/*Mostramos un mensaje de final de programa al usuaio*/
		System.out.println(contador < 14 ? "Te has comido una mina. Fin del juego" : "Enhorabuena, has completado el juego");
		
		/*Cerramos el Scanner*/
		sc.close();
	}
	
	/*Creamos una funcion para pintar el tablero y almacenar los numeros*/
	static String[] pintarTableroSolucion() {
		
		/*Creamos una variable para almacenar la posicion aleatoria de las minas*/
		int posicionMinas;
		
		/*Creamos una variable que nos servira como contador*/
		int contadorMinas = 0;
		
		/*Creamos una tabla para almacenar los numeros y las minas*/
		String tablero[] = new String[20];
		
		/*Creamos la clase Random*/
		Random rand = new Random();
		
		/*Inicializamos la tabla entera con 0*/
		Arrays.fill(tablero, "0");
		
		/*Creamos un bucle for para introducir las minas en el tablero*/
		while(contadorMinas < 6) {
			
			/*Generamos una posicion aleatoria de las minas*/
			posicionMinas = rand.nextInt(0, 20);
			
			/*Si en la posicion de la tabla no hay una mina almacenarla y sumar 1 al contador de minas*/
			if(!tablero[posicionMinas].equalsIgnoreCase("*")) {
				tablero[posicionMinas] = "*";
				contadorMinas++;
			} 
		}
		
		/*Creamos un bucle for para recorrer la tabla*/
		for(int j = 0; j < tablero.length; j++) {
			
			/*Si j es 0 si la posicion siguiente es una mina poner 1*/
			if(j == 0) {
				if(tablero[j+1].equalsIgnoreCase("*") && !tablero[j].equalsIgnoreCase("*")) {
					tablero[j] = "1";
				} 
			/*Si j es el final de la tabla si la posicion anterior es una mina poner 1*/
			} else if(j == tablero.length-1){
				if(tablero[j-1].equalsIgnoreCase("*") && !tablero[j].equalsIgnoreCase("*")) {
					tablero[j] = "1";
				} 
			} else {
				
				/*Si la posicion anterior o la siguiente es una mina poner un 1 pero si las dos tienen minas poner un 2*/
				if(tablero[j-1].equalsIgnoreCase("*")  && tablero[j+1].equalsIgnoreCase("*") && !tablero[j].equalsIgnoreCase("*")) {
					tablero[j] = "2";
				} else if((tablero[j-1].equalsIgnoreCase("*")  || tablero[j+1].equalsIgnoreCase("*")) && !tablero[j].equalsIgnoreCase("*")) {
					tablero[j] = "1";
				}
			}
		}
		
		/*Devolvemos el tablero*/
		return tablero;
	}
	
	/*Creamos una funcion para pintar el tablero del usuario*/
	static String[] pintarTableroUsuario() {
		
		/*Creamos una tabla para almacenar el tablero del usuario*/
		String tableroJuego[] = new String[20];
		
		/*Inicializamos el tablero con x*/
		Arrays.fill(tableroJuego, "X");
		
		/*Devolvemos el tablero del usuario*/
		return tableroJuego;
	}
}