package boletin6;

import java.util.Scanner;

public class Ejercicio10 {
	public static void main(String[] args) {
		
		/*Creamos una variable para almacenar la palabra*/
		String palabra;
		
		/*Creamos una variable para almacenar la palabra traducida*/
		String traducida = "";
		
		/*Creamos una variable que almacene los caracteres*/
		char c;
		
		/*Creamos la tabla con el conjunto1 y el conjunto2*/
		char conjunto1[] = {'e', 'i', 'k', 'm', 'p', 'q', 'r', 's', 't', 'u', 'v'};
		char conjunto2[] = {'p', 'v', 'i', 'u', 'm', 't', 'e', 'r', 'k', 'q', 's'};
		
		/*Creamos un Scanner*/
		Scanner sc = new Scanner(System.in);
		
		/*Pedimos al usuario que introduzca una palabra*/
		System.out.println("Introduce una palabra");
		
		/*Leemos la palabra del usuario*/
		palabra = sc.nextLine().toLowerCase();
		
		/*Creamos un bucle for para recorrer la palabra*/
		for(int i = 0; i < palabra.length(); i++) {
			
			/*Guardamos el caracter*/
			c = palabra.charAt(i);
			
			/*LLamamos a la funcion*/
			traducida += codifica(conjunto1, conjunto2, c);
		}
		
		/*Mostramos la traduccion al usuario*/
		System.out.println(traducida);
		
		/*Cerramos el Scanner*/
		sc.close();
	}
	
	/*Creamos una funcion para codificar un caracter*/
	static char codifica(char conjunto1[],char conjunto2[], char c) {
		
		/*Almacenamos una variable para almacenar el caracter*/
		char codificado = ' ';
		
		/*Creamos una variable que nos sirve para contador*/
		int contador = 0;
		
		/*Creamos un bucle while para recorrer la tabla en busca del caracter*/
		while(contador < conjunto1.length) {
			if(c == conjunto1[contador]) {
				codificado = conjunto2[contador];
			}
		}
		
		/*Devolvemos el caracter*/
		return codificado;
	}
}