package boletin7;

import java.util.Scanner;
import java.util.TreeSet;

public class Ejercicio6 {
	public static void main(String[] args) {
		
		/*Creamos una variable que almacene el nombre del usuario*/
		String palabra;
		
		/*Creamos una coleccion para almacenar las palabras*/
		TreeSet<String> palabras = new TreeSet<>();
		
		/*Creamos el Scanner*/
		Scanner sc = new Scanner(System.in);
		
		/*Pedimos al usuario que introduzca una palabra*/
		System.out.println("Introduce una palabra");
		
		/*Leemos la palabra del usuario*/
		palabra = sc.nextLine();
		
		/*Creamos un bucle while para que mientras la palabra no sea igual a fin seguir pidiendo al usuario palabras*/
		while(!palabra.equalsIgnoreCase("fin")) {
			
			/*Añadimos las palabras a la coleccion*/
			palabras.add(palabra);
			
			/*Pedimos al usuario que introduzca otra palabra*/
			System.out.println("Introduce otra palabra");
			
			/*Leemos la palabra del usuario*/
			palabra = sc.nextLine();
		}
		
		/*Creamos un bucle for each para mostrar al usuario las palabras introducidas*/
		for(String valor : palabras) {
			System.out.print(valor + ", ");
		}
		
		/*Cerramos el Scanner*/
		sc.close();
	}
}