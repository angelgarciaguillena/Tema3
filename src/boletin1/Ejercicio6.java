package boletin1;

import java.util.Scanner;

public class Ejercicio6 {
	public static void main(String[] args) {
		
		/*Creamos una tabla para almacenar los 8 numeros que introduzca el usuario*/
		int numeros[] = new int[8]; 
		
		/*Creamos un Scanner*/
		Scanner sc  = new Scanner(System.in);
		
		/*Creamos un bucle for para pedir al usuario 8 numeros y almacenarlos en la tabla*/
		for(int i = 0; i < numeros.length; i++) {
			System.out.println("Introduce un numero:");
			numeros[i] = sc.nextInt();
		}
		
		/*Creamos un bucle for para sacar los numeros de la tabla y indicar si es par o impar*/
		for(int i = 0; i < numeros.length; i++) {
			System.out.println(numeros[i] % 2 == 0 ? "El numero es par" : "El numero es impar");
		}
		
		/*Cerramos el Scanner*/
		sc.close();
	}
}