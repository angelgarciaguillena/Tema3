package boletin3;

import java.util.Arrays;

public class Ejercicio1 {
	public static void main(String[] args) {
		
		/*Creamos la tabla para almacenar los numeros*/
		int num[][] = new int [3][6];
		
		/*Almacenamos los numeros en la tabla*/
		
		/*Numeros de la fila 0*/
		num[0][0] = 0;
		num[0][1] = 30;
		num[0][2] = 2;
		num[0][5] = 5;
		
		/*Numeros de la fila 1*/
		num[1][0] = 75;
		num[1][4] = 0;
		
		/*Numeros de la fila 1*/
		num[2][2] = -2;
		num[2][3] = 9;
		num[2][5] = 11;
		
		/*Creamos un bucle for para mostrar la tabla al usuario linea por linea*/
		for(int i = 0; i < num.length; i++) {
			System.out.println(Arrays.toString(num[i]));
		}
	}
}