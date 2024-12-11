package boletin6;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio2 {
	public static void main(String[] args) {
		
		/*Creamos una variable para almacenar la contraseña correcta*/
		String contrasenya;
		
		/*Creamos una variable para almacenar la contraseña introducida por el usuario*/
		String contrasenyaUsuario;
		
		/*Creamos una tabla para almacenar la contraseña verdadera*/
		char caracteres[];
		
		/*Creamos un Scanner*/
		Scanner sc = new Scanner(System.in);
		
		/*Pedimos al usuario que introduzca la contraseña correcta*/
		System.out.println("Introduce la contraseña correcta");
		
		/*Leemos la contraseña correcta introducida por el usuario*/
		contrasenya = sc.nextLine();
		
		/*Asignamos el tamaño a la tabla*/
		caracteres = new char[contrasenya.length()];
		
		/*Rellenamos la tabla con asteriscos*/
		Arrays.fill(caracteres, '*');
		
		/*Pedimos al usuario que introduzca la contraseña*/
		System.out.println("Intenta acertar la contraseña");
		
		/*Leemos la contraseña del usuario*/
		contrasenyaUsuario = sc.nextLine();
		
		/*Creamos un bucle do while para pedir al usuario la contraseña hasta que la adivine*/
		while(!contrasenyaUsuario.equals(contrasenya)) {
			
			/*Creamos un bucle for para almacenar la letra en una tabla si son iguales y sino un asterisco*/
			for(int i = 0; i < caracteres.length; i++) {
				/*Creamos un if para que si la letra de la contraseña introducida por el usuario es igual a la de la contraseña verdadera, almacenar en una tabla*/
				if(contrasenyaUsuario.charAt(i) == contrasenya.charAt(i)) {
					caracteres[i] = contrasenya.charAt(i);
				}
			}
			
			/*Mostramos la tabla al usuario*/
			System.out.println(Arrays.toString(caracteres));
			
			/*Pedimos al usuario que introduzca la contraseña*/
			System.out.println("Intenta acertar la contraseña");
			
			/*Leemos la contraseña del usuario*/
			contrasenyaUsuario = sc.nextLine();
		}
		
		/*Mostramos un mensaje al usuario de que acerto*/
		System.out.println("Has acertado");
		
		/*Cerramos el Scanner*/
		sc.close();
	}
}