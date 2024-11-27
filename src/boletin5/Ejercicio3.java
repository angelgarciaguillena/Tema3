package boletin5;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio3 {
	public static void main(String[] args) {
		
		/*Creamos una tabla bidimensional para almacenar numeros*/
		int tabla[][] = new int[3][3];
		
		/*Creamos una tabla que almacena el resultado*/
		int resultado[][] = new int[3][3];
		
		/*Creamos un Scanner*/
		Scanner sc = new Scanner(System.in);
		
		/*Creamos un for para rellenar la tabla de valores introducidos por el usuario*/
		for(int i = 0; i < tabla.length; i++) {
			for(int j = 0; j < tabla.length; j++) {
				System.out.println("Introduce un valor");
				tabla[i][j] = sc.nextInt();
			}
		}
			
		/*Creamos un for para mostrar la tabla*/
		for(int i = 0; i < tabla.length; i++) {
			for(int j = 0; j < tabla.length; j++) {
				System.out.print(tabla[i][j] + "\t");
			}
			/*Hacemos un salto de linea*/
			System.out.println();
		}
		
		/*Hacemos un salto de linea*/
		System.out.println();
		
		/*Llamamos a la funcion*/
		resultado = desordenar(tabla);
		
		/*Creamos un for para mostrar la tabla al usuario*/
		System.out.println("Tabla desordenada");
		for(int i = 0; i < tabla.length; i++) {
			for(int j = 0; j < tabla[i].length; j++) {
				System.out.print(tabla[i][j] + "\t");
			}
			/*Hacemos un salto de linea*/
			System.out.println();
		}
		
		/*Cerramos el Scanner*/
		sc.close();
	}
	
	/*Creamos una funcion*/
	static int[][] desordenar(int tabla[][]){
		
		/*Creamos una variable que almacene la posicion aleatorio de las filas*/
		int posicionFilas;
		
		/*Creamos una variable que almacene la posicion aleatorio de las columnas*/
		int posicionColumnas;
		
		/*Creamos una variable para almacenar el valor que se intercambia*/
		int valor; 
		
		/*Creamos una clase Random*/
		Random rand = new Random();
		
		/*Creamos un bucle for para recorrer la tabla y cambiar los valores*/
		for(int i = 0; i < tabla.length; i++) {
			for(int j = 0; j < tabla[i].length; j++) {
				
				/*Generamos una posicion aleatoria de filas y columnas*/
				posicionFilas = rand.nextInt(0, 2);
				posicionColumnas = rand.nextInt(0, 2);
				
				/*Almacenamos el valor de la posicion normal en una variable*/
				valor = tabla[i][j];
				
				/*Cambiamos el valor de la posicion normal por el valor de la posicion aleatoria*/
				tabla[i][j] = tabla[posicionFilas][posicionColumnas];
				
				/*Almacenamos el valor inicial en el lugar vacio de la posicion aleatoria*/
				tabla[posicionFilas][posicionColumnas] = valor;
			}
		}
		
		/*Devolvemos la tabla*/
		return tabla;
	}
}
