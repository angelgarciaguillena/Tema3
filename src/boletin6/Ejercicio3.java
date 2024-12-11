package boletin6;

import java.util.Scanner;

public class Ejercicio3 {
	public static void main(String[] args) {
		
		/*Creamos una variable para almacenar la frase introducida por el usuario*/
		String frase;
		
		/*Creamos una variable para almacenar el resultado*/
		int resultado;
		
		/*Creamos un Scanner*/
		Scanner sc = new Scanner(System.in);
		
		/*Pedimos al usuario que introduzca la frase*/
		System.out.println("Introduce la frase");
		
		/*Leemos la frase del usuario*/
		frase = sc.nextLine();
		
		/*Llamamos a la funcion*/
		resultado = espacioFrase(frase);
		
		/*Mostramos el resultado al usuario*/
		System.out.println("La frase tiene " + resultado + " espacios");
		
		/*Cerramos el Scanner*/
		sc.close();
	}
	
	/*Creamos una funcion que nos calcule cuantos espacios tiene la frase*/
	static int espacioFrase(String frase) {
		
		/*Creamos una variable para almacenar el numero de espacios de la frase*/
		int espacios = 0;
		
		/*Creamos un bucle for para recorrer la frase y contar los espacios*/
		for(int i = 0; i < frase.length(); i++) {
			
			/*Creamos un if para que si el caracter es un espacio sumar 1 al contador*/
			if(frase.charAt(i) == ' ') {
				espacios++;
			}
		}
		
		/*Devolvemos el numero de espacios*/
		return espacios;
	}
}