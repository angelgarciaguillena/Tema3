package boletin8;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class Ejercicio6 {
	public static void main(String[] args) {
		
		/*Creamos un mapa para almacenar los nombres y sus telefonos*/
		LinkedHashMap<String, LinkedHashSet<String>> nombres = new LinkedHashMap<String, LinkedHashSet<String>>();
		
		/*Creamos una coleccion para almacenar y editar los numeros de telefono*/
		LinkedHashSet<Integer> numeros = new LinkedHashSet<Integer>();
		
		/*Creamos una variable para almacenar la eleccion del usuario*/
		int eleccion;
		
		/*Creamos una variable para almacenar el nombre que quiere introducir*/
		String nombre;
		
		/*Creamos una variable para almacenar el telefono del nombre anterior*/
		int telefono;
		
		/*Creamos un Scanner*/
		Scanner sc = new Scanner(System.in);
		
		/*Creamos un bucle do while para que si no da una opcion valida volversela a pedir*/
		do {
			/*Mostramos el menu al usuario*/
			System.out.println("Menu:");
			System.out.println("1. Añadir persona");
			System.out.println("2. Añadir teléfono a una persona dada");
			System.out.println("3. Mostrar los teléfonos de una persona");
			System.out.println("4. Eliminar teléfono de una persona");
			System.out.println("5. Eliminar una persona");
			System.out.println("6. Salir");
			
			/*Pedimos al usuario que introduzca una opcion*/
			System.out.println("Introduce una opcion");
			
			/*Leemos la eleccion del usuario*/
			eleccion = sc.nextInt();
			sc.nextLine();
		}while(eleccion < 1 || eleccion > 6);
		
		/*Creamos un bucle while para que mientras la eleccion sea diferente a 5 seguir repitiendo*/
		while(eleccion != 6) {
			
			/*Creamos un switch para que depende de la eleccion que introduzca el usuario realizar una funcion u otra*/
			switch(eleccion) {
			
			/*Si la opcion es 1 añadimos el nombre de la persona y su telefono al mapa*/
			case 1 ->{
				
				/*Pedimos al usuario que introduzca el nombre*/
				System.out.println("Introduce un nombre");
				
				/*Leemos el nombre introducido por el usuario*/
				nombre = sc.nextLine();
				
				/*Pedimos al usuario que introduzca el numero de telefono de la persona*/
				System.out.println("Introduce su numero de telefono");
				
				/*Leemos el numero de telefono de la persona*/
				telefono = sc.nextInt();
			}
			
			/*Si la opcion es 2 añadimos otro telefono a una persona que ya estaba en la lista*/
			case 2 ->{
				
			}
			
			/*Si la opcion es 3 mostramos los telefonos de una persona*/
			case 3 ->{
				
				
			}
			
			/*Si la opcion es 4 eliminamos un telefono de una persona*/
			case 4 ->{
				
				
			}
			/*Si es 5 eliminamos a la persona y todos sus numeros*/
			case 5 ->{
				
			}
			}
			
			/*Mostramos el menu al usuario*/
			System.out.println("Menu:");
			System.out.println("1. Añadir persona");
			System.out.println("2. Añadir teléfono a una persona dada");
			System.out.println("3. Mostrar los teléfonos de una persona");
			System.out.println("4. Eliminar teléfono de una persona");
			System.out.println("5. Eliminar una persona");
			System.out.println("6. Salir");
			
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
