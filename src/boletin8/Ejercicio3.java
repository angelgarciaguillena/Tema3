package boletin8;

import java.util.Scanner;
import java.util.TreeMap;

public class Ejercicio3 {
	public static void main(String[] args) {
		
		/*Creamos un mapa para almacenar cuantas veces se ha repetido las letras*/
		TreeMap <Character, Integer> letras = new TreeMap<>();
		
		/*Creamos una variable para almacenar la frase*/
		String frase;
		
		/*Creamos una variable para almacenar la letra*/
		char letra;
		
		/*Creamos una variable para almacenar las apariciones de la letra*/
		int aparicion;
		
		/*Creamos un Scanner*/
		Scanner sc = new Scanner(System.in);
		
		/*Pedimos al usuario que introduzca una frase*/
		System.out.println("Introduce una frase");
		
		/*Leemos la frase del usuario*/
		frase = sc.nextLine();
		
		/*Creamos un bucle for para recorrer la frase*/
		for(int i = 0; i < frase.length(); i++){
			
			/*Almacenamos la letra en la variable*/
			letra = frase.charAt(i);
			
			/*Si la letra es un caracter*/
			if(Character.isLetter(letra)) {
				
				/*Si la letra no se encuentra en el mapa almacenarlo*/
				if(!letras.containsKey(letra)) {
					
					/*Almacenamos la letra en el mapa*/
					letras.put(letra, 1);
					
				} else {
					
					/*Almacenamos las apariciones que tenia la letra*/
					aparicion = letras.get(letra);
					
					/*Sumamos 1 a las apariciones*/
					aparicion++;
					
					/*Sustituimos el numero de apariciones anteriores por las nuevas*/
					letras.put(letra, aparicion);
				}
			}			
		}
		
		/*Mostramos el mapa al usuario*/
		System.out.println(letras);
		
		/*Cerramos el Scanner*/
		sc.close();
	}
}