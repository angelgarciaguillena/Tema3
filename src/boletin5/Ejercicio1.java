package boletin5;

import java.util.Scanner;

public class Ejercicio1 {
	public static void main(String[] args) {
		
		/*Creamos una variable para almacenar el valor de busqueda*/
		int valor;
		
		/*Creamos una variable para almacenar el resultado de la funcion*/
		boolean resultado;
		
		/*Creamos una tabla bidimensional para almacenar valores*/
		int tabla[][] = new int[3][3];
		
		/*Creamos un Scanner*/
		Scanner sc = new Scanner(System.in);
		
		/*Rellenamos la tabla*/
		for(int i = 0; i < tabla.length; i++) {
			for(int j = 0; j < tabla[i].length; j++) {
				System.out.println("Introduce un valor");
				tabla[i][j] = sc.nextInt();
			}
		}
		
		/*Hacemos un salto de linea*/
		System.out.println();
		
		/*Mostramos la tabla*/
		for(int i = 0; i < tabla.length; i++) {
			for(int j = 0; j < tabla[i].length; j++) {
				System.out.print(tabla[i][j] + "\t");
			}
			
			/*Hacemos un salto de linea*/
			System.out.println();
		}
		
		/*Pedimos al usuario que introduzca el valor de busqueda*/
		System.out.println("Introduce el valor de busqueda");
		
		/*Leemos el dato introducido por el usuario*/
		valor = sc.nextInt();
		
		/*Llamamos a la funcion*/
		resultado = buscar(tabla, valor);
		
		/*Mostramos el resultado al usuario*/
		System.out.println(resultado ? "El valor introducido se encuentra en la tabla" : "El valor introducido no se encuentra en la tabla");
		
		/*Cerramos el Scanner*/
		sc.close();
	}
	
	/*Creamos una funcion*/
	static boolean buscar(int tabla[][], int valor) {
		
		/*Creamos una variable para saber si el numero se encuentra en la tabla*/
		boolean busqueda = false;
		
		/*Creamos un bucle for para recorrer la tabla y buscar el numero*/
		for(int i = 0; i < tabla.length; i++) {
			for(int j = 0; j < tabla[i].length; j++) {
				
				/*Creamos un if para que si el numero es igual al dato del usuario devuelva true*/
				if(tabla[i][j] == valor) {
					busqueda = true;
				}
			}
		}
	
		/*Devolvemos la variable busqueda*/
		return busqueda;
	}
}