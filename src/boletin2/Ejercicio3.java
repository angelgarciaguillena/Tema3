package boletin2;

import java.util.Arrays;
import java.util.Random;

public class Ejercicio3 {
	public static void main(String[] args) {
		
		/*Creamos una tabla para guardar los numeros generados por el programa*/
		int numeros[] = new int[30];
		
		/*Creamos la clase Random*/
		Random rand = new Random();
		
		/*Creamos un for para rellenar la tabla con valores aleatorios generados por el programa*/
		for(int i = 0; i < numeros.length; i++) {
			numeros[i] = rand.nextInt(0,10);
		}
		
		/*Ordenamos los valores del array de menor a mayor*/
		Arrays.sort(numeros);
		
		/*Mostramos la tabla ordenada al usuario*/
		System.out.println(Arrays.toString(numeros));
	}
}