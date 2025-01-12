package boletin6;

import java.util.Scanner;

public class Ejercicio14 {
	public static void main(String[] args) {
		
		/*Creamos una variable que almacene la frase del usuario*/
		String frase;
		
		/*Creamos una variable para almacenar el indice*/
		int indice;
		
		/*Creamos una variable que servira como contador*/
		int contador = 0;
		
		/*Creamos un Scanner*/
		Scanner sc = new Scanner(System.in);
		
		/*Pedimos al usuario que introduzca una frase*/
		System.out.println("Introduce una frase");
		
		/*Leemos la frase del usuario*/
		frase = sc.nextLine().toLowerCase().trim().replace(" ", "");
		
		/*Creamos un bucle for para recorrer el abecedario y ver cuales de las letras coinciden con las de la frase*/
		for(char letra = 'a'; letra <= 'z'; letra++) {
			
			/*Averiguamos donde se aparece por primera vez el caracter*/ 
			indice = frase.indexOf(letra);
			
			/*Creamos un bucle while para realizar una busqueda del caracter a partir de su primera aparicion*/
			while(indice != -1) {
				
				/*Sumamos 1 al contador de veces que ha aparecido el caracter*/
				contador++;
				
				/*Buscamos el caracter a partir del indice anterior de forma que cada vez que se encuentre 
				 * se vaya sumando al contador y se empieze a buscar desde la nueva posicion*/
				indice = frase.indexOf(letra, indice+1);
			}
			
			/*Mostramos las veces que se repiten las letras en la frase*/
			System.out.println(letra + ": " + contador + " veces");
			
			/*Reiniciamos el contador*/
			contador = 0;
		}
		
		/*Cerramos el Scanner*/
		sc.close();
	}
}