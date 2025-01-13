package boletin6;

import java.util.Scanner;

public class Ejercicio19 {
	public static void main(String[] args) {
		
		/*Creamos una variable que almacene la frase del usuario*/
		String frase;
		
		/*Creamos una variable para almacenar el resultado de la funcion*/
		String resultado;
		
		/*Creamos un Scanner*/
		Scanner sc = new Scanner(System.in);
		
		/*Pedimos al usuario que introduzca una frase*/
		System.out.println("Introduce una frase:");
		
		/*Leemos la frase del usuario*/
		frase = sc.nextLine().toLowerCase();
		
		/*Llamamos a la funcion*/
		resultado = pasarCamel(frase);
		
		/*Mostramos al usuario el nombre de la variable*/
		System.out.println(resultado);
		
		/*Cerramos el Scanner*/
		sc.close();
	}
	
	/*Creamos una funcion que reciba como parametro la frase introducida por 
	 * el usuario y devuelva la frase convertida en nomenclatura Camel*/
	static String pasarCamel(String frase) {
		
		/*Creamos una variable para almacenar los caracteres*/
		char caracter;
		
		/*Creamos una variable para almacenar el indice*/
		int indice = 0;
		
		/*Creamos una variable para almacenar la frase en nomenclatura Camel*/
		String fraseTransformada = "";
		
		/*Creamos una variable para almacenar la letra y el espacio en blanco a cambiar en el ejercicio*/
		String cadena;
		
		/*Buscamos el inicio del primer espacio en blanco*/
		indice = frase.indexOf(' ', indice+1);
		
		/*Creamos un bucle for para recorrer la frase*/
		for(int i = 0; i < frase.length(); i++) {
			
			/*Almacenamos los caracteres en la variable*/
			caracter = frase.charAt(i);
			
			/*Si la variable i es igual al indice mas 1 donde se situa el espacio en blanco*/
			if(i == indice+1) {
				
				/*La cadena sera igual al espacio en blanco mas la letra*/
				cadena = frase.substring(i, i+1);
				
				/*Transformamos la letra a mayuscula*/
				cadena = cadena.toUpperCase();
				
				/*Almacenamos la letra en la nueva frase*/
				fraseTransformada += cadena;
				
				/*Buscamos el inicio del siguiente espacio en blanco*/
				indice = frase.indexOf(' ', indice+1);
				
			} else {
				
				/*Almacenamos los caracteres en la frase*/
				fraseTransformada += caracter;
			}
		}
		
		/*Eliminamos los espacios en blanco de la frase transformada*/
		fraseTransformada = fraseTransformada.replace(" ", "");
		
		/*Devolvemos la frase transformada en nomenclatura Camel*/
		return fraseTransformada;
	}
}