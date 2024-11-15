package boletin3;

import java.util.Arrays;

public class Ejercicio4 {
	public static void main(String[] args) {
		
		/*Creamos una tabla que va a servir para simular la tabla de multiplicar*/
		int tabla [][] = new int [10][10];
		
		/*Creamos un bucle for para rellenar la tabla con los resultados de la multiplicacion*/
		for(int i = 0; i < tabla.length; i++) {
			for(int j = 0; j < tabla[i].length; j++) {
				tabla[i][j] = (i+1)*(j+1);
			}
		}
		
		/*Creamos un bucle for para imprimir cada tabla linea a linea*/
		for(int i = 0; i<tabla.length;i++) {
			System.out.println("Tabla " + (i+1) + ": " + Arrays.toString(tabla[i]));
		}
	}
}	