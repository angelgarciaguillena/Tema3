package boletin8;

import java.util.LinkedHashSet;
import java.util.Random;

public class Ejercicio2 {
	public static void main(String[] args) {
		
		/*Creamos una variable para almacenar el numero generado*/
		int numero;
		
		/*Creamos una coleccion para almacenar los numeros*/
		LinkedHashSet<Integer> numeros = new LinkedHashSet<>();
		
		/*Creamos la clase Random*/
		Random rand = new Random();
		
		/*Creamos un bucle for para generar y almacenar los numeros en la coleccion*/
		for(int i = 0; i < 10; i++) {
			
			/*Generamos un numero aleatorio entre el 0 y el 20*/
			numero = rand.nextInt(0, 21);
			
			/*Creamos un bucle while para que si el numero esta repetido generar otro*/
			while(!numeros.add(numero)) {
				
				/*Generamos un numero aleatorio entre el 0 y el 20*/
				numero = rand.nextInt(0, 21);
			}
			
			/*Almacenamos el numero en la coleccion*/
			numeros.add(numero);
		}
		
		/*Mostramos la lista por pantalla*/
		System.out.println(numeros);
	}
}