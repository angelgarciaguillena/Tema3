package boletin1;

import java.util.Scanner;

public class Ejercicio7 {
	public static void main(String[] args) {
		
		/*Creamos una tabla para almacenar la temperatura de cada mes*/
		int temperaturas[] = new int[12];
		
		/*Creo una tabla con los meses para imprimirlo despues*/
		String mes[] = new String[12];
		mes[0] = "Enero";
		mes[1] = "Febrero";
		mes[2] = "Marzo";
		mes[3] = "Abril";
		mes[4] = "Mayo";
		mes[5] = "Junio";
		mes[6] = "Julio";
		mes[7] = "Agosto";
		mes[8] = "Septiembre";
		mes[9] = "Octubre";
		mes[10] = "Noviembre";
		mes[11] = "Diciembre";
		
		/*Creamos un Scanner*/
		Scanner sc = new Scanner(System.in);
		
		/*Creamos un for para pedir la temperatura media de cada mes y almacenarlo en una tabla*/
		for(int i = 0; i < temperaturas.length; i++) {
			System.out.println("Introduce la temperatura:");
			temperaturas[i] = sc.nextInt();		
		}
		
		/*Creamos un for que se repite hasta que el tamaño de la tabla sea menor que la variable inicializada j*/
		for(int j = 0; j < temperaturas.length; j++) {
			
			/*Mostramos la temperatura con el mes correspondiente*/
			System.out.print(mes[j] + ": ");

			/*Creamos un for que se repite para mostrar el grafico de barras segun el numero de tabla*/
			for(int k = 1; k <= temperaturas[j]; k++) {
				
				/*Mostramos el grafico de barras*/
				System.out.print("*");
			}
			
			/*Hacemos un salto de linea*/
			System.out.println();
		}
		/*Cerramos el Scanner*/
		sc.close();
	}
}
