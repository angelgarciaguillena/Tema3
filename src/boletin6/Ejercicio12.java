package boletin6;

import java.util.Scanner;

public class Ejercicio12 {
	public static void main(String[] args) {
		
		/*Creamos una variable para almacenar la frase*/
		String frase;
		
		/*Creamos una variable para almacenar la ultima palabra*/
		String ultimaPalabra = "";
		
		/*Creamos una variable para guardar la palabra siguiente*/
		String palabraContinuacion = "";
		
		/*Creamos un Scanner*/
		Scanner sc = new Scanner(System.in);
		
		/*Pedimos al usuario que introduzca una frase*/
		System.out.println("Introduce una frase");
		
		/*Leemos la frase del usuario*/
		frase = sc.nextLine();
		
		/*Creamos un bucle for para recorrer la frase*/
		for(int i = 0; i < frase.length(); i++) {
			
			/*Creamos un if para que si el caracter es igual a un espacio en blanco reiniciar la variable*/
			if(frase.charAt(i) == ' ') {
				palabraContinuacion = "";
			}
			
			/*Creamos un if para que si es diferente a espacio almacenarlo cada caracter en la variable*/
			if(frase.charAt(i) != ' ') {
				palabraContinuacion += frase.charAt(i);
			}
			
			/*Creamos un if para que si la nueva palabra es mayor a la anterior almacenarla*/
			if(palabraContinuacion.length() > ultimaPalabra.length()) {
				ultimaPalabra = palabraContinuacion;
			}
		}
		
		/*Mostramos al usuario la palabra mas larga y el numero de caracteres que tiene*/
		System.out.println("La palabra más larga de la frase es '" + ultimaPalabra + "'" + " y tiene " + ultimaPalabra.length() + " caracteres");
		
		/*Cerramos el Scanner*/
		sc.close();
	}
}