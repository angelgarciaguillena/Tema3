package boletin6;

import java.util.Scanner;

public class Ejercicio7 {
	public static void main(String[] args) {
		
		/*Creamos una variable que almacene la frase*/
		String frase;
		
		/*Creamos una variable que almacene una palabra*/
		String palabra;
		
		/*Creamos una variable que almacene el resultado del programa*/
		int resultado;
		
		/*Creamos un Scanner*/
		Scanner sc = new Scanner(System.in);
		
		/*Pedimos al usuario que introduzca una frase*/
		System.out.println("Introduce una frase");
		
		/*Leemos la frase del usuario*/
		frase = sc.nextLine();
		
		/*Pedimos al usuario que introduzca una palabra*/
		System.out.println("Introduce una palabra");
		
		/*Leemos la palabra del usuario*/
		palabra = sc.nextLine();
		
		/*LLamamos a la funcion*/
		resultado = repetirPalabra(frase, palabra);
		
		/*Mostramos el resultado al usuario*/
		System.out.println("La palabra" + " '" + palabra + "' " + "se repite " + resultado + " veces");
		
		/*Cerramos el Scanner*/
		sc.close();
	}
	
	/*Creamos una funcion que devuelva cuantas veces aparece una palabra en la frase*/
	static int repetirPalabra(String frase, String palabra) {
		
		/*Creamos una variable que almacene las veces que se repite la palabra en la frase*/
		int repeticiones = 0;
		
		/*Creamos una variable pàra almacenar la posicion de la ultima letra*/
		int posicion;
		
		/*Creamos una variable pàra almacenar la posicion de la primera letra*/
		int posicionInicio;
		
		/*Buscamos la palabra dada en la frase desde la posicion 0 y devuelve la posicion de la primera letra de esa misma*/
		posicion = frase.indexOf(palabra, 0);
		
		/*Creamos un bucle while para que se repita mientras la posiciom sea mayor o igual a 0*/
		while(posicion >= 0) {
			
			/*Sumamos 1 al contador*/
			repeticiones++;
			
			/*Calculo la posicion de la ultima letra de la palabra dada*/
			posicionInicio = posicion + palabra.length();
			
			/*Buscamos la palabra dada en la frase desde la ultima posicion guardada y devuelve la posicion de la primera letra de esa misma*/
			posicion = frase.indexOf(palabra, posicionInicio);
		}
				
		/*Devolvemos las repeticiones de la palabra*/
		return repeticiones;
	}
}