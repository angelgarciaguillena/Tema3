package boletin4;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio5 {
	public static void main(String[] args) {
		
		/*Creamos una variable para almacenar el dato de busqueda del usuario*/
		int valor;
		
		/*Creamos una tabla y almacenamos numeros*/
		int t[] = {6, 12, 18, 24, 36, 24, 18, 12, 6, 36};
		
		/*Creamos un Scanner*/
		Scanner sc = new Scanner(System.in);
		
		/*Pedimos al usuario que introduzca un valor de busqueda*/
		System.out.println("Introduce un valor");
		
		/*Leemos el dato del usuario*/
		valor = sc.nextInt();
		
		/*Llamamos a la funcion*/
		int resultado[] = buscarTodos(t, valor);
		
		/*Mostramos el resultado al usuario*/
		System.out.println(Arrays.toString(resultado));
		
		/*Cerramos el Scanner*/
		sc.close();
	}
	
	/*Creamos una funcion*/
	static int[] buscarTodos(int t[], int valor) {
		
		/*Creamos una tabla para almacenar los indices*/
		int indices[];
		
		/*Creamos una variable para contar los aciertos e indicar el tamaño de la tabla*/
		int aciertos = 0;
		
		/*Creamos un bucle for each para recorrer la tabla en busqueda del valor del usuario*/
		for(int numero : t) {
			
			/*Creamos un if para que si el numero es igual al valor introducido por el usuario sumar 1 a los aciertos*/
			if(numero == valor) {
				aciertos++;
			}
		}
		
		/*Le asigno el tamaño a la tabla*/
		indices = new int[aciertos];
		
		/*Creo un if para que si los aciertos son mayores de 0 recorrer la tabla y guardar la posicion de los valores que coinciden con el que ha introducido el usuario*/
		if (aciertos > 0) {
			
			/*Reseteamos la variable*/
			aciertos = 0;
			
			/*Creamos un bucle for para realizar la busqueda hasta que la tabla se llene con los valores*/
			for(int i = 0; i < t.length; i++) {
				
				/*Creamos un if para que si el numero de la tabla es igual al valor del usuario guardarlo en la tabla de los indices*/
				if(t[i] == valor) {
					indices[aciertos] = i;
					aciertos++;
				}
			}
		}
		
		/*Devolver la tabla de los indices*/
		return indices;
	}
}