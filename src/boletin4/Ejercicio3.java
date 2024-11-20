package boletin4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio3 {
	public static void main(String[] args) {
		
		/*Creamos una variable para almacenar la longitud de la tabla*/
		int longitud;
		
		/*Creamos una variable para almacenar el fin*/
		int fin;
		
		/*Creamos una tabla que alamcena el resultado de la funcion*/
		int tablaNumeros[];
		
		/*Creamos un Scanner*/
		Scanner sc = new Scanner(System.in);
		
		/*Pedimos al usuario que introduzca la longitud*/
		System.out.println("Introduce la longitud");
		
		/*Leemos la longitud del usuario*/
		longitud = sc.nextInt();
		
		/*Pedimos al usuario que introduzca el numero del rango*/
		System.out.println("Introduce el fin");
		
		/*Leemos el dato del usuario*/
		fin = sc.nextInt();
		
		/*Llamamos a la funcion*/
		tablaNumeros = rellenaPares(longitud, fin);
		
		/*Mostramos la tabla al usuario*/
		System.out.println(Arrays.toString(tablaNumeros));
		/*Cerramos el Scanner*/
		sc.close();
	}
	
	/*Creamos una funcion*/
	static int[] rellenaPares(int longitud, int fin) {
		
		/*Creamos una tabla donde se almacenan los numeros pares*/
		int tabla[] = new int[longitud];
		
		/*Creamos una variable para almacenar el numero aleatorio*/
		int numAleatorio = 0;
		
		/*Creamos la clase Random*/
		Random rand = new Random();
		
		/*Creamos un bucle for para rellenar la tabla con valores random*/
		for(int i = 0; i < tabla.length; i++) {
			
			/*Creamos un bucle do while para generar numeros mientras que el numero generadono no sea par*/
			do {
				/*Generamos un numero aleatorio*/
				numAleatorio = rand.nextInt(2, fin+1);
				
				/*Creamos un if para que si es par almacenarlo en la tabla*/
				if(numAleatorio % 2 == 0) {
					tabla[i] = numAleatorio;
				}
			} while (numAleatorio % 2 != 0);
		}
		
		/*Ordenamos la tabla*/
		Arrays.sort(tabla);
		
		/*Devolvemos la tabla*/
		return tabla;
	}
}
