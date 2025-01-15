package examenes;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class BuscaMinas {
	
	/*Creamos el Scanner*/
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		/*Creamos una variable para almacenar la posicion a revelar*/
		int posicion;
		
		/*Creamos una variable que nos sirva como contador*/
		int contador = 0;
		
		/*Creamos una tabla para almacenar el tablero de solucion*/
		String tableroSolucion[] = new String[20];
		
		/*Creamos una tabla para almacenar el tablero del jugador*/
		String tableroJugador[] = new String[20];
		
		/*Llamamos a la funcion*/
		tableroSolucion = pintarTableroSolucion();
		
		/*Llamamos a la funcion*/
		tableroJugador = pintarTableroUsuario();
		
		/*Pedimos al usuario que introduzca una posicion*/
		System.out.println("Introduce una posicion");
		
		/*Leemos la posicion del usuario*/
		posicion = sc.nextInt();
		
		/*Eliminar*/
		System.out.println(Arrays.toString(tableroSolucion));
		
		/*Creamos un bucle while para que mientras que no falle o no acierte todas las minas el jugador siga jugando*/
		while(!tableroSolucion[posicion].equals("*") && contador < 14) {
			
			/*Almacenamos en la tabla del usuario la casilla seleccionada*/
			tableroJugador[posicion] = tableroSolucion[posicion];
			
			/*Mostramos el tablero al usuario*/
			System.out.println(Arrays.toString(tableroJugador));
			
			/*Sumamos 1 al contador de aciertos*/
			contador++;
			
			/*Pedimos al usuario que introduzca una posicion*/
			System.out.println("Introduce otra posicion");
			
			/*Leemos la posicion del usuario*/
			posicion = sc.nextInt();
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