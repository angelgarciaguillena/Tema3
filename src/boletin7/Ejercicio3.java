package boletin7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Ejercicio3 {
	public static void main(String[] args) {
		
		/*Creamos un para almacenar los valores*/
		ArrayList <Integer> numeros = new ArrayList<>();
		
		/*Creamos la clase random*/
		Random rand = new Random();
		
		/*Creamos un bucle for para generar 30 numeros aleatorios*/
		for(int i = 0; i < 30; i++) {
			
			/*Generamos un numero aleatorio y lo almacenamos en la variable*/
			numeros.add(rand.nextInt(1, 11));
		}
		
		/*Ordenamos los numeros*/
		Collections.sort(numeros);
		
		/*Creamos un bucle for each para recorrer y mostrar la coleccion*/
		for(int valor : numeros) {
			System.out.print(valor + " ");
		}
	}
}