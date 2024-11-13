package boletin3;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio3 {
	public static void main(String[] args) {
		
		/*Creamos una tabla*/
		int tabla[][];
		
		/*Creamos una variable para almacenar el numero de filas*/
		int filas;
		
		/*Creamos una variable para almacenar el numero de columnas*/
		int columnas;
		
		/*Creamos el Scanner*/
		Scanner sc = new Scanner(System.in);
		
		/*Pedimos al usuario que introduzca el numero de filas*/
		System.out.println("Introduce el numero de filas:");
		
		/*Leemos el numero de filas introducido por el usuario*/
		filas = sc.nextInt();
		
		/*Pedimos al usuario que introduzca el numero de columnas*/
		System.out.println("Introduce el numero de filas:");
		
		/*Leemos el numero de columnas introducido por el usuario*/
		columnas = sc.nextInt();
		
		/*Introducimos el numero de filas y columnas en la tabla*/
		tabla = new int [filas][columnas];
		
		/*Creamos un bucle for para rellenar la tabla*/
		for(int i = 0; i < tabla.length; i++) {
			for (int j = 0; j < tabla[i].length; j++) {
				tabla [i][j] = 10 * i + j;
			}
		}
		
		/*Creamos un bucle for para mostramos la tabla al usuario*/
		for(int i = 0; i < tabla.length; i++) {
			System.out.println(Arrays.toString(tabla[i]));
		}
		
		/*Cerramos el Scanner*/
		sc.close();
	}
}