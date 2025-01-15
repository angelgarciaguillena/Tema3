package boletin7;

import java.util.ArrayList;
import java.util.Random;

public class Ejercicio2 {
	public static void main(String[] args) {
		
		/*Creamos una variable para almacenar la suma*/
		int suma = 0;
		
		/*Creamos una variable para almacenar la media*/
		int media = 0;
		
		/*Creamos una variable para almacenar el maximo*/
		int maximo = 0;
		
		/*Creamos una variable para almacenar el minimo*/
		int minimo = 0;
		
		/*Creamos una variable para almacenar el tamaño del ArrayList*/
		int tamaño;
		
		/*Creamos un ArrayList para almacenar valores*/
		ArrayList<Integer> numeros = new ArrayList<>();
				
		/*Creamos la clase Random*/
		Random rand = new Random();
		
		/*Asignamos un tamaño a la variable*/
		tamaño = rand.nextInt(5, 11);
		
		/*Creamos un bucle for para almacenar los valores en el ArrayList*/
		for(int i = 0; i < tamaño; i++) {
			
			/*Generamos un numero aleatorio*/
			numeros.add(rand.nextInt(0, 101));
		}
		
		/*Creamos un bucle for para realizar la suma de los numeros*/
		for(int i = 0; i < tamaño; i++) {
			
			/*Calculamos la suma*/
			suma += numeros.get(i);
			
			/*Calculamos la media*/
			media = suma / tamaño;
			
			/*Si i es igual a 0 almacenar el primer numero en las variables*/
			if(i == 0) {
				maximo = numeros.get(i);
				minimo = numeros.get(i);
			}
			
			/*Calculamos el maximo*/
			maximo = Math.max(maximo, numeros.get(i));
			
			/*Calculamos el minimo*/
			maximo = Math.max(maximo, numeros.get(i));
		}
		
		/*Mostramos la suma al usuario*/
		System.out.println("La suma de los numeros es " + suma);
		
		/*Mostramos la media al usuario*/
		System.out.println("La media de los numeros es " + media);
		
		/*Mostramos el maximo al usuario*/
		System.out.println("El numero maximo es " + maximo);
		
		/*Mostramos la media al usuario*/
		System.out.println("El numero minimo es " + minimo);
	}
}
