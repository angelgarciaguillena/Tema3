package boletin4;

public class Ejercicio2 {
	public static void main(String[] args) {
		
		/*Creamos la tabla y almacenamos algunos valores*/
		int t[] = {23, 31, 2, 17, 8};
		
		/*Llamamos a la funcion*/
		int maximoEnteros = maximo(t);
		
		/*Mostramos al usuario la respuesta*/
		System.out.println("El numero maximo de la tabla es " + maximoEnteros);
	}
	
	/*Creamos la funcion*/
	static int maximo(int t[]) {
		
		/*Creamos una variable para almacenar el máximo valor*/
		int maximo = 0;
		
		/*Creamos un for each para recorrer la tabla y almacenar el valor maximo en la variable*/
		for(int valor : t) {
			if(valor > maximo) {
				maximo = valor;
			}
		}
		
		/*Devolvemos el maximo*/
		return maximo;
	}
}
