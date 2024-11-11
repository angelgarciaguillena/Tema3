package boletin2;

import java.util.Arrays;

import java.util.Scanner;

public class Ejercicio4 {
	public static void main(String[] args) {
		
		/*Creamos una tabla para guardar las puntuaciones*/
		int puntuaciones[] = new int[8];
		
		/*Creamos una variable para indicar el numero del puesto*/
		int puesto = 1;
		
		/*Creamos un Scanner*/
		Scanner sc = new Scanner(System.in);
		
		/*Creamos un for para que el usuario introduzca las puntuaciones de los 8 jugadores y almacenarlos en la tabla*/
		for(int i = 0; i < puntuaciones.length; i++) {
			System.out.println("Puntuacion del jugador " + (i+1) + ":");
			puntuaciones[i] = sc.nextInt();
		}		
		
		/*Ordenamos las puntuaciones almacenadas en la tabla de menor a mayor*/
		Arrays.sort(puntuaciones);
		
		/*Creamos un bucle for para mostrar las puntuaciones de mayor a menor*/
		for (int i = 7; i >= 0; i--) {
			System.out.println("Puesto " + (puesto++) + ": " + puntuaciones[i]);
		}
		
		/*Cerramos el Scanner*/
		sc.close();
	}
}