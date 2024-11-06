package boletin1;

import java.util.Scanner;

public class Ejercicio3 {
	public static void main(String[] args) {
		
		/*Creamos una tabla que almacene los numeros*/
		int numeros[] = new int[10];
		
		/*Creamos un Scanner*/
		Scanner sc = new Scanner(System.in);
		
		/*Creamos un for para pedir al usuario que introduzca 10 numeros y despues almacenarlos en la tabla*/
		for(int i = 0; i < numeros.length; i++) {
			System.out.println("Introduzca un numero:");
			numeros[i]= sc.nextInt();
		}
		
		/*Creamos un for para imprimir los numeros de forma descendiente*/
		for(int i = 9; i >= 0; i--) {
			System.out.println(numeros[i]);
		}
			
		/*Cerramos el Scanner*/
		sc.close();
	}
}
