package boletin8;

import java.util.HashSet;
import java.util.Scanner;
import java.util.TreeMap;

public class Ejercicio8 {
	public static void main(String[] args) {
		
		/*Creamos un mapa para almacenar categorias  y una lista de tareas*/
		TreeMap<String, HashSet<String>> categorias = new TreeMap<String, HashSet<String>>();
		
		/*Creamos una coleccion para almacenar las tareas*/
		HashSet<String> listaTareas= new HashSet<String>();
		
		/*Creamos una variable para almacenar la eleccion del usuario*/
		int eleccion;
		
		/*Creamos una variable para almacenar la categoria*/
		String categoria;
		
		/*Creamos una variable para almacenar una tarea*/
		String tarea = "";
		
		/*Creamos un Scanner*/
		Scanner sc = new Scanner(System.in);
		
		/*Creamos un bucle do while para que si no da una opcion valida volversela a pedir*/
		do {
			/*Mostramos el menu al usuario*/
			System.out.println("Menu:");
			System.out.println("1. Añadir categoria");
			System.out.println("2. Añadir tarea");
			System.out.println("3. Eliminar tarea");
			System.out.println("4. Mostrar tareas");
			System.out.println("5. Eliminar categoria");
			System.out.println("6. Salir");
			
			/*Pedimos al usuario que introduzca una opcion*/
			System.out.println("Introduce una opcion");
			
			/*Leemos la eleccion del usuario*/
			eleccion = sc.nextInt();
			sc.nextLine();
		}while(eleccion < 1 || eleccion > 6);
		
		/*Creamos un bucle while para que mientras la eleccion sea diferente a 6 seguir repitiendo*/
		while(eleccion != 6) {
			
			/*Creamos un switch para que depende de la eleccion que introduzca el usuario realizar una funcion u otra*/
			switch(eleccion) {
			
			/*Si la opcion es 1 añadimos una categoria al mapa*/
			case 1 ->{
				
				/*Pedimos al usuario que introduzca una categoria*/
				System.out.println("Introduce una categoria");
				
				/*Leemos la categoria del usuario*/
				categoria = sc.nextLine();
				
				/*Si la categoria ya esta agregada se le avisa al usuario sino se añade la categoria al mapa*/
				if(categorias.containsKey(categoria)) {
					System.out.println("La categoria ya existe");
				} else {
					/*Añadimos la nueva categoria al mapa*/
					categorias.put(categoria, new HashSet<String>());
				}
			}
			
			/*Si la opcion es 2 añadimos una nueva tarea a la lista*/
			case 2 ->{
				
				/*Pedimos al usuario que introduzca una categoria*/
				System.out.println("Introduce una categoria");
				
				/*Leemos la categoria del usuario*/
				categoria = sc.nextLine();
				
				/*Si la categoria de la tarea no esta agregada se le avisa al usuario sino se almacena*/
				if(!categorias.containsKey(categoria)) {
					System.out.println("La categoria no existe");
				} else {
					/*Almacenamos las tareas al conjunto asociado a su categoria*/
					listaTareas = categorias.get(categoria);
					
					/*Pedimos al usuario que introduzca una tarea*/
					System.out.println("Introduce una tarea");
					
					/*Leemos la tarea del usuario*/
					tarea = sc.nextLine();
					
					/*Si la tarea se añade notificamos al usuario que la tarea se ha añadido correctamente sino mostramos que no se
					 * ha añadido*/
					if(listaTareas.add(tarea)) {
						System.out.println("La tarea se ha añadido correctamente");
					} else {
						System.out.println("La tarea no se ha añadido correctamente");
					}	
				}						
			}
			
			/*Si la opcion es 3 eliminamos una tarea*/
			case 3 ->{
				
				/*Pedimos al usuario que introduzca una categoria*/
				System.out.println("Introduce una categoria");
				
				/*Leemos la categoria del usuario*/
				categoria = sc.nextLine();
				
				/*Si la categoria de la tarea no esta agregada se le avisa al usuario sino se almacena*/
				if(!categorias.containsKey(categoria)) {
					System.out.println("La categoria no existe");
				} else {
					/*Almacenamos las tareas al conjunto asociado a su categoria*/
					listaTareas = categorias.get(categoria);
					
					/*Pedimos al usuario que introduzca una tarea*/
					System.out.println("Introduce una tarea");
					
					/*Leemos la tarea del usuario*/
					tarea = sc.nextLine();
					
					/*Si la tarea se elimina notificamos al usuario que la tarea se ha eliminado correctamente sino mostramos que no se
					 * ha eliminado*/
					if(listaTareas.remove(tarea)) {
						System.out.println("La tarea se ha eliminado correctamente");
					} else {
						System.out.println("La tarea no se ha eliminado");
					}	
				}
			}
			
			/*Si la opcion es 4 mostramos las tareas por categorias*/
			case 4 ->{
				/*Pedimos al usuario que introduzca una categoria*/
				System.out.println("Introduce una categoria");
				
				/*Leemos la categoria del usuario*/
				categoria = sc.nextLine();
				
				/*Si la categoria ya esta agregada mostramos las tareas de la categoria sino avisamos al usuario de que la categoria no se encuentra*/
				if(categorias.containsKey(categoria)) {
					System.out.println(categorias.get(categoria));
				} else {
					System.out.println("La categoria no se encuentra en el mapa");
				}
			}
			
			/*Si la opcion es 5 eliminamos una categoria y sus tareas*/
			case 5 ->{
				/*Pedimos al usuario que introduzca una categoria*/
				System.out.println("Introduce una categoria");
				
				/*Leemos la categoria del usuario*/
				categoria = sc.nextLine();
				
				/*Si la categoria esta en la lista la eliminamos y se avisa al usuario que se ha eliminado correctamente sino mostramos que no se ha eliminado*/
				if(categorias.containsKey(categoria)) {
					
					/*Eliminamos la categoria*/
					categorias.remove(categoria);
					
					/*Mostramos un mensaje de que se ha eliminado*/
					System.out.println("La categoria se ha eliminado");
					
				} else {
					System.out.println("La categoria no se ha eliminado");
				}
			}
			}
			
			/*Mostramos el menu al usuario*/
			System.out.println("Menu:");
			System.out.println("1. Añadir categoria");
			System.out.println("2. Añadir tarea");
			System.out.println("3. Eliminar tarea");
			System.out.println("4. Mostrar tareas");
			System.out.println("5. Eliminar categoria");
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
