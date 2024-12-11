package boletin6;

import java.util.Scanner;

public class Ejercicio4 {
	public static void main(String[] args) {
		
		/*Creamos una variable para almacenar una cadena de caracteres*/
		String frase;
		
		/*Creamos una variable que almacene el resultado del programa*/
		String resultado;
		
		/*Creamos un Scanner*/
		Scanner sc = new Scanner(System.in);
		
		/*Pedimos al usuario que introduzca una frase*/
		System.out.println("Introduce una frase");
		
		/*Leemos la frase del usuario*/
		frase = sc.nextLine();
		
		/*Llamamos a la funcion*/
		resultado = invertirFrase(frase);
		
		/*Mostramos el resultado al usuario*/
		System.out.println(resultado);
		
		/*Cerramos el Scanner*/
		sc.close();
	}
	
	/*Creamos una funcion que devuelva la palabra invertida*/
	static String invertirFrase(String frase) {
		
		/*Creamos una variable que almacene la cadena invertida*/
		String invertida = "";
		
		/*Creamos un bucle for para invertir la frase*/
		for(int i = 1; i <= frase.length(); i++) {
			invertida += frase.charAt(frase.length()-i);
		}
		
		/*Devolvemos la frase invertida*/
		return invertida;
	}
}