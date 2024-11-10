package boletin2;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Ejercicio4 {
	public static void main(String[] args) {
		
		/*Creamos una tabla para guardar las puntuaciones*/
		Integer puntuaciones[] = new Integer[8];
		
		/*Creamos un Scanner*/
		Scanner sc = new Scanner(System.in);
		
		/*Creamos un for para que el usuario introduzca las puntuaciones de los 8 jugadores y almacenarlos en la tabla*/
		for(int i = 0; i < puntuaciones.length; i++) {
			System.out.println("Puntuacion del jugador " + (i+1) + ":");
			puntuaciones[i] = sc.nextInt();
		}		
		
		/*Ordenamos las puntuaciones almacenadas en la tabla de mayor a menor*/
		Arrays.sort(puntuaciones, Collections.reverseOrder());
		
		/*Creamos un for para mostrar al usuario la tabla con las puntuaciones ordenadas*/
		for(int i = 0; i < puntuaciones.length; i++) {
			System.out.println("Puesto " + (i+1) + ": " + puntuaciones[i]);
		}
		
		/*Cerramos el Scanner*/
		sc.close();
	}
}