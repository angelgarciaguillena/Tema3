package boletin7;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Ejercicio9 {
	public static void main(String[] args) {
		
		/*Creamos una coleccion para almacenar los numeros*/
		TreeMap<Integer, Integer> numeros = new TreeMap<>();
		
		/*Creamos una coleccion para almacenar las estrellas*/
		TreeMap<Integer, Integer> estrellas = new TreeMap<>();
		
		/*Creamos una variable para almacenar el numero introducido por el usuario*/
		int numero;
		
		/*Creamos una variable para almacenar el numero de estrellas introducido por el usuario*/
		int estrella;
		
		/*Creamos una variable para almacenar la opcion del usuario*/
		int opcion;
		
		/*Creamos un Scanner*/
		Scanner sc = new Scanner(System.in);
		
		/*Creamos un bucle do while para que si no da una opcion valida volversela a pedir*/
		do {
			/*Mostramos el menu al usuario*/
			System.out.println("Menu:");
			System.out.println("1. Registrar euromillon");
			System.out.println("2. Mostrar numeros y estrellas");
			System.out.println("0. Salir");
			
			/*Pedimos al usuario que introduzca una opcion*/
			System.out.println("Introduce una opcion");
			
			/*Leemos la opcion del usuario*/
			opcion = sc.nextInt();
			sc.nextLine();
		}while(opcion < 0 || opcion > 2);
		
		/*Creamos un bucle while para que mientras no sea 0 continue añadiendo o mostrando los euromillones*/
		while(opcion != 0) {
			
			/*Creamos un switch para que dependiendo de la eleccion del usuario realice una funcion u otra*/
			switch(opcion) {
			
			/*Si es 1 añadimos un euromillon*/
			case 1 ->{
				
				/*Creamos un bucle for para que el usuario introduzca los cinco numeros*/
				for (int i = 0; i < 5; i++) {
					
					/*Pedimos al usuario que introduzca el numero*/
					System.out.println("Introduce el numero del euromillon");
					
					/*Leemos el numero del usuario*/
	                numero = sc.nextInt();
	                
	                /*Si el numero ya esta en la coleccion sumar 1 al valor sino almacenarlo*/
	                if (numeros.containsKey(numero)) {
	                    numeros.put(numero, numeros.get(numero) + 1);
	                } else {
	                    numeros.put(numero, 1);
	                }
	            }

				/*Creamos un bucle for para que el usuario introduzca las dos estrellas*/
				for (int i = 0; i < 2; i++) {
					
					/*Pedimos al usuario que introduzca el numero de estrellas*/
					System.out.println("Introduce el numero de estrellas");
					
					/*Leemos el numero de estrellas del usuario*/
	                estrella = sc.nextInt();

	                /*Si la estrella ya esta en la coleccion sumar 1 al valor sino almacenarlo*/
	                if (estrellas.containsKey(estrella)) {
	                	
	                	/*Sumamos 1 al valor*/
	                    estrellas.put(estrella, estrellas.get(estrella) + 1);
	                    
	                } else {
	                	
	                	/*Añadimos las estrellas*/
	                    estrellas.put(estrella, 1);
	                }
				}
			}
			
			/*Si es 2 mostramos todos los numeros y estrellas repetidos*/
			case 2 ->{
				
				/*Creamos un bucle for each para mostrar los numeros*/
				for (Map.Entry<Integer, Integer> entry : numeros.entrySet()) {
	                System.out.println("Número " + entry.getKey() + ": " + entry.getValue() + " veces");
	            }
				
				/*Creamos un bucle for each para mostrar las estrellas*/
				for (Map.Entry<Integer, Integer> entry : estrellas.entrySet()) {
	                System.out.println("Estrella " + entry.getKey() + ": " + entry.getValue() + " veces");
	            }
			}
			}
			
			/*Mostramos el menu al usuario*/
			System.out.println("Menu:");
			System.out.println("1. Registrar euromillon");
			System.out.println("2. Mostrar numeros y estrellas");
			System.out.println("0. Salir");
			
			/*Pedimos al usuario que introduzca otra opcion*/
			System.out.println("Introduce otra opcion");
			
			/*Leemos la opcion del usuario*/
			opcion = sc.nextInt();
			sc.nextLine();
		}
		
		/*Notificamos al usuario que ha salido del programa*/
		System.out.println("Has salido del programa");
		
		/*Cerramos el Scanner*/
		sc.close();
	}
}