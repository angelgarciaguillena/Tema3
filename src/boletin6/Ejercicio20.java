package boletin6;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio20 {
	public static void main(String[] args) {
		
		/*Creamos una variable para almacenar una palabra*/
		String palabra;
		
		/*Creamos una variable para almacenar el numero de letras que se quiere guardar en una casilla*/
		int numeroSecuencia;
		
		/*Creamos una tabla para almacenar el resultado de la funcion*/
		String resultado[];
		
		/*Creamos un Scanner*/
		Scanner sc = new Scanner(System.in);
		
		/*Pedimos al usuario que introduzca una palabra*/
		System.out.println("Introduce una palabra");
		
		/*Leemos la palabra del usuario*/
		palabra = sc.nextLine().trim();
		
		/*Pedimos al usuario que introduzca un numero de secuencias*/
		System.out.println("Introduce un numero de secuencias");
		
		/*Leemos el numero de secuencias del usuario*/
		numeroSecuencia = sc.nextInt();
		
		/*Llamamos a la funcion*/
		resultado = separarPalabra(palabra, numeroSecuencia);
		
		/*Mostramos el resultado al usuario*/
		System.out.println(Arrays.toString(resultado));
		
		/*Cerramos el Scanner*/
		sc.close();
	}
	
	/*Creamos una funcion que reciba por parametrso la palabra y el numero de secuencias, separe la palabra
	 * en secuencias y las almacene en una tabla y devuelva esa tabla*/
	static String[] separarPalabra(String palabra, int numeroSecuencia) {
		
		/*Creamos una tabla para almacenar la palabra dividida*/
		String palabraSeparada[];
		
		/*Creamos una variable para almacenar el tamaño de la tabla*/
		int tamaño;
		
		/*Creamos una variable para el inicio de la secuencia*/
		int inicio;
		
		/*Creamos una variable para el fin de la secuencia*/
		int fin;
		
		/*Calculamos el tamaño de la tabla*/
		tamaño = (palabra.length() + numeroSecuencia - 1) / numeroSecuencia;
		
		/*Asignamos el tamaño a la tabla*/
		palabraSeparada = new String[tamaño];
	
		/*Creamos un bucle for para recorrer la tabla*/
		for(int i = 0; i < palabraSeparada.length; i++) {
			
			/*Establecemos el inicio y el fin de la secuencia*/
			inicio = i * numeroSecuencia;
			fin = Math.min(inicio+numeroSecuencia, palabra.length());
			
			/*Almacenamos la secuencia en la tabla*/
			palabraSeparada[i] = palabra.substring(inicio, fin);
		}
		
		/*Devolvemos la tabla*/
		return palabraSeparada;
	}
}