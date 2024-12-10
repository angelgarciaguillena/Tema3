package boletin6;

import java.util.Scanner;

public class Ejercicio1 {
	public static void main(String[] args) {
		
		/*Creamos una variable para almacenar la primera frase*/
		String frase1;
		
		/*Creamos una variable para almacenar la segunda frase*/
		String frase2;
		
		/*Creamos un Scanner*/
		Scanner sc = new Scanner(System.in);
		
		/*Pedimos al usuario que introduzca la primera frase*/
		System.out.println("Escribe una frase");
		
		/*Leemos la frase del usuario*/
		frase1 = sc.nextLine();
		
		/*Pedimos al usuario que introduzca la segunda frase*/
		System.out.println("Escribe otra frase");
		
		/*Leemos la frase del usuario*/
		frase2 = sc.nextLine();
		
		/*Creamos un if para mostrar la respuesta al usuario*/
		if(frase1.length() > frase2.length()) { /*Si la frase 1 es mayor a la frase 2*/
			System.out.println("La frase 1 es mas larga");
		} else if(frase1.length() < frase2.length()) { /*Si la frase 1 es menor a la frase 2*/
			System.out.println("La frase 2 es mas larga");
		} else if (frase1.length() == frase2.length()) { /*Si la frase 1 es igual a la frase 2*/
			System.out.println("Las frases son iguales");
		}
		
		/*Cerramos el Scanner*/
		sc.close();
	}
}
