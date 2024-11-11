package boletin2;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio5 {
	public static void main(String[] args) {
		
		/*Creamos una variable para almacenar el numero del usuario*/
		int numero;
		
		/*Creamos una variable para almacenar el numero de veces que se repite el numero*/
		int contador = 0;
		
		/*Creamos una tabla para almacenar los numeros aleatorios generados por el programa*/
		int numeros[] = new int[1000];
		
		/*Creamos un Scanner*/
		Scanner sc = new Scanner(System.in);
		
		/*Creamos la clase Random*/
		Random rand = new Random();
		
		/*Creamos un bucle for para llenar la tabla con los numeros aleatorios generados por el programa*/
		for(int i = 0; i < numeros.length; i++) {
			numeros[i] = rand.nextInt(0, 100);
		}
		
		/*Pedimos al usuario que introduzca un valor para comprobar si esta en la tabla*/
		System.out.println("Introduce un valor:");
		
		/*Leemos el valor del usuario*/
		numero = sc.nextInt();
		
		/*Creamos un bucle for each para recorrer la tabla y buscar los numeros*/
		for(int valor : numeros) {
			
			/*Creamos un if para que si el numero es igual al del usuario sume 1 al contador*/
			if(valor == numero) {
				contador++;
			} 
		}
		
		/*Mostramos al usuario si el numero se encuentra en la tabla y cuantas veces se ha repetido su numero*/
		if(contador > 0) {
			System.out.println("El valor se encuentra en la tabla");
			System.out.println("El numero introducido se ha repetido " + contador + " veces");
		} else {
			System.out.println("El valor no se ha encontrado en la tabla");
		}
		
		/*Cerramos el Scanner*/
		sc.close();
	}
}