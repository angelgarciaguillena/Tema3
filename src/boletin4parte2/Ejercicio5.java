package boletin4parte2;

import java.util.Scanner;

public class Ejercicio5 {
	public static void main(String[] args) {
		
		/*Creamos una variable que almacene el tamaño de la tabla introducido por el usuario*/
		int tamaño;
		
		/*Creamos una tabla bidimensional para almacenar numeros*/
		int tablaInicio[][];
		
		/*Creamos una tabla que va a almacenar el resultado del giro*/
		int resultado[][];
		
		/*Creamos un Scanner*/
		Scanner sc = new Scanner(System.in);
		
		/*Pedimos al usuario que introduzca el tamaño de la tabla*/
		System.out.println("Introduce el tamaño de la tabla");
		
		/*Leemos el dato introducido por el usuario*/
		tamaño = sc.nextInt();
		
		/*Indicamos el tamaño de la tabla inicio y de la tabla que almacena el resultado*/
		tablaInicio = new int[tamaño][tamaño];
		resultado = new int[tamaño][tamaño];
		
		/*Creamos un bucle for para pedir al usuario que rellene la tabla*/
		for(int i = 0; i < tablaInicio.length; i++) {
			for(int j = 0; j < tablaInicio[i].length; j++) {
				System.out.println("Introduce un valor para la tabla");
				tablaInicio[i][j] = sc.nextInt();
			}
		}
		
		/*Hacemos un salto de linea*/
		System.out.println();
		
		/*Creamos un bucle for para mostrar la tabla al usuario*/
		System.out.println("Tabla Sin Girar:");
		for(int i = 0; i < tablaInicio.length; i++) {
			for(int j = 0; j < tablaInicio[i].length; j++) {
				System.out.print(tablaInicio[i][j] + "\t");
			}
			/*Hacemos un salto de linea*/
			System.out.println();
		}
		
		/*Hacemos un salto de linea*/
		System.out.println();
		
		/*Llamamos a la funcion*/
		resultado = gira(tablaInicio);
		
		/*Mostramos el resultado de la tabla al usuario*/
		System.out.println("Tabla Girada:");
		for(int i = 0; i < resultado.length; i++) {
			for(int j = 0; j < resultado[i].length; j++) {
				System.out.print(resultado[i][j] + "\t");
			}
			/*Hacemos un salto de linea*/
			System.out.println();
		}
		
		/*Cerramos el Scanner*/
		sc.close();
	}
	
	/*Creamos una funcion*/
	static int[][] gira(int tablaInicio[][]){
		
		/*Creamos una tabla que va a almacenar la tabla anterior con un giro de 90º*/
		int tablaGirada[][] = new int[tablaInicio.length][tablaInicio[0].length];
		
		/*Creamos un bucle for para recorrer la tabla y almacenarla en una nueva que este girada 90º*/
		for(int i = 0; i < tablaInicio.length; i++) {
			for(int j = 0; j < tablaInicio[i].length; j++) {
				tablaGirada[j][tablaInicio.length-1-i] = tablaInicio[i][j];
			}
		}
		
		/*Devolver tabla girada*/
		return tablaGirada;
	}
}
