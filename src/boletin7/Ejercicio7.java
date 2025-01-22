package boletin7;

import java.util.Scanner;
import java.util.TreeMap;

public class Ejercicio7 {
	public static void main(String[] args) {
		
		/*Creamos una variable para almacenar la opcion del usuario*/
		int opcion;
		
		/*Creamos una variable para almacenar la palabra en español del usuario*/
		String palabraEspañol;
		
		/*Creamos una variable para almacenar la palabra en español del usuario*/
		String palabraIngles;
		
		/*Creamos una variable para almaenar la palabra a buscar*/
		String palabraBusqueda;
		
		/*Creamos una coleccion para almacenar las palabras*/
		TreeMap<String, String> palabras = new TreeMap<>();
		
		/*Creamos el Scanner*/
		Scanner sc = new Scanner(System.in);
		
		/*Mostramos el menu al usuario*/
		System.out.println("1. Inserta palabra");
		System.out.println("2. Busca palabra");
		System.out.println("0. Salir");
		
		/*Creamos un bucle do while para que si no da una opcion valida volversela a pedir*/
		do {
			/*Pedimos al usuario que introduzca una opcion*/
			System.out.println("Introduce una opcion");
			
			/*Leemos la opcion del usuario*/
			opcion = sc.nextInt();
			sc.nextLine();
		}while(opcion < 0 && opcion > 2);
		
		/*Creamos un bucle while para que mientras no sea 0 continue añadiendo o mostrando las palabras*/
		while(opcion != 0) {
			
			/*Creamos un switch para que dependiendo de la eleccion del usuario realice una funcion u otra*/
			switch(opcion) {
			
			/*Si es 1 añadimos palabras al diccionario*/
			case 1 ->{
				
				/*Pedimos al usuario que introduzca la palabra en español*/
				System.out.println("Introduce la palabra en español");
				
				/*Leemos la palabra en español del usuario*/
				palabraEspañol = sc.nextLine();
				
				/*Pedimos al usuario que introduzca la palabra en ingles*/
				System.out.println("Introduce la palabra en ingles");
				
				/*Leemos la palabra en ingles del usuario*/
				palabraIngles = sc.nextLine();
				
				/*Añadimos la palabra a la coleccion*/
				palabras.put(palabraEspañol, palabraIngles);
			}
			/*Si es 2 mostramos el diccionario*/
			case 2 ->{
				
				/*Pedimos al usuario que introduzca la palabra a buscar la traduccion*/
				System.out.println("Introduce la palabra que quieres buscar");
				
				/*Leemos la palabra a buscar del usuario*/
				palabraBusqueda = sc.nextLine();
				
				/*Si la busqueda es nula mostrar al usuario que la palabra no es valida pero sino mostrar la traduccion*/
				if(palabras.get(palabraBusqueda) == null) {
					/*Notificamos al usuario de que la palabra no se ha encontrado*/
					System.out.println("Palabra no encontrada");
				} else {
					/*Mostramos la traduccion de la palabra*/
					System.out.println("Palabra traducida: " + palabras.get(palabraBusqueda));
				}
			}
			}
			
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