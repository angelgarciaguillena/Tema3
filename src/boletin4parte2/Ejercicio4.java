package boletin4parte2;

import java.util.Scanner;

public class Ejercicio4 {
	public static void main(String[] args) {
		
		/*Creamos una variable para almacenar el resultado*/
		boolean resultado; 
		
		/*Creamos una tabla bidimensional para almacenar numeros*/
		int tabla[][] = new int[3][3];
		
		/*Creamos un Scanner*/
		Scanner sc = new Scanner(System.in);
		
		/*Creamos un bucle for para pedir al usuario que rellene la tabla*/
		for(int i = 0; i < tabla.length; i++) {
			for(int j = 0; j < tabla[i].length; j++) {
				System.out.println("Introduce un valor para la tabla");
				tabla[i][j] = sc.nextInt();
			}
		}
		
		/*Hacemos un salto de linea*/
		System.out.println();
		
		/*Creamos un bucle for para mostrar la tabla al usuario*/
		for(int i = 0; i < tabla.length; i++) {
			for(int j = 0; j < tabla[i].length; j++) {
				System.out.print(tabla[i][j] + "\t");
			}
			/*Hacemos un salto de linea*/
			System.out.println();
		}
		
		/*Hacemos un salto de linea*/
		System.out.println();
		
		/*Llamamos a la funcion*/
		resultado = esMagica(tabla);
		
		/*Mostramos el resultado al usuario*/
		System.out.println(resultado ? "La matriz es magica" : "La matriz no es magica");
		
		/*Cerramos el Scanner*/
		sc.close();
	}
	
	/*Creamos una funcion*/
	static boolean esMagica(int tabla[][]) {
		
		/*Creamos una variable para saber si la matriz es mágica*/
		boolean magica = true;
		
		/*Creamos una variable contador para recorrer las filas*/
		int contadorI = 0;
		
		/*Creamos una variable contador para recorrer las columnas*/
		int contadorJ = 0;
		
		/*Creamos una variable para almacenar la suma de las filas*/
		int sumaI = 0;
		
		/*Creamos una variable para almacenar la suma de las filas*/
		int sumaJ = 0;
		
		/*Creamos una variable para la suma que tendria que dar cada fila y columna*/
		int sumaTotal = 0;
		
		/*Creamos un bucle for para recorrer la primera fila de la tabla y averiguar cual es la suma que tiene que dar cada fila*/
		for(int j = 0; j < tabla[0].length; j++) {
			sumaTotal += tabla[0][j];
		}
		
		/*Creamos un bucle while para recorrer la tabla*/
		while(contadorI < tabla.length && magica) {
			
			/*Creamos un bucle while para sumar los numeros de las columnas y filas*/
			while(contadorJ < tabla[contadorI].length && magica) {
				sumaI += tabla[contadorI][contadorJ];
				sumaJ += tabla[contadorJ][contadorI];
				contadorJ++;
			}
			
			/*Si la suma de la columna es diferente a la suma total la matriz no sera magica*/
			if(sumaI != sumaTotal || sumaJ != sumaTotal) {
				magica = false;
			}
			
			/*Reseteamos las variables de suma y contadorJ y sumamos 1 al contadorI*/
			sumaI = 0;
			sumaJ = 0;
			contadorJ = 0;
			contadorI++;
		}
		
		/*Devolvemos la variable magica*/
		return magica;
	}
}