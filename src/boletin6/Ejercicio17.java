package boletin6;

import java.util.Scanner;

public class Ejercicio17 {
	public static void main(String[] args) {
		
		/*Creamos una variable para almacenar la frase del usuario*/
		String sentencia;
		
		/*Creamos una variable que almacene la frase sin los comentarios*/
		String resultado;
		
		/*Creamos un Scanner*/
		Scanner sc = new Scanner(System.in);
		
		/*Pedimos al usuario que introduzca una sentencia de C*/
		System.out.println("Introduce la sentencia de C");
		
		/*Leemos la sentencia del usuario*/
		sentencia = sc.nextLine();
		
		/*Llamamos a la funcion*/
		resultado = quitarComentarios(sentencia);
		
		/*Mostramos la sentencia sin comentarios al usuario*/
		System.out.println(resultado);
		
		/*Cerramos el Scanner*/
		sc.close();
	}

	/*Creamos una funcion que reciba la sentencia de C y la devuelva sin comentarios*/
	static String quitarComentarios(String sentencia) {
		
		/*Creamos una variable para almacenar el indice inicial del comentario*/
		int indiceInicial = 0;
		
		/*Creamos una variable para almacenar el indice inicial del comentario*/
		int indiceFinal = 0;
		
		/*Creamos una variable para almacenar los caracteres del comentario*/
		String cadena = "";
		
		/*Creamos una variable que nos servira como contador*/
		int contador = 0;
		
		/*Creamos una constante para almacenar el caracter de busqueda de busqueda*/
		char BUSQUEDA = '/';
		
		/*Creamos un bucle for para recorrer la frase*/
		while(indiceInicial != -1) {
			
			/*Buscamos el inicio y el final de los comentarios*/
			indiceInicial = sentencia.indexOf(BUSQUEDA, indiceInicial);
			indiceFinal = sentencia.indexOf(BUSQUEDA, indiceInicial);
			
			contador = indiceInicial;
			
			if(indiceInicial != -1) {
				/*Creamos un bucle while para eliminar el comentario de la frase*/
				while(contador < indiceFinal) {
					cadena += sentencia.charAt(contador);
					contador++;
				}
				sentencia = sentencia.replace(cadena, "");
			}
			
		}
		
		/*Devolvemos la frase sin comentarios*/
		return sentencia;
	}
	
}
