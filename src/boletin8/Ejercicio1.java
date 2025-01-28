package boletin8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Ejercicio1 {
	public static void main(String[] args) {
		
		/*Creamos una lista para almacenar numeros enteros*/
		ArrayList<Integer> numeros = new ArrayList<>();
		
		/*Creamos una lista para almacenar numeros enteros desordenados*/
		ArrayList<Integer> numerosDesordenados = new ArrayList<>();
		
		/*Creamos una variable para almacenar los numeros*/
		int numero;
		
		/*Creamos la clase Random*/
		Random rand = new Random();
		
		/*Creamos un bucle for para generar 10 numeros y almacenarlos en la lista*/
		for(int i = 0; i <= 10; i++) {
			
			/*Generamos un numero aleatorio entre el 1 y el 10*/
			numero = rand.nextInt(0, 11);
			
			/*Almacenamos el numero en la lista*/
			numeros.add(numero);
		}
		
		/*Copiamos la primera lista en la segunda lista*/
		numerosDesordenados.addAll(numeros);
		
		/*Desordenamos los elementos de la lista*/
		Collections.shuffle(numerosDesordenados);
		
		/*Mostramos la lista origen*/
		System.out.println(numeros);
		
		/*Mostramos la lista desordenada*/
		System.out.println(numerosDesordenados);
	}
}