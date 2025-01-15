package boletin7;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class Ejercicio5 {
	public static void main(String[] args) {
		
		/*Creamos una variable para almacenar la palabra del usuario*/
		String palabra;
		
		/*Creamos una coleccion para almacenar las palabras*/
		LinkedHashSet<String> palabras = new LinkedHashSet<>();
		
		/*Creamos un Scanner*/
		Scanner sc = new Scanner(System.in);
		
		/*Pedimos al usuario que introduzca una palabra*/
		System.out.println("Introduce una plabra");
		
		/*Leemos la palabra del usuario*/
		palabra = sc.nextLine();
		
		/*Creamos un bucle while para que se repita hasta que se introduzca la palabra fin*/
		while(!palabra.equalsIgnoreCase("fin")) {
			
			/*Almacenamos la palabra en la coleccion*/
			palabras.add(palabra);
			
			/*Pedimos al usuario que introduzca otra palabra*/
			System.out.println("Introduce otra plabra");
			
			/*Leemos la palabra del usuario*/
			palabra = sc.nextLine();
		}
		
		/*Creamos un bucle for each para mostrar al usuario la coleccion*/
		for(String valor : palabras) {	
			System.out.println(valor);
		}
		
		/*Cerramos el Scanner*/
		sc.close();
	}
}