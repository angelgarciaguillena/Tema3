package boletin5;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio2 {
	public static void main(String[] args) {
		
		/*Creamos una tabla y almacenamos numeros*/
		int tabla[] = new int[5];
		
		/*Creamos una tabla que almacena el resultado*/
		int resultado[] = new int[5];
		
		/*Creamos un Scanner*/
		Scanner sc = new Scanner(System.in);
		
		/*Creamos un bucle for para rellenar la tabla con los numeros introducidos por el usuario*/
		for(int i = 0; i < tabla.length; i++) {
			System.out.println("Introduce un valor");
			tabla[i] = sc.nextInt();
		}
		
		/*Mostramos la tabla al usuario*/
		System.out.println(Arrays.toString(tabla));
		
		/*Llamamos a la funcion*/
		resultado = desordenar(tabla);
		
		/*Mostramos la tabla desordenada al usuario*/
		System.out.println(Arrays.toString(tabla));
		
		/*Cerramos el Scanner*/
		sc.close();
	}
	
	/*Creamos una funcion*/
	static int[] desordenar(int tabla[]) {
		
		/*Creamos una variable que almacene la posicion aleatorio*/
		int posicion;
		
		/*Creamos una variable para almacenar el valor que se intercambia*/
		int valor; 
		
		/*Creamos la clase Random*/
		Random rand = new Random();
		
		/*Creamos un bucle for para desordenar la tabla*/
		for(int i = 0; i < tabla.length; i++) {
			
			/*Generamos una posicion aleatoria*/
			posicion = rand.nextInt(0, 5);
			
			/*Guardamos el valor de la posicion normal*/
			valor = tabla[i];
			
			/*Cambiamos el valor de la posicion por el valor de la posicion aleatoria*/
			tabla[i] = tabla[posicion];
			
			/*Almacenamos el valor que hemos sustraido de la posicion normal a la posicion aleatoria*/
			tabla[posicion] = valor;
		}
		
		/*Devolvemos la tabla*/
		return tabla;
	}
}