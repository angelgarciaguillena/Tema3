package boletin6;

import java.util.Scanner;

public class Ejercicio18 {
	public static void main(String[] args) {
		
		/*Creamos una variable para guardar el titulo del HTML*/
		String titulo;
		
		/*Creamos una variable para guardar el contenido del HTML*/
		String contenido;
		
		/*Creamos una funcion para almacenar el documento*/
		String documento;
		
		/*Creamos un Scanner*/
		Scanner sc = new Scanner(System.in);
		
		/*Pedimos el titulo del documento al usuario*/
		System.out.println("Introduce el titulo del documento");
		
		/*Leemos el titulo del usuario*/
		titulo = sc.nextLine();
		
		/*Pedimos el contenido del documento al usuario*/
		System.out.println("Introduce el contenido del documento");
		
		/*Leemos el contenido del usuario*/
		contenido = sc.nextLine();
		
		/*Llamamos a la funcion*/
		documento = generarDocumento(titulo, contenido);
		
		/*Mostramos el documento al usuario*/
		System.out.println(documento);
		
		/*Cerramos el Scanner*/
		sc.close();		
	}
	
	/*Creamos una funcion que reciba como parametros el titulo y el contenido del documento y devuelva
	 * la estructura completa del html*/
	static String generarDocumento(String titulo, String contenido){
		
		/*Creamos una variable para almacenar la estructura del documento*/
		String estructura;
		
		/*Almacenamos la estructura en la variable*/
		estructura = 
				"<!DOCTYPE html>" + "\n" +
		        "<html>" + "\n" +
		        "<head>" + "\n" +
		        "<meta charset=UTF-8>" + "\n" +
		        "<title></title>" + "\n" +
		        "</head>" + "\n" +
		        "<body>" + "\n" +
		        "<h1>" + titulo + "</h1>" + "\n" +
		        "<p>" + contenido + "</p>" + "\n" +
		        "</body>" + "\n" +
		        "</html>";
		        
		/*Devolvemos la estructura del documento*/
		return estructura;
	}
}