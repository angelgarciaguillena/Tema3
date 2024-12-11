package boletin6;

import java.util.Scanner;

public class Ejercicio5 {
	public static void main(String[] args) {
		
		/*Creamos una variable que almacene la frase entera*/
		String frase = "";
		
		/*Creamos una variable que almacene las palabras*/
		String palabra;
		
		/*Creamos una constante que almacene la palabra que simbolize el fin del programa*/
		final String FINAL = "fin";
		
		/*Creamos un Scanner*/
		Scanner sc = new Scanner(System.in);
		
		/*Pedimos al usuario que introduzca una palabra*/
		System.out.println("Introduce una palabra");
		
		/*Leemos la palabra del usuario*/
		palabra = sc.nextLine();
		
		/*Creamos un bucle while para almacenar las palabras introducidas por el usuario*/
		while(!palabra.equalsIgnoreCase(FINAL)) {
			
			/*Almacenamos la palabra en la frase*/
			frase += palabra + " ";
			
			/*Pedimos al usuario que introduzca una palabra*/
			System.out.println("Introduce una palabra");
			
			/*Leemos la palabra del usuario*/
			palabra = sc.nextLine();
		}
		
		/*Mostramos la frase al usuario*/
		System.out.println(frase);
		
		/*Cerramos el Scanner*/
		sc.close();
	}
}