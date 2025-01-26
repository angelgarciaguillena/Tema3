package boletin7;

import java.util.HashMap;
import java.util.Scanner;

public class Ejercicio8 {
	public static void main(String[] args) {
		
		/*Creamos un mapa para almacenar el nombre de usuario y su contraseña*/
		HashMap<String, String> contraseñas = new HashMap<>();
		
		/*Creamos el Scanner*/
		Scanner sc = new Scanner(System.in);
		
		/*Creamos una variable para almacenar la eleccion del usuario*/
		int eleccion;
		
		/*Creamos una variable para almacenar el nombre del usuario*/
		String nombreUsuario = "";
		
		/*Creamos una variable para almacenar la contraseña del usuario*/
		String contraseña = "";
		
		/*Creamos una variable que nos sirva como contador*/
		int contador = 0;
		
		/*Creamos una variable que almacenara si se ha acertado la contraseña*/
		boolean acertada = false;
		
		/*Creamos un bucle do while para que si no da una opcion valida volversela a pedir*/
		do {
			/*Mostramos el menu al usuario*/
			System.out.println("Menu:");
			System.out.println("1. Registro");
			System.out.println("2. Login");
			System.out.println("0. Salir");
			
			/*Pedimos al usuario que introduzca un numero*/
			System.out.println("Introduce un numero entre las opciones");
			
			/*Leemos la eleccion del usuario*/
			eleccion = sc.nextInt();
			sc.nextLine();
		}while(eleccion < 0 || eleccion > 2);
		
		/*Creamos un bucle while para que mientras no sea 0 continue realizando 1 de las opciones del menu*/
		while(eleccion != 0) {
			
			/*Creamos un switch para que dependiendo de lo que introduzca el usuario realice una funcion u otra*/
			switch(eleccion) {
			
			/*Si es 1 añadimos el nombre de usuario y la contraseña al mapa*/
			case 1 ->{
				
				/*Pedimos al usuario que introduzca el nombre de usuario*/
				System.out.println("Introduce el nombre de usuario");
				
				/*Leemos el nombre del usuario*/
				nombreUsuario = sc.nextLine();
				
				/*Pedimos al usuario que introduzca la contraseña*/
				System.out.println("Introduce la contraseña");
				
				/*Leemos la contraseña del usuario*/
				contraseña = sc.nextLine();
				
				/*Añadimos el nombre de usuario y la contraseña al mapa*/
				contraseñas.put(nombreUsuario, contraseña);
			}
			
			/*Si es 2 intentamos acceder al sistema*/
			case 2 ->{
				
				/*Creamos un bucle do while para que mientras no acierte y no supere las tres oportunidades volver a intentar acertar la contraseña*/
				do {					
					/*Pedimos al usuario que introduzca el nombre de usuario de la contraseña que quiere buscae*/
					System.out.println("Introduce el nombre de usuario");
					
					/*Leemos el nombre de usuario que inicia la sesion*/
					nombreUsuario = sc.nextLine();
					
					/*Si la busqueda es nula mostrar al usuario que el nombre no es valido pero sino pedir la contraseña*/						
					if (!contraseñas.containsKey(nombreUsuario)) {
						
						/*Sumamos 1 al contador*/
						contador++;
						
						/*Notificamos al usuario de que el nombre introducido es incorrecto o que no ha podido acceder al sistema porque se le acabaron los intentos*/
					    System.out.println(contador < 3 ? "Nombre de usuario incorrecto" : "Lo siento, no tiene acceso al área restringida");
					    
					} else {
						
						/*Pedimos al usuario que introduzca la contraseña*/
						System.out.println("Introduce la contraseña");
						
						/*Leemos la contraseña del usuario*/
						contraseña = sc.nextLine();
						
						/*Si la contraseña es nula se le notificara al usuario que no es valida sino se le notificara que ha entrado correctamente*/
						if(!contraseña.equals(contraseñas.get(nombreUsuario))) {
							System.out.println("Lo siento, no tiene acceso al área restringida");
							contador++;
						} else {
							System.out.println("Ha accedido al área restringida");
							acertada = true;
						}
					}
				} while(contador < 3 && !acertada);
				
				
				/*Reiniciamos las variables*/
				contador = 0;
				acertada = false;
			}
			}
			
			/*Mostramos el menu al usuario*/
			System.out.println("Menu:");
			System.out.println("1. Registro");
			System.out.println("2. Login");
			System.out.println("0. Salir");
			
			/*Pedimos al usuario que introduzca otra opcion*/
			System.out.println("Introduce otro numero");
			
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