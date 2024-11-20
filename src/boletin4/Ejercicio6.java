package boletin4;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio6 {
	public static void main(String[] args) {
		
		/*Creamos una variable para almacenar el numero de agrupacion de los elempentos*/
		int numElementos;
		
		/*Creamos una tabla y almacenamos varios numeros*/
		int t[] = {10, 1, 5, 8, 9, 2};
		
		/*Creamos una tabla que almacena el resultado de la funcion*/
		int resultado[];
		
		/*Creamos un Scanner*/
		Scanner sc = new Scanner(System.in);
		
		/*Pedimos al usuario que introduzca un valor de agrupacion*/
		System.out.println("Introduce el orden de agrupacion");
		
		/*Leemos el dato del usuario*/
		numElementos = sc.nextInt();
		
		/*Llamamos a la funcion*/
		resultado = suma(t, numElementos);
		
		/*Mostramos el resultado al usuario*/
		System.out.println(Arrays.toString(resultado));
		
		/*Cerramos el Scanner*/
		sc.close();
	}
	
	/*Creamos una funcion*/
	static int[] suma(int t[], int numElementos) {
		
		/*Creamos una tabla para almacenar la suma de los numeros de la tabla*/
		int sumas[] = new int[t.length - numElementos + 1];
		
		/*Creamos un bucle for para almacenar la suma de los numeros en las celdas de la tabla*/
		for(int i = 0; i < sumas.length; i++) {
			
			/*Creamos un bucle for para recorrer la tabla, sumar los numeros mientras no superen el numero de valores introducido por el usuario y almacenar los resultados en la tabla de sumas*/
			for(int j = i; j < numElementos + i; j++) {
				sumas[i] += t[j];
			}
		}
		
		/*Devolvemos la tabla de sumas*/
		return sumas;
	}
}