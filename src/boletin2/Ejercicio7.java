package boletin2;

import java.util.Arrays;

public class Ejercicio7 {
	public static void main(String[] args) {
		
		/*Creamos una variable para saber el tamaño de la tabla*/
		int tamaño = 0;
		
		/*Creamos una variable para indicar el inicio de cada numero*/
		int inicio = 0;
		
		/*Creamos una tabla para almacenar los numeros*/
		int numeros[];
		
		/*Creamos un bucle for para averiguar cual es el tamaño de la tabla*/
		for(int i = 1; i <= 10; i++) {
			tamaño += i;
		}
		
		/*Ponemos el tamaño a la tabla*/
		numeros = new int[tamaño];
		
		/*Creamos un bucle for para rellenar la tabla de valores*/
		for(int j = 1; j < 10; j++) {
			
			/*Creamos un array fill para rellenar la tabla con la secuencia*/
			Arrays.fill(numeros, inicio, inicio + j, j);
			inicio += j;
		}
		
		/*Mostramos el resultado al usuario*/
		System.out.println(Arrays.toString(numeros));
	}
}
