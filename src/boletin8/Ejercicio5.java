package boletin8;

import java.util.LinkedHashMap;
import java.util.Scanner;

public class Ejercicio5 {
	public static void main(String[] args) {
		
		/*Creamos un mapa para almacenar los nombres de las series y su valoracion*/
		LinkedHashMap<String, Integer> series = new LinkedHashMap<>();
		
		/*Creamos una variable para almacenar la eleccion del usuario*/
		int eleccion;
		
		/*Creamos una variable para almacenar el nombre de la serie*/
		String serie;
		
		/*Creamos una variable para almacenar la valoracion de la serie*/
		int valoracion;
		
		/*Creamos el Scanner*/
		Scanner sc = new Scanner(System.in);
		
		/*Creamos un bucle do while para que si no da una opcion valida volversela a pedir*/
		do {
			/*Mostramos el menu al usuario*/
			System.out.println("Menu:");
			System.out.println("1. Agregar serie");
			System.out.println("2. Buscar serie");
			System.out.println("3. Eliminar serie");
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
			
			/*Si es 1 agregamos el nombre de la serie y la valoracion al mapa y mostramos el mapa*/
			case 1 ->{
				
				/*Pedimos al usuario que introduzca el nombre de la serie*/
				System.out.println("Introduce el nombre de la serie");
				
				/*Leemos el nombre de la serie introducido por el usuario*/
				serie = sc.nextLine();
				
				/*Pedimos al usuario que introduzca la valoracion de la serie*/
				System.out.println("Introduce la valoracion de la serie del 1 al 10");
				
				/*Leemos la valoracion de la serie*/
				valoracion = sc.nextInt();
				
				/*Añadimos el nombre y la valoracion al mapa*/
				series.put(serie, valoracion);
				
				/*Mostramos el mapa al usuario*/
				System.out.println(series);
			}
			
			/*Si es 2 buscamos la serie en el mapa*/
			case 2 ->{
				
				/*Preguntamos al usuario que introduzca el nombre de la serie que desea buscar*/
				System.out.println("Introduce el nombre de la serie que quiere buscar");
				
				/*Leemos el nombre de la serie que quiere buscar*/
				serie = sc.nextLine();
				
				/*Si la serie se ha encontrado devolvemos la serie con su puntuacion sino se lo notificamos al usuario*/
				if(series.containsKey(serie)) {
					System.out.println("La serie " + serie + " tiene una puntuacion de " + series.get(serie) + " puntos");
				} else {
					System.out.println("La serie " + serie + " no se ha encontrado en el mapa");
				}
			}
			
			/*Si es 3 eliminamos una serie*/
			case 3 ->{
				
				/*Preguntamos al usuario que introduzca el nombre de la serie que desea eliminar*/
				System.out.println("Introduce el nombre de la serie que quiere buscar");
				
				/*Leemos el nombre de la serie que quiere eliminar*/
				serie = sc.nextLine();
				
				/*Eliminamos la serie*/
				series.remove(serie);
				
				/*Mostramos el mapa al usuario*/
				System.out.println(series);
			}
			}
			
			/*Mostramos el menu al usuario*/
			System.out.println("Menu:");
			System.out.println("1. Agregar serie");
			System.out.println("2. Buscar serie");
			System.out.println("3. Eliminar serie");
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