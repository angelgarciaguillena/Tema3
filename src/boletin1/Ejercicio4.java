package boletin1;

public class Ejercicio4 {
	public static void main(String[] args) {
		
		/* ¿Qué sucede con los valores de los elementos que no han sido inicializados?
		 * Los valores que no inicializamos se les pone 0 de forma predeterminada
		 */
		
		/*Creamos una tabla para almacenar los numeros*/
		int num[] = new int[12];
		
		/*Almacenamos los numeros en la tabla*/
		num[0] = 39;
		num[1] = -2;
		num[4] = 0;
		num[6] = 14;
		num[8] = 5;
		num[9] = 120;
		
		/*Creamos un for each para imprimir los numeros*/
		for(int valor : num) {
			System.out.println(valor);
		}	
	}
}
