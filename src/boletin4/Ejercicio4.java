package boletin4;

import java.util.Scanner;

public class Ejercicio4 {
	public static void main(String[] args) {
		
		/*Creamos una tabla que almacena los numeros*/
		int t[] = {1, 4, 9, 16, 21};
		
		/*Creamos una variable que almacena el resultado de la funcion*/
		int posicion;
		
		/*Creamos una variable para almacenar el valor a buscar*/
		int clave;
		
		/*Creamos un Scanner*/
		Scanner sc = new Scanner(System.in);
		
		/*Pedimos al usuario que introduzca el valor clave*/
		System.out.println("Introduce el valor clave");
		
		/*Leemos el valor del usuario*/
		clave = sc.nextInt();
		
		/*Llamamos a la funcion*/
		posicion = buscar(t, clave);
		
		/*Mostramos al usuario el resultado*/
		System.out.println(posicion == -1 ? posicion : "El numero introducido se ha encontrado en la posicion " + posicion);
		
		/*Cerramos el Scanner*/
		sc.close();
	}
	
	/*Creamos una funcion*/
	static int buscar(int t[], int clave) {
		
		/*Creamos una variable del indice de busqueda*/
		int indice = 0;
		
		/*Creamos una variable que almacene el resultado*/
		int resultado;
		
		/*Creamos un bucle while para recorrer la tabla y buscar el numero de forma secuencial*/
		while(indice < t.length && clave != t[indice]) {
			indice++;
		}
		
		/*Creamos un if para saber si el numero es menor a la cantidad de la tabla el numero se ha encontrado sino el numero no se ha encontrado*/
		if(indice < t.length) {
			resultado = indice;
		} else {
			resultado = -1;
		}
		
		/*Devolver resultado*/
		return resultado;
	}
}
