package boletin3;

import java.util.Arrays;
import java.util.Random;

public class Ejercicio5 {
	public static void main(String[] args) {
		
		/*Creamos una tabla para almacenar los numeros*/
		int tabla[][] = new int [4][5];
		
		/*Creamos una variable para almacenar la suma de los numeros de cada fila o columna*/
		int suma = 0;
		
		/*Creamos una variable para almacenar la suma de todos los numeros de la tabla*/
		int sumaTotal = 0;
		
		/*Creamos la clase Random*/
		Random rand = new Random();
		
		/*Creamos un bucle for para rellenar la tabla con la suma de los valores aleatorios*/
		for(int i = 0; i < tabla.length; i++) {
			for(int j = 0; j < tabla[i].length; j++) {
				tabla[i][j]= rand.nextInt(100,1000);
			}
		}
		
		/*Creamos un bucle for para imprimir la suma de las filas*/
		for(int i = 0; i < tabla.length; i++) {
			
			/*Reseteamos la variable*/
			suma = 0;
			
			for(int j = 0; j < tabla[i].length; j++){
				
				/*Sumamos cada numero de la fila en una variable*/
				suma += tabla[i][j];
			}
			/*Mostramos la suma de cada fila al usuario y la tabla*/
			System.out.println(Arrays.toString(tabla[i]) + " " + suma);
		}
		
		/*Creamos un bucle for para imprimir la suma de las columnas*/
		for(int j = 0; j < tabla[0].length; j++) {
			
			/*Reseteamos la variable*/
			suma = 0;
			
			for(int i = 0; i < tabla.length; i++) {
				
				/*Sumamos cada numero de la columna en la variable*/
				suma += tabla[i][j];
				
				/*Sumamos cada numero en una variable para mostrar despues la suma de todos los numeros*/
				sumaTotal += suma;
			}
			/*Imprimimos la suma de las columnas*/
			System.out.print(suma + " ");
		}
		
		/*Mostramos al usuario la suma de todo en total*/
		System.out.print(sumaTotal);
	}
}