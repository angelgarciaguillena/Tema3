package boletin2;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio1 {
	public static void main(String[] args) {
		
		/*Creamos una variable para almacenar el tamaño*/
		int tamaño;
		
		/*Creamos una variable para almacenar el valor*/
		int valor;
		
		/*Creamos una tabla*/
		int tabla[];
		
		/*Creamos un Scanner*/
		Scanner sc = new Scanner(System.in);
		
		/*Pedimos al usuario que introduzca el tamaño*/
		System.out.println("Introduce el tamaño:");
		
		/*Leemos el tamaño introducido por el usuario*/
		tamaño = sc.nextInt();
		
		/*Pedimos al usuario que introduzca el valor*/
		System.out.println("Introduce el valor:");
		
		/*Leemos el tamaño introducido por el usuario*/
		valor = sc.nextInt();
		
		/*Indicamos el tamaño de la tabla*/
		tabla = new int[tamaño];
		
		/*Creamos un fill para inicializar el valor introducido por el usuario en la tabla*/
		Arrays.fill(tabla, valor);
		
		/*Mostramos la tabla al usuario*/
		System.out.println(Arrays.toString(tabla));
		
		/*Cerramos el Scanner*/
		sc.close();
	}
}
