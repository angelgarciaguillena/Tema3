package boletin1;

import java.util.Scanner;

public class Ejercicio5 {
	public static void main(String[] args) {
		
		/*Creamos una variable para almacenar la suma de los numeros*/
		int suma = 0;
		
		/*Creamos una variable que almacene el minimo*/
		int minimo = 0;
		
		/*Creamos una variable que almacene el maximo*/
		int maximo = 0;
		
		/*Creamos una tabla que almacene los numeros*/
		int numeros[] = new int[10];
		
		/*Creamos un Scanner*/
		Scanner sc = new Scanner(System.in);
		
		/*Creamos un bucle for para pedir los 10 numeros al usuario y alamcenarlos en la tabla*/
		for(int i = 0; i < numeros.length; i++) {
			System.out.println("Introduce un numero:");
			numeros[i]= sc.nextInt();
		}
		
		/*Creamos un bucle para ir sacando los numeros, ir sumandolos y mostrar cual es el maximo y el minimo de los dos*/
		for(int i = 0; i < numeros.length; i++) {
			suma += numeros[i];
			
			/*Creamos un if para indicar que al ser el primer numero es el maximo y minimo a la vez*/
			if(i == 0) {
				minimo = numeros[i];
				maximo = numeros[i];
			}
			
			/*Creamos un if para identificar cual es el numero maximo y minimo*/
			if(numeros[i] >= maximo) {
				maximo = numeros[i];
			} else if (numeros[i] <= minimo) {
				minimo = numeros[i];
			}
				
		}
		
		/*Mostramos al usuario el maximo, el minimo y la suma*/
		System.out.println("El numero maximo es " + maximo);
		System.out.println("El numero minimo es " + minimo);
		System.out.println("La suma de todos los numeros es " + suma);
		
		/*Cerramos el Scanner*/
		sc.close();
		
		
	}
}
