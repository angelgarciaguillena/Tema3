package boletin1;

import java.util.Random;

public class Ejercicio1 {
	public static void main(String[] args) {
		
		/*Creamos una tabla para alamcenar los numeros*/
		int numeros[] = new int [10];
		
		/*Creamos la clase Random*/
		Random rand = new Random();
		
		/*Creamos un for para ir rellenando los espacios vacios de la tabla*/
		for(int i = 0; i < numeros.length; i++) {
			numeros[i]= rand.nextInt(1,101);
		}
		
		/*Creamos un for each para recorrer la tabla y imprimir los numeros almacenados*/
		for(int valor : numeros) {
			System.out.println(valor);
		}
	}
}
