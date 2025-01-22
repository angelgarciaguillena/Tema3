package boletin7;

import java.util.Random;
import java.util.TreeSet;

public class Ejercicio4 {
	public static void main(String[] args) {
		
		/*Creamos un ArrayList para almacenar los valores*/
		TreeSet <Integer> numeros = new TreeSet<>();
		
		/*Creamos la clase Random*/
		Random rand = new Random();
		
		/*Creamos un bucle for para generar y almacenar los numeros en la coleccion*/
		for(int i = 0; i < 20; i++) {
			
			/*Generamos un numero aleatorio y lo almacenamos en la coleccion*/
			numeros.add(rand.nextInt(0, 100));
		}
		
		/*Creamos un bucle for each para recorrer la coleccion*/
		for(int valor : numeros) {
			System.out.print(valor + " ");
		}
	}
}