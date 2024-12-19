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
		palabra1 = sc.nextLine().trim().toLowerCase();
		
		/*Pedimos al usuario que introduzca la segunda palabra*/
		System.out.println("Introduce otra palabra");
		
		/*Leemos la segunda palabra del usuario*/
		palabra2 = sc.nextLine().trim().toLowerCase();
		
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
		
		/*Creamos un contador para hacer una busqueda por letra*/
		int contador1 = 0;
		
		/*Creamos un contador para contar las posiciones del array*/
		int contador2 = 0;
		
		/*Creamos un contador para contar los aciertos de la busqueda*/
		int aciertos = 0;
		
		/*Creamos un array para almacenar las letras*/
		char palabra[] = palabra2.toCharArray();
		
		/*Creamos un if para que si la palabra 1 no tiene la misma longitud que la palabra 2 indicar que no es un anagrama*/
		if(palabra1.length() != palabra2.length()) {
			anagrama = false;
			
		} else {
			
			/*Creamos un bucle while para recorrer la primera palabra*/
			while(contador1 < palabra1.length()) {
				
				/*Creamos un bucle while para recorrer el array*/
				while(contador2 < palabra.length) {
					
					/*Creamos un if para que si la letra es igual a una de las letras de la tabla sumar 1 a los aciertos*/
					if(palabra1.charAt(contador1) == palabra[contador2]) {
						aciertos++;
					}
					
					/*Sumamos 1 al contador 2*/
					contador2++;
				}
				
				/*Reiniciamos el contador 2*/
				contador2 = 0;
				
				/*Sumamos 1 al contador 1*/
				contador1++;
			}
		}
		
		/*Si los aciertos son distintos a la longitud de la palabra no son anagramas*/
		if(aciertos != palabra1.length()) {
			anagrama = false;
		}
		
		/*Devolvemos si es una anagrama*/
		return anagrama;
	}
}