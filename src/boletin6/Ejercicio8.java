package boletin6;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio8 {
	public static void main(String[] args) {
		
		/*Creamos una variable que almacene una frase*/
		String frase;
		
		/*Creamos una tabla que almacene las palabras*/
		String palabras[];
		
		/*Creamos un Scanner*/
		Scanner sc = new Scanner(System.in);
		
		/*Pedimos al usuario que introduzca una frase*/
		System.out.println("Introduce una frase");
		
		/*Leemos la frase del usuario*/
		frase = sc.nextLine().toLowerCase();
		
		/*Dividimos la frase en palabras y las almacenamos en la tabla*/
		palabras = frase.split(" ");
		
		/*Ordenamos la tabla*/
		Arrays.sort(palabras);
		
		/*Mostramos la tabla*/
		System.out.println(Arrays.toString(palabras));
		
		/*Cerramos el Scanner*/
		sc.close();
	}
}