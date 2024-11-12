package boletin2;

import java.util.Arrays;
import java.util.Random;

public class Ejercicio6 {
	public static void main(String[] args) {
		
		/*Creamos una variable para almacenar las coincidencias*/
		int coincidencias = 0;
		
		/*Creamos una variable para almacenar la busqueda del array*/
		int busqueda;
		
		/*Creamos una variable que nos servira como contador*/
		int contador = 0;
		
		/*Creamos una variable para almacenar los numeros aleatorios generados por el programa*/
		int numero;
		
		/*Creamos una tabla para almacenar los numeros de la primitiva*/
		int primitiva[] = new int[6];
		
		/*Creamos una tabla con la combinación ganadora y la rellenamos con los numeros ganadores*/
		int combinacion[] = {6, 12, 16, 21, 35, 48};
		
		/*Creamos la clase Random*/
		Random rand = new Random();
		
		/*Creamos un bucle while para generar numeros hasta que el contador no sea mayor a 6*/
		while(contador < 6) {
			
			/*Creamos un numero aleatorio y lo almacenamos*/
			numero = rand.nextInt(1, 51);
			
			/*Ordenamos la tabla para realizar la busqueda*/
			Arrays.sort(primitiva);
			
			/*Hacemos la busqueda del numero aleatorio que ha generado en la tabla en la combinacion que hemos introducido nosotros*/
			busqueda = Arrays.binarySearch(primitiva, numero);
			
			/*Si el numero no esta en la tabla se almacenara en la tabla y se sumara 1 numero introducido al contador para
			 * que el programa sepa que un numero de los seis ha sido almacenado*/
			if(busqueda < 0){
				primitiva[0] = numero;
				contador++;
			}
		}
		
		/*Mostramos la combinacion que ha generado el programa para el usuario y la combinacion ganadora*/
		System.out.println(Arrays.toString(primitiva));
		System.out.println(Arrays.toString(combinacion));
		
		/*Creamos un for each para recorrer la tabla y realizar la busqueda*/
		for(int valor : primitiva) {
			busqueda = Arrays.binarySearch(combinacion, valor);
			
			/*Si la busqueda es mayor a 0 se sumara 1 a coincidencias*/
			if(busqueda >= 0){
				coincidencias++;
			}
		}
		
		/*Mostramos al usuario el numero de coincidencias*/
		System.out.println("El numero de coincidencias es " + coincidencias);
	}
}