package boletin6;

import java.util.Scanner;

public class Ejercicio6 {
	public static void main(String[] args) {
		
		/*Creamos una variable para almacenar una frase*/
		String frase;
		
		/*Creamos una variable que almacene el resultado*/
		boolean resultado;
		
		/*Creamos un Scanner*/
		Scanner sc = new Scanner(System.in);
		
		/*Pedimos al usuario que introduzca una frase*/
		System.out.println("Introduce una frase");

		/*Leemos la frase del usuario*/
		frase = sc.nextLine().toLowerCase();
		
		/*LLamamos a la funcion*/
		resultado = esPalindromo(frase);
		
		/*Mostramos al usuario la respuesta*/
		System.out.println(resultado ? "La frase es palindromo" : "La frase no es palindromo");
		
		/*Cerramos el Scanner*/
		sc.close();
	}
	
	/*Creamos una funcion que indique si es palindromo o no*/
	static boolean esPalindromo(String frase) {
		
		/*Creamos una variable para almacenar si es palindromo o no*/
		boolean palindromo = false;
		
		/*Creamos una variable que almacene la cadena invertida*/
		String invertida = "";
		
		/*Eliminamos los espacios de la frase*/
		frase = frase.replace(" ", "");
		
		/*Creamos un bucle for para almacenar la frase invertida*/
		for(int i = 1; i <= frase.length(); i++) {
			invertida += frase.charAt(frase.length()-i);
		}
		
		/*Creamos un if para ver si la funcion es palndroma o no*/
		if(invertida.equals(frase)) {
			palindromo = true;
		}
		
		/*Devolvemos si es o no palindromo*/
		return palindromo;
	}
}