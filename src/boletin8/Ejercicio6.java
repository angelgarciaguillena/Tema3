package boletin8;

import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class Ejercicio6 {
	public static void main(String[] args) {
		
		/*Creamos un mapa para almacenar los nombres y sus telefonos*/
		LinkedHashMap<String, HashSet<Integer>> nombres = new LinkedHashMap<String, HashSet<Integer>>();
		
		/*Creamos una coleccion para almacenar y editar los numeros de telefono*/
		HashSet<Integer> numeros;
		
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
				
				/*Si la persona ya esta agregada se le avisa al usuario sino se añade el nombre al mapa*/
				if(nombres.containsKey(nombre)) {
					System.out.println("La persona ya existe");
					
				} else {
					
					/*Añadimos el nombre al mapa*/
					nombres.put(nombre, new HashSet<>());
				}
			}
			
			/*Si la opcion es 2 añadimos un telefono a una persona que ya estaba en la lista*/
			case 2 ->{
				
				/*Pedimos al usuario que introduzca el nombre al que se le quiere añadir el numero*/
				System.out.println("Introduce un nombre");
				
				/*Leemos el nombre introducido por el usuario*/
				nombre = sc.nextLine();
				
				/*Pedimos al usuario que introduzca el numero de telefono de la persona*/
				System.out.println("Introduce el numero de telefono");
				
				/*Leemos el numero de telefono de la persona*/
				telefono = sc.nextInt();
				
				/*Almacenamos el telefono el conjunto asociado a nombre*/
				numeros = nombres.get(nombre);
				
				/*Si el numero se añade notificamos al usuario que el telefono se ha añadido correctamente sino mostramos que no se
				 * ha añadido*/
				if(numeros.add(telefono)) {
					System.out.println("El telefono se ha añadido correctamente");
				} else {
					System.out.println("El telefono no se ha añadido correctamente");
				}
			}
			
			/*Si la opcion es 3 mostramos los telefonos de una persona*/
			case 3 ->{
				
				/*Pedimos al usuario que introduzca el nombre que quiere buscar*/
				System.out.println("Introduce un nombre");
				
				/*Leemos el nombre introducido por el usuario*/
				nombre = sc.nextLine();
				
				/*Si el nombre se encuentra en el mapa y no esta vacio mostraremos el nombre y el telefono al usuario sino se
				 * notificara que no se encuentra en el mapa*/
				if(nombres.containsKey(nombre) && !nombres.get(nombre).isEmpty()) {
					System.out.println("El telefono de " + nombre + " es: " + nombres.get(nombre));
				} else {
					System.out.println("La persona no se encuentra en la lista");
				}
			}
			
			/*Si la opcion es 4 eliminamos un telefono de una persona*/
			case 4 ->{
				
				/*Pedimos al usuario que introduzca el nombre al que pertenece el numero que quiere eliminar*/
				System.out.println("Introduce un nombre");
				
				/*Leemos el nombre introducido por el usuario*/
				nombre = sc.nextLine();
				
				/*Si el nombre se encuentra en el mapa*/
				if(nombres.containsKey(nombre)) {
					
					/*Pedimos al usuario que introduzca el numero de telefono que quiere eliminar*/
					System.out.println("Introduce el numero de telefono");
					
					/*Leemos el numero de telefono de la persona*/
					telefono = sc.nextInt();
					
					/*Guardamos el numero en una nueva lista*/
					numeros = nombres.get(nombre);
					
					/*Si el telefono se elimina se notifica al usuario que se ha eliminado sino se le avisa que no se ha realizado*/
					if(numeros.remove(telefono)) {
						System.out.println("El telefono se ha eliminado correctamente");
					} else {
						System.out.println("El telefono no se ha eliminado");
					}
				} else {
					
					/*Notificamos al usuario que la persona no se encuentra en el mapa*/
					System.out.println("La persona no se encuentra en la lista");
				}
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