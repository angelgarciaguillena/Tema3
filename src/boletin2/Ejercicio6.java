package boletin2;

import java.util.Random;

public class Ejercicio6 {
	public static void main(String[] args) {
		
		/*Creamos una variable para almacenar las coincidencias*/
		int coincidencias = 0;
		
		/*Creamos una tabla para almacenar los numeros de la primitiva*/
		int primitiva[] = new int[6];
		
		/*Creamos una tabla con la combinación ganadora y la rellenamos*/
		int combinacion[] = new int[6];
		combinacion[0] = 6;
		combinacion[1] = 12;
		combinacion[2] = 16;
		combinacion[3] = 21;
		combinacion[4] = 35;
		combinacion[5] = 48;
		
		/*Creamos la clase Random*/
		Random rand = new Random();
		
		/*Creamos un bucle for para generar los numeros aleatorios de la primitiva y almacenarlos en la tabla*/
		for(int i = 0; i < primitiva.length; i++) {
			primitiva[i] = rand.nextInt(1, 50);
		}
		
		/*Creamos un for para revisar la tabla y comprobar que valores son iguales*/
		for(int i = 0; i < primitiva.length; i++) {
			
			/*Si la cifra de la primitiva es igual a la de combinacion se sumara 1 a coincidencias*/
			if(primitiva[i] == combinacion[i]) {
				coincidencias++;
			}
		}
		
		/*Mostramos al usuario el numero de coincidencias*/
		System.out.println("El numero de coincidencias es " + coincidencias);
	}
}