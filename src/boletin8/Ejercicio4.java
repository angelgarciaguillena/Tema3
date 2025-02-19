package boletin8;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class Ejercicio4 {
	public static void main(String[] args) {
		
		/*Creamos una lista para almacenar los nombres de las personas*/
		LinkedList<String> nombres = new LinkedList<>();
		
		/*Creamos una variable para almacenar la eleccion del usuario*/
		int eleccion;
		
		/*Creamos una variable para almacenar el nombre introducido por el usuario*/
		String nombre;
		
		/*Creamos el Scanner*/
		Scanner sc = new Scanner(System.in);
		
		/*Creamos un bucle do while para que si no da una opcion valida volversela a pedir*/
		do {
			/*Mostramos el menu al usuario*/
			System.out.println("Menu:");
			System.out.println("1. Añadir nuevo nombre a la lista");
			System.out.println("2. Elimina un nombre específico");
			System.out.println("3. Ordena la lista alfabéticamente");
			System.out.println("4. Busca si un nombre específico está en la lista");
			System.out.println("5. Salir");
			
			/*Pedimos al usuario que introduzca una opcion*/
			System.out.println("Introduce una opcion");
			
			/*Leemos la eleccion del usuario*/
			eleccion = sc.nextInt();
			sc.nextLine();
		}while(eleccion < 1 || eleccion > 5);
		
		/*Creamos un bucle while para que mientras la eleccion sea diferente a 5 seguir repitiendo*/
		while(eleccion != 5) {
			
			/*Creamos un switch para que depende de la eleccion que introduzca el usuario realizar una funcion u otra*/
			switch(eleccion) {
			
			/*Si es 1 añadimos un nombre introducido por el usuario a la lista*/
			case 1 ->{
				/*Pedimos al usuario que introduzca un nombre para almacenarlo*/
				System.out.println("Introduce un nombre para almacenarlo");
				
				/*Leemos el nombre introducido por el usuario*/
				nombre = sc.nextLine();
				
				/*Añadimos el nombre a la lista*/
				nombres.add(nombre);
			}
			
			/*Si es 2 preguntamos al usuario el nombre que quiere eliminar de la lista*/
			case 2 ->{
				
				/*Pedimos al usuario que introduzca el nombre que quiere eliminar*/
				System.out.println("Introduce el nombre que quieres eliminar");
				
				/*Leemos el nombre que quiere eliminar el usuario*/
				nombre = sc.nextLine();
				
				/*Eliminamos el nombre de la lista*/
				nombres.remove(nombre);
			}
			
			/*Si es 3 ordenamos la lista alfabeticamente*/
			case 3 ->{
				
				/*Ordenamos la lista*/
				Collections.sort(nombres);
				
				/*Mostramos al usuario la lista ordenada*/
				System.out.println(nombres);
			}
			
			/*Si es 4 buscamos si el nombre esta en la lista*/
			case 4 ->{
				
				/*Pedimos al usuario que introduzca el nombre que quiere buscar*/
				System.out.println("Introduce el nombre que quieres buscar");
				
				/*Leemos el nombre que quiere buscar el usuario*/
				nombre = sc.nextLine();
				
				/*Si el nombre se encuentra en la lista mostrar al usuario que esta sino mostrarle que no esta*/
				if(nombres.contains(nombre)) {
					System.out.println("El nombre introducido se encuentra en la lista");
				} else {
					System.out.println("El nombre introducido no se encuentra en la lista");
				}
			}
			}
			
			/*Mostramos el menu al usuario*/
			System.out.println("Menu:");
			System.out.println("1. Añadir nuevo nombre a la lista");
			System.out.println("2. Elimina un nombre específico");
			System.out.println("3. Ordena la lista alfabéticamente");
			System.out.println("4. Busca si un nombre específico está en la lista");
			System.out.println("5. Salir");
			
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