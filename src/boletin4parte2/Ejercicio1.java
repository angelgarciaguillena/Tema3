package boletin4parte2;

import java.util.Arrays;
import java.util.Random;

public class Ejercicio1 {
	public static void main(String[] args) {
		
		/*Creamos una tabla para almacenar los valores generados por el programa*/
		int t[][] = new int[6][10];
		
		/*Creamos una tabla que almacena el resultado de la funcion*/
		int resultado[];
		
		/*Creamos la clase Random*/
		Random rand = new Random();
		
		/*Creamos un bucle for para rellenar la tabla con valores aleatorios generados por el programa*/
		for(int i = 0; i < t.length; i++) {
			for(int j = 0; j < t[i].length; j++) {
				t[i][j] = rand.nextInt(0, 1001);
			}
		}
		
		/*Creamos un bucle for para mostrar la tabla al usuario*/
		for(int i = 0; i < t.length; i++) {
			System.out.println(Arrays.toString(t[i]));
		}
		
		/*Hacemos un salto de linea*/
		System.out.println();
		
		/*Llamamos a la funcion*/
		resultado = buscar(t);
		
		/*Mostramos el resultado al usuario*/
		System.out.println("El minimo y el maximo es " + Arrays.toString(resultado));
	}
	
	/*Creamos una funcion*/
	static int[] buscar(int t[][]) {
				
		/*Creamos una tabla que almacene el maximo y el minimo de la tabla anterior*/
		int t2[] = new int[2];
		
		/*Creamos un bucle for para recorrer la tabla y almacenar el valor máximo y mínimo*/
		for(int i = 0; i < t.length; i++){
			for(int j = 0; j < t[i].length; j++) {
				
				/*Creamos un if para inicializar los lugares de la tabla*/
				if(i == 0 && j == 0) {
					/*Inicializamos las variables*/
					t2[0] = t[i][j];
					t2[1] = t[i][j];
				}
				
				/*Creamos un if para que si el numero de la tabla es mayor al maximo 
				 * de la posicion de la tabla 2, almacenar el valor en la tabla 2 pero 
				 * si el numero de la tabla es menor al minimo almacenado en la tabla 2, 
				 * almacenar el valor en la tabla 2*/
				if(t[i][j] > t2[1]) {
					t2[1] = t[i][j];
				} else if (t[i][j] < t2[0]) {
					t2[0] = t[i][j];
				}
			}		
		}
		
		/*Devolvemos la tabla 2*/
		return t2;
	}
}