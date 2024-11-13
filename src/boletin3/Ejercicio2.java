package boletin3;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio2 {
	public static void main(String[] args) {
		
		/*Creamos una variable para almacenar la nota media*/
		double notaMedia = 0;
		
		/*Creamos la tabla para almacenar las notas*/
		double notas [][] = new double [4][5];
		
		/*Creamos el Scaner*/
		Scanner sc = new Scanner(System.in);
		
		/*Creamos un bucle for para que el usuario introduzca las notas*/
		for(int fila = 0; fila < notas.length; fila++) {
			System.out.println("Introduce las notas del alumno " + (fila + 1) + ":");
			for(int columna = 0; columna < notas[fila].length; columna++) {
				
				/*Pedimos las notas al usuario*/
				System.out.println("Introduce la nota " + (columna + 1) + ":");
				
				/*Leemos la nota introducida por el usuario*/
				notas[fila] [columna] = sc.nextDouble();
			}
		}
		
		/*Creamos un bucle for para imprimir en la pantalla la palabra nota*/
		System.out.print("\t");
		for(int i = 1; i <= 5; i++) {
			System.out.print("\tNota " + i);
		}
		
		/*Hacemos un salto de linea*/
		System.out.println();
		
		/*Creamos un bucle for para mostrar las notas por pantalla y el alumno que tiene la nota*/
		for(int i = 0; i < notas.length; i++) {
			
			/*Ordenamos la tabla*/
			Arrays.sort(notas[i]);
			
			/*Creamos un for para mostrar el alumno y las notas de cada alumno*/
			System.out.print("Alumno " + (i + 1) + "\t");
			for(int j = 0; j < notas[i].length; j++) {
				System.out.print(notas [i][j] + "\t");
			}
			
			/*Creamos un for each para recorrer la tabla y sumar las notas de cada alumno para hacer la media*/
			for(double valor : notas[i]) {
				notaMedia += valor;
			}
			
			/*Hacemos un salto de linea*/
			System.out.println();
			
			/*Mostramos al usuario la nota maxima, minima y media de cada alumno*/
			System.out.println("La nota maxima del alumno " + (i + 1) + " es " + notas [i][4]);
			System.out.println("La nota minima del alumno " + (i + 1) + " es " + notas [i][0]);
			System.out.println("La nota media del alumno " + (i + 1) + " es " + (notaMedia/5));
			
			/*Reiniciamos la variable*/
			notaMedia = 0;
		}
				
		/*Cerramos el Scanner*/
		sc.close();
		
	}
}