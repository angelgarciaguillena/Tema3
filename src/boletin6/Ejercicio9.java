package boletin6;

import java.util.Scanner;

public class Ejercicio9 {
	public static void main(String[] args) {
		
		/*Creamos una variable para almacenar una frase introducida por el usuario*/
		String frase;
		
		/*Creamos un Scanner*/
		Scanner sc = new Scanner(System.in);
		
		/*Pedimos al usuario que introduzca una frase*/
		System.out.println("Digame una frase");
		
		/*Leemos la frase del usuario*/
		frase = sc.nextLine();
		
		/*Creamos un if para saber si la frase esta en el dialecto de Javalandia*/
		if(frase.startsWith("Javalín, javalón") && frase.endsWith("javalén, len, len")) {
			System.out.println("No se entienden los dos dialectos");
			
		} else if(frase.startsWith("Javalín, javalón")) {
			System.out.println("La frase está en el primer dialecto de Javalandia");
			
			/*Traducimos la frase*/
			frase = frase.substring(17);
			
			/*Quitamos los espacios*/
			frase = frase.trim();
			
			/*Mostramos la frase al usuario*/
			System.out.println(frase);
			
		} else if(frase.endsWith("javalén, len, len")) {
			System.out.println("La frase está en el segundo dialecto de Javalandia");
			
			/*Traducimos la frase*/
			frase = frase.substring(0, frase.length()-17);
			
			/*Quitamos los espacios*/
			frase = frase.trim();
			
			/*Mostramos la frase al usuario*/
			System.out.println(frase);
			
		} else {
			System.out.println("La frase no esta en el dialecto de Javalandia");
		}
		
		/*Cerramos el Scanner*/
		sc.close();
	}
}