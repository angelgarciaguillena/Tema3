package boletin6;

import java.util.Scanner;

public class Ejercicio13 {
	public static void main(String[] args) {
		
		/*Creamos una variable para almacenar la primera palabra del usuario*/
		String palabra1;
		
		/*Creamos una variable para almacenar la segunda palabra del usuario*/
		String palabra2;
		
		/*Creamos una variable para almacenar el resultado del programa*/
		boolean resultado;
		
		/*Creamos un Scanner*/
		Scanner sc = new Scanner(System.in);
		
		/*Pedimos al usuario que introduzca la primera palabra*/
		System.out.println("Introduce una palabra");
		
		/*Leemos la primera palabra del usuario*/
		palabra1 = sc.nextLine();
		
		/*Pedimos al usuario que introduzca la segunda palabra*/
		System.out.println("Introduce otra palabra");
		
		/*Leemos la segunda palabra del usuario*/
		palabra2 = sc.nextLine();
		
		/*Llamamos a la funcion*/
		resultado = sonAnagramas(palabra1, palabra2);
		
		/*Mostramos al usuario el resultado del programa*/
		System.out.println(resultado ? "Las palabras son anagramas" : "Las palabras no son anagramas");
		
		/*Cerramos el Scanner*/
		sc.close();
	}
	
	/*Creamos una funcion para comprobar si las dos palabras son anagramas*/
	static boolean sonAnagramas (String palabra1, String palabra2) {
		
		/*Creamos una variable para almacenar si son anagramas*/
		boolean anagrama = true;
		
		/*Creamos un array para almacenar las letras*/
		int palabra[] = new int[palabra1.length()];
		
		/*Creamos un bucle for para almacenar la primera palabra*/
		for(int i = 0; i < palabra1.length(); i++) {
			palabra[i] = palabra1.charAt(i);
		}
		
		/*Devolvemos si es una anagrama*/
		return anagrama;
	}
}
