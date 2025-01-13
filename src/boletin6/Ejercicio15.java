package boletin6;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio15 {
	public static void main(String[] args) {
		
		/*Creamos una variable para almacenar la frase*/
		String frase;
		
		/*Creamos una variable para almacenar la respuesta del usuario*/
		String respuesta = "";
		
		/*Creamos una variable para almacenar el anagrama*/
		String anagrama;
		
		/*Creamos un Scanner*/
		Scanner sc = new Scanner(System.in);
		
		/*Pedimos al usuario que introduzca una frase*/
		System.out.println("Introduce la frase para adivinar");
		
		/*Leemos la frase del usuario*/
		frase = sc.nextLine();
		
		/*Creamos un bucle while para que si el jugador introduce la frase vacia volver a preguntarle*/
		while(frase.isEmpty()) {
			
			/*Notificamos al usuario*/
			System.out.println("No has introducido ninguna frase");
			
			/*Pedimos al usuario que introduzca una frase*/
			System.out.println("Introduce de nuevo una frase");
			
			/*Leemos la frase del usuario*/
			frase = sc.nextLine();
		}
		
		/*Creamos un bucle do while para que el programa no termine hasta que el usuario acierte la frase*/
		do {
			
			/*Llamamos a la funcion*/
			anagrama = desordenarFrase(frase);
			
			/*Mostramos al usuario el anagrama*/
			System.out.println(anagrama);
			
			/*Pedimos al usuario que introduzca la frase en el orden correcto*/
			System.out.println("Introduce la frase en el orden correcto");
			
			/*Leemos la respuesta del usuario*/
			respuesta = sc.nextLine();
			
		}while(!respuesta.equalsIgnoreCase(frase));
		
		/*Notificamos al usuario de que ha adivinado la palabra*/
		System.out.println("Enhorabuena, has adivinado la palabra");
		
		/*Cerramos el Scanner*/
		sc.close();
	}
	
	/*Creamos una funcion que recibira como parametro la frase del usuario y se encargara
	 * de desordenar y devolver la frase hasta que el usuario la acierte*/
	 static String desordenarFrase(String frase) {
		 
		 /*Creamos una variable para almacenar las posiciones aleatorias*/
		 int posicionAleatoria;
		 
		 /*Creamos una variable que almacene el caracter que vamos a quitar de la posicion aleatoria*/
		 char caracter;
		 
		 /*Creamos una tabla para almacenar los caracteres de la frase*/
		 char caracteres[] = frase.toCharArray();
		 
		 /*Creamos una variable para almacenar la transposicion de la frase*/
		 String fraseAnagrama;
		 
		 /*Creamos la clase Random*/
		 Random rand  = new Random();
		 
		 /*Creamos un bucle for para recorrer la frase cambiando los caracteres*/
		 for(int i = 0; i < frase.length(); i++) {
			 
			 /*Creamos una posicion aleatoria dentro del rango de la frase*/
			 posicionAleatoria = rand.nextInt(0, frase.length());
			 
			 /*Almacenamos el caracter en una variable*/
			 caracter = caracteres[i];
			 
			 /*Cambiamos el caracter de la primera posicion*/
			 caracteres[i] = caracteres[posicionAleatoria];
			 
			 /*Cambiamos el caracter de la posicion aleatoria por el que habiamos almacenado anteriormente*/
			 caracteres[posicionAleatoria] = caracter;
		 }
		 
		 /*Transformamos la tabla en una cadena*/
		 fraseAnagrama = String.valueOf(caracteres);
		 
		 /*Devolvemos la frase desordenada*/
		 return fraseAnagrama;
	 }
}