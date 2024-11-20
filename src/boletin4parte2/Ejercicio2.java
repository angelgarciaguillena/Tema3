package boletin4parte2;

import java.util.Arrays;

public class Ejercicio2 {
	public static void main(String[] args) {
		
		/*Creamos una tabla y almacenamos los valores*/ 
		int tabla[][] = {{1,2,3}, {4,5,6}, {7,8,9}};
		
		/*Creamos una tabla que almacene la tabla anterior invertida*/
		int invertido[][];
		
		/*Mostramos la tabla al usuario*/
		for(int i = 0; i < tabla.length; i++) {
			System.out.println(Arrays.toString(tabla[i]));
		}
		
		/*Hacemos un salto de linea*/
		System.out.println();
		
		/*Llamamos a la funcion*/
		invertido = transposicion(tabla);
				
		/*Creamos un bucle for para mostrar la tabla al usuario*/
		for(int i = 0; i < invertido.length; i++) {
			System.out.println(Arrays.toString(invertido[i]));
		}
	}
	
	/*Creamos una funcion*/
	static int[][] transposicion(int tabla[][]) {
		
		/*Creamos una tabla que almacenara la tabla anterior invertida*/
		int tabla2[][] = new int[tabla.length][tabla[0].length];
		
		/*Creamos un bucle for para invertir la tabla anterior*/
		for(int i = 0; i < tabla.length; i++) {
			for(int j = 0; j < tabla[i].length; j++) {
				tabla2[j][i] = tabla[i][j];
			}
		}
		
		/*Devolvemos la tabla invertida*/
		return tabla2;
	}
}