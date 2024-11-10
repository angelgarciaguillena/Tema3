package boletin2;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio2 {
	public static void main(String[] args) {
		
		/*Creamos una variable que almacene el resultado*/
		boolean resultado;
		
		/*Creamos una tabla para los 10 primeros enteros*/
		int tabla1[] = new int[10];
		
		/*Creamos una tabla para los otros 10 enteros*/
		int tabla2[] = new int[10];
		
		/*Creamos el Scanner*/
		Scanner sc = new Scanner(System.in);
		
		/*Creamos un for para pedir 10 numeros al usuario y que los almacene en una tabla */
		for(int i = 0; i < tabla1.length; i++) {
			System.out.println("Introduce un numero:");;
			tabla1[i] = sc.nextInt();
		}
		
		/*Creamos un segundo for para pedir otros 10 numeros al usuario y que los almacene en otra tabla */
		for(int i = 0; i < tabla2.length; i++) {
			System.out.println("Introduce otro numero:");;
			tabla2[i] = sc.nextInt();
		}
		
		/*Comparamos si las dos tablas son iguales o no*/
		resultado = Arrays.equals(tabla1, tabla2);
		
		/*Mostramos al usuario la respuesta*/
		System.out.println(resultado ? "Las tablas son iguales" : "Las tablas no son iguales");
		
		/*Cerramos el Scanner*/
		sc.close();
	}
}