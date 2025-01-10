package boletin6;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio14 {
	public static void main(String[] args) {
		
		/*Creamos una variable que almacene la frase del usuario*/
		String frase;
		
		/*Creamos una variable que almacene la frase del usuario editada*/
		String frase2;
		
		/*Creamos una variable para contar las letras unicas de la frase*/
		int numeroLetras = 0;
		
		/*Creamos una variable que almacene las letras unicas*/
		char letrasUnicas = ' ';
		
		/*Creamos una variable que servira como contador*/
		int contador = 0;
		
		/*Creamos un array que almacene las letras de la frase*/
		char letras[];
		
		/*Creamos un array para almacenar las veces que se repiten las letras*/
		int repeticiones[];
		
		/*Creamos un Scanner*/
		Scanner sc = new Scanner(System.in);
		
		/*Pedimos al usuario que introduzca una frase*/
		System.out.println("Introduce una frase");
		
		/*Leemos la frase del usuario*/
		frase = sc.nextLine().toLowerCase();
		frase2 = frase;
		
		/*Creamos un bucle while para recorrer la palabra y contar las letras unicas*/
		while(contador < frase.length()) {
			
			/*Almacenamos la letra*/
			letrasUnicas = frase2.charAt(0);
			
			/*Sumamos 1 al contador de letras unicas*/
			numeroLetras++;
			
			/*Remplazamos la letra almacenada por espacios vacios para que el programa no la detecte de nuevo*/
			frase2.replace(String.valueOf(letrasUnicas), "");
			
			/*Sumamos 1 al contador del bucle*/
			contador++;
		}
		
		/*Asignamos el tamaño al array donde almacenamos las letras y donde almacenamos las repeticiones*/
		letras = new char[numeroLetras];
		repeticiones = new int[numeroLetras];
		
		/*Reiniciamos el contador del bucle*/
		contador = 0;
		
		/*Volvemos a restablecer la frase 2*/
		frase2 = frase;
		
		/*Creamos un bucle for para recorrer de nuevo la frase y almacenar las letras en el array*/
		while(contador < frase.length()) {
			
			/*Almacenamos la letra en la tabla*/
			letras[contador] = frase2.charAt(0);
			
			/*Remplazamos la letra almacenada por espacios vacios para que el programa no la detecte de nuevo*/
			frase2.replace(String.valueOf(letras[contador]), "");
			
			/*Sumamos 1 al contador del bucle*/
			contador++;
		}
		
		/*Reiniciamos el contador*/
		contador = 0;
		
		/*Creamos un bucle for para recorrer la tabla que contiene las letras unicas*/
		for(int i = 0; i < letras.length; i++) {
			
			/*Creamos un bucle para recorrer la frase y contar cuantas veces se repite la letra almacenada en la tabla*/
			for(int j = 0; j < frase.length(); j++) {
				
				/*Almacenamos la letra en la variable*/
				letrasUnicas = frase.charAt(i);
				
				/*Si la letra almacenada es igual a la letra sumar 1 al contador*/
				if(letrasUnicas == frase.charAt(j)) {
					contador++;
				}
			}
			
			/*Almacenamos el contador en la otra tabla*/
			repeticiones[i] = contador;
			
			/*Eliminamos la letra de la frase*/
			frase.replace(String.valueOf(letrasUnicas), "");
			
			/*Reiniciamos el contador*/
			contador = 0;
		}
		
		/*Mostramos al usuario el resultado del programa*/
		System.out.println(Arrays.toString(letras));
		System.out.println(Arrays.toString(repeticiones));
		
		/*Cerramos el Scanner*/
		sc.close();
	}
}