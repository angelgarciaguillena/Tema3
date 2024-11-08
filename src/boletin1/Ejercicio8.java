package boletin1;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio8 {
	public static void main(String[] args) {
		
		/*Creamos una tabla para almacenar los numeros*/
		int numeros[] = new int[100];
		
		/*Creamos una variable para almacenar el numero del usuario*/
		int numero;
		
		/*Creamos el Scanner*/
		Scanner sc = new Scanner(System.in);
		
		/*Creamos la clase Random*/
		Random rand = new Random();
		
		/*Pedimos un numero al usuario para buscarlo en la tabla*/
		System.out.println("Introduce un valor");
		
		/*Leemos el numero introducido por el usuario*/
		numero = sc.nextInt();
		
		/*Creamos un for para llenar la tabla con numeros aleatorios*/
		for(int i = 0; i < numeros.length; i++) {
			numeros[i] = rand.nextInt(1, 11);
			
			/*Si el numero introducido es igual al añadido en la tabla se muestra la posicion en la que se ha añadido*/
			if(numeros[i] == numero) {
				System.out.println(i);
			}
		}
			
		/*Cerramos el Scanner*/
		sc.close();
	}
}
