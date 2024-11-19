package boletin4;

public class Ejercicio1 {
	
	public static void main(String[] args) {
		
		/*Creamos una tabla donde estan almacenados los numeros*/
		int tabla[] = {23, 31, 2, 17, 8};
		
		/*Llamamos a la función*/
		int sumaEnteros = sumaTabla(tabla);
		
		/*Mostramos el resultado al usuario*/
		System.out.println("La suma de los digitos es " + sumaEnteros);
	}
	
	/*Creamos una funcion*/
	static int sumaTabla (int tabla[]) {
		
		/*Creamos una variable para almacenar la suma de los digitos de la tabla*/
		int suma = 0;
		
		/*Creamos un bucle for para recorrer la tabla y ir sumando los digitos*/
		for(int valor : tabla) {
			suma += valor;
		}
		
		/*Devolver suma*/
		return suma;
	}
}