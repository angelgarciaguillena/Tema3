package boletin6;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio2 {
	public static void main(String[] args) {
		
		/*Creamos una variable para almacenar la contraseña correcta*/
		String contraseña;
		
		/*Creamos una variable para almacenar la contraseña introducida por el usuario*/
		String contraseñaUsuario;
		
		/*Creamos una tabla para almacenar la contraseña verdadera*/
		char caracteres[];
		
		/*Creamos un Scanner*/
		Scanner sc = new Scanner(System.in);
		
		/*Pedimos al usuario que introduzca la contraseña correcta*/
		System.out.println("Introduce la contraseña correcta");
		
		/*Leemos la contraseña correcta introducida por el usuario*/
		contraseña = sc.nextLine();
		
		/*Asignamos el tamaño a la tabla*/
		caracteres = new char[contraseña.length()];
		
		/*Rellenamos la tabla con asteriscos*/
		Arrays.fill(caracteres, '*');
		
		/*Pedimos al usuario que introduzca la contraseña*/
		System.out.println("Intenta acertar la contraseña");
		
		/*Leemos la contraseña del usuario*/
		contraseñaUsuario = sc.nextLine();
		
		/*Creamos un bucle do while para pedir al usuario la contraseña hasta que la adivine*/
		while(!contraseñaUsuario.equalsIgnoreCase(contraseña)) {
			
			/*Creamos un bucle for para almacenar la letra en una tabla si son iguales y sino un asterisco*/
			for(int i = 0; i < caracteres.length; i++) {
				/*Creamos un if para que si la letra de la contraseña introducida por el usuario es igual a la de la contraseña verdadera, almacenar en una tabla*/
				if(contraseñaUsuario.charAt(i) == contraseña.charAt(i)) {
					caracteres[i] = sc.next().charAt(i);
				}
			}
			
			/*Mostramos la tabla al usuario*/
			System.out.println(Arrays.toString(caracteres));
			
			/*Pedimos al usuario que introduzca la contraseña*/
			System.out.println("Intenta acertar la contraseña");
			
			/*Leemos la contraseña del usuario*/
			contraseñaUsuario = sc.nextLine();
		}
		
		/*Mostramos un mensaje al usuario de que acerto*/
		System.out.println("Has acertado");
		
		/*Cerramos el Scanner*/
		sc.close();
	}
}