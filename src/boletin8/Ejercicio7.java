package boletin8;

import java.util.HashSet;
import java.util.Scanner;
import java.util.TreeMap;

public class Ejercicio7 {
	public static void main(String[] args) {
		
		/*Creamos un mapa para almacenar numeros y conjuntos de palabras*/
		TreeMap<Integer, HashSet<String>> palabrasOrdenadas = new TreeMap<Integer, HashSet<String>>();
		
		/*Creamos una coleccion para almacenar las palabras con cada longitud*/
		HashSet<String> palabras = new HashSet<String>();
		
		/*Creamos una variable para almacenar la eleccion del usuario*/
		int eleccion;
		
		/*Creamos una variable para almacenar las palabras que introduzca el usuario*/
		String palabra;
		
		/*Creamos una variable para almacenar la longitud de la palabra que introduzca el usuario*/
		int longitud;
		
		/*Creamos un Scanner*/
		Scanner sc = new Scanner(System.in);
		
		/*Creamos un bucle do while para que si no da una opcion valida volversela a pedir*/
		do {
			/*Mostramos el menu al usuario*/
			System.out.println("Menu:");
			System.out.println("1. Añadir longitud de palabra");
			System.out.println("2. Añadir palabra");
			System.out.println("3. Mostrar las palabras de una longitud");
			System.out.println("4. Salir");
			
			/*Pedimos al usuario que introduzca una opcion*/
			System.out.println("Introduce una opcion");
			
			/*Leemos la eleccion del usuario*/
			eleccion = sc.nextInt();
			sc.nextLine();
		}while(eleccion < 1 || eleccion > 4);
		
		/*Creamos un bucle while para que mientras la eleccion sea diferente a 4 seguir repitiendo*/
		while(eleccion != 4) {
			
			/*Creamos un switch para que depende de la eleccion que introduzca el usuario realizar una funcion u otra*/
			switch(eleccion) {
			
			/*Si la opcion es 1 añadimos una longitud al mapa*/
			case 1 ->{
				
				/*Pedimos al usuario que introduzca una longitud*/
				System.out.println("Introduce una longitud");
				
				/*Leemos la longitud del usuario*/
				longitud = sc.nextInt();
				
				/*Si la longitud ya esta agregada se le avisa al usuario sino se añade la longitud al mapa*/
				if(palabrasOrdenadas.containsKey(longitud)) {
					System.out.println("La longitud ya existe");
				} else {
					/*Añadimos la longitud al mapa*/
					palabrasOrdenadas.put(longitud, new HashSet<>());
				}
			}
			
			/*Si la opcion es 2 añadimos una palabra al conjunto*/
			case 2 ->{
				
				/*Pedimos al usuario que introduzca una palabra*/
				System.out.println("Introduce una palabra");
				
				/*Leemos la palabra del usuario*/
				palabra = sc.nextLine();
				
				/*Si la longitud de la palabra no esta agregada se le avisa al usuario sino se almacena*/
				if(!palabrasOrdenadas.containsKey(palabra.length())) {
					System.out.println("La longitud no existe");
				} else {
					/*Almacenamos las palabras al conjunto asociado a su longitud*/
					palabras = palabrasOrdenadas.get(palabra.length());
				}
				
				/*Si la palabra se añade notificamos al usuario que la palabra se ha añadido correctamente sino mostramos que no se
				 * ha añadido*/
				if(palabras.add(palabra)) {
					System.out.println("La palabra se ha añadido correctamente");
				} else {
					System.out.println("La palabra no se ha añadido correctamente");
				}				
			}
			
			/*Si la opcion es 3 mostramos un conjunto de palabras de la misma longitud*/
			case 3 ->{
				
				/*Pedimos al usuario que introduzca una longitud*/
				System.out.println("Introduce una longitud");
				
				/*Leemos la longitud del usuario*/
				longitud = sc.nextInt();
				
				/*Si la longitud esta en el mapa y el conjunto no esta vacio se le muestra al usuario sino se le notifica que no se encuentran las palabras*/
				if(palabrasOrdenadas.containsKey(longitud) && !palabrasOrdenadas.get(longitud).isEmpty()) {
					System.out.println("Las palabras de longitud " + longitud + " son: " + palabrasOrdenadas.get(longitud));
				} else {
					System.out.println("Las palabras de longitud " + longitud + " no se encuentran en el mapa");
				}
			}
			}
			
			/*Mostramos el menu al usuario*/
			System.out.println("Menu:");
			System.out.println("1. Añadir longitud de palabra");
			System.out.println("2. Añadir palabra");
			System.out.println("3. Mostrar las palabras de una longitud");
			System.out.println("4. Salir");
			
			/*Pedimos al usuario que introduzca una opcion*/
			System.out.println("Introduce una opcion");
			
			/*Leemos la eleccion del usuario*/
			eleccion = sc.nextInt();
			sc.nextLine();
		}
		
		/*Mostramos un mensaje al usuario de que ha salido del programa*/
		System.out.println("Has salido del programa");
		
		/*Cerramos el Scanner*/
		sc.close();
	}
}