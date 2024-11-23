package boletin4parte2;

import java.util.Scanner;

public class Ejercicio3 {
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
		resultado = simetria(tabla);
		
		/*Mostramos el resultado al usuario*/
		System.out.println(resultado ? "La tabla es simetrica" : "La tabla no es simetrica");
		
		/*Cerramos el Scanner*/
		sc.close();
	}
	
	/*Creamos una funcion*/
	static boolean simetria(int tabla[][]) {
		
		/*Creamos una variable que indique si la tabla es simetrica o no*/
		boolean simetria = true;
		
		/*Creamos una variable que nos servira como contador en linea*/
		int contadorI = 0;
		
		/*Creamos una variable que nos servira como contador en columna*/
		int contadorJ = 0;
		
		/*Creamos un bucle while para recorrer la tabla mientras no se recorra entera y mientras no sea mayor del limite de la tabla*/
		while(simetria && contadorI < tabla.length) {
			while(simetria && contadorJ < tabla[contadorI].length) {
				
				/*Creamos un if para que si la tabla invertida no es igual, la simetria es falsa y sino sumar 1 al contador de columnas*/
				if(tabla[contadorI][contadorJ] != tabla[contadorJ][contadorI]) {
					simetria = false;
				} 
				
				/*Sumo 1 al contador*/
				contadorJ++;
			}
			contadorI++;
		}
		
		/*Devolver simetria*/
		return simetria;
	}
}