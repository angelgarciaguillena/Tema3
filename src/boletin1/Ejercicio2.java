package boletin1;

import java.util.Scanner;

public class Ejercicio2 {
	public static void main(String[] args) {
		
		/*Creamos una tabla para almacenar los numeros*/
		double numeros[] = new double [5];
		
		/*Creamos un Scanner*/
		Scanner sc = new Scanner(System.in);
		
		/*Creamos un for para pedir los 5 numeros al usuario y almacenarlos en la tabla*/
		for(int i = 0; i < numeros.length; i++) {
			System.out.println("Introduce un numero:");
			numeros[i]= sc.nextInt();
		}
		
		/*Creamos un for each para imprimir los numeros*/
		for(double valor : numeros) {
			System.out.println(valor);
		}
		
		/*Cerramos el Scanner*/
		sc.close();
	}
}
