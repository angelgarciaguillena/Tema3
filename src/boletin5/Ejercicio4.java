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
				
			}
			case 'A' ->{
				
			}
			case 'D' ->{
				
			}
			case 'C' ->{
				
			}
		}
		
		/*Cerramos el Scanner*/
		sc.close();
	}
	
	/*Creamos una funcion*/
	
}
