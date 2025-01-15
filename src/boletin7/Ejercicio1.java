package boletin7;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio1 {
	public static void main(String[] args) {
		
		/*Creamos una variable para almacenar los numeros del usuario*/
		int numero;
		
		/*Creamos una variable para almacenar el tamaño de la lista*/
		int tamaño;
		
		/*Creamos un ArrayList para almacenar los valores*/
		ArrayList<Integer> numeros = new ArrayList<>();
		
		/*Creamos un Scanner*/
		Scanner sc = new Scanner(System.in);
		
		/*Pedimos al usuario que introduzca un numero*/
		System.out.println("Introduce un numero");
		
		/*Leemos el numero del usuario*/
		numero = sc.nextInt();
		
		/*Creamos un bucle while para pedir al usuario que introduzca valores y que pare mientras introduzca un negativo*/
		while(numero >= 0) {
			
			/*Añadimos el numero a la lista*/
			numeros.add(numero);
			
			/*Pedimos al usuario que introduzca otro numero*/
			System.out.println("Introduce otro numero");
			
			/*Leemos el numero del usuario*/
			numero = sc.nextInt();
		}
		
		/*Averiguamos el tamaño de la lista*/
		tamaño = numeros.size();
		
		/*Creamos un bucle for para recorrer la lista*/
		for(int i = 0; i < tamaño; i++) {
			
			/*Creamos un if para que si el numero es par imprimir su indice por pantalla*/
			if(numeros.get(i) % 2 == 0) {
				System.out.println("Indice" + i);
			}
		}
		
		/*Cerramos el Scanner*/
		sc.close();
	}
}