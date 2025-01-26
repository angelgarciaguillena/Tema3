package boletin7;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ejercicio10 {
	public static void main(String[] args) {
		
		/*Creamos un mapa para almacenar los productos y el precio*/
		HashMap<String, String> productos = new HashMap<>();
		
		/*Creamos una variable para almacenar la eleccion del usuario*/
		int eleccion;
		
		/*Creamos una variable para que almacene el nombre del producto introducido por el usuario*/
		String producto;
		
		/*Creamos una variable para que almacene el precio del producto introducido por el usuario*/
		String precio;
		
		/*Creamos un Scanner*/
		Scanner sc = new Scanner(System.in);
		
		/*Creamos un bucle do while para que si no da una opcion valida volversela a pedir*/
		do {
			/*Mostramos el menu al usuario*/
			System.out.println("Menu:");
			System.out.println("1. Alta de producto");
			System.out.println("2. Baja de producto");
			System.out.println("3. Listar existencias");
			System.out.println("0. Salir");
			
			/*Pedimos al usuario que introduzca un numero*/
			System.out.println("Introduce un numero entre las opciones");
			
			/*Leemos la eleccion del usuario*/
			eleccion = sc.nextInt();
			sc.nextLine();
		}while(eleccion < 0 || eleccion > 3);
		
		/*Creamos un bucle while para que mientras no sea 0 continue realizando 1 de las opciones del menu*/
		while(eleccion != 0) {
			
			/*Creamos un switch para que dependiendo de lo que introduzca el usuario realice una funcion u otra*/
			switch(eleccion) {
			
			/*Si es 1 añadimos un producto al mapa*/
			case 1 ->{
				
				/*Pedimos al usuario que introduzca el nombre del producto*/
				System.out.println("Introduce el nombre del producto");
				
				/*Leemos el nombre introducido por el usuario*/
				producto = sc.nextLine().trim();
				
				/*Pedimos al usuario que introduzca el precio*/
				System.out.println("Introduce el precio del producto");
				
				/*Leemos el precio del producto introducido por el usuario*/
				precio = sc.nextLine().trim();
				
				/*Añadimos el producto con su precio al mapa*/
				productos.put(producto, precio);
			}
			
			/*Si es 2 eliminamos un producto del mapa*/
			case 2 ->{
				
				/*Pedimos al usuario que introduzca el nombre del producto que quiere eliminar*/
				System.out.println("Introduce el nombre del producto que quieres eliminar");
				
				/*Leemos el nombre del producto a eliminar introducido por el usuario*/
				producto = sc.nextLine().trim();
				
				/*Pedimos al usuario que introduzca el precio del producto que quiere eliminar*/
				System.out.println("Introduce el precio del producto que quieres eliminar");
				
				/*Leemos el precio del producto a eliminar introducido por el usuario*/
				precio = sc.nextLine().trim();
				
				/*Eliminamos el producto*/
				productos.remove(producto, precio);
			}
			
			/*Si es 3 mostramos los productos y los precios existentes en el mapa*/
			case 3 ->{
				
				System.out.println("Productos:");
				
				/*Creamos un bucle for each para mostrar al usuario los productos y su precio*/
				for(Map.Entry<String, String> entry : productos.entrySet()) {
					System.out.println(entry.getKey() + ": " + entry.getValue() + "€");
				}
			}
			}
			
			/*Mostramos el menu al usuario*/
			System.out.println("Menu:");
			System.out.println("1. Alta de producto");
			System.out.println("2. Baja de producto");
			System.out.println("3. Listar existencias");
			System.out.println("0. Salir");
			
			/*Pedimos al usuario que introduzca otra opcion*/
			System.out.println("Introduce otra opcion");
			
			/*Leemos la eleccion del usuario*/
			eleccion = sc.nextInt();
			sc.nextLine();
		}
		
		/*Notificamos al usuario que ha salido del programa*/
		System.out.println("Has salido del programa");
		
		/*Cerramos el Scanner*/
		sc.close();
	}
}