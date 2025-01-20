package examenes;

import java.util.Random;
import java.util.Scanner;

public class Ahorcado {
	
	/*Creamos un array estatico que contendra una serie de palabras de las cuales el ordenador cojera una aleatoria para el juego*/
	static String palabras[] = {"humanidad", "persona", "hombre", "mujer", "individuo", "cuerpo", "pierna", "cabeza", "brazo", "familia"};
	
	/*Creamos una variable estatica que contendra el numero maximo de intentos para que el jugador complete la palabra*/
	static final int NUMINTENTOS = 7;
	
	/*Creamos una variable estatica que almacenara la palabra a acertar*/
	static String palabraSecreta;
	
	/*Creamos una variable estatica que almacenara la pista del juego*/
	static String palabraPista = "_";
	
	/*Creamos una variable estatica que almacenara las letras que ha probado el jugador pero no se encuentran en la palabra a adivinar*/
	static String noAcertadas = "";
	
	/*Creamos el Scanner estatico*/
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		
		/*Creamos una variable para almacenar los intentos gastados del jugador*/
		int intentosGastados = NUMINTENTOS;
		
		/*Creamos una variable para almacenar la opcion elegida por el usuario*/
		int opcion;
		
		/*Creamos una variable para almacenar la letra introducida por el usuario*/
		char letra;
		
		/*Creamos una variable para almacenar la palabra introducida por el usuario*/
		String palabra;
		
		/*Generamos una palabra random llamando a la funcion*/
		generaPalabra();
		
		/*Creamos un bucle for para recorrer la palabra y rellenarla de guiones*/
		for(int i = 0; i < palabraSecreta.length()-1; i++) {
			palabraPista += "_";
		}
		
		/*Creamos un bucle while para que mientras el jugador no acierte la palabra y tenga intentoes continuar*/
		while(!palabraPista.equalsIgnoreCase(palabraSecreta) && intentosGastados > 0) {
			
			/*Creamos un bucle do while para pedir al usuario la opcion y en caso de que no la proporcione volversela a pedir*/
			do {
				/*Imnprimimos el menu llamando a la funcion*/
				opcion = menu();
				
				/*Creamos un switch para que si elije la opcion 1 se comprueba la letra si introduce la 2 se comprueba la palabra y si no pedir de nuevo la opcion al usuario*/
				switch(opcion) {
				case 1 ->{
					/*Pedimos al usuario que introduzca una letra*/
					System.out.println("Introduce una letra");
					
					/*Leemos la letra*/
					sc.nextLine();
					letra = sc.next().charAt(0);
					
					/*Llamamos a la funcion para comprobar si la letra es valida*/
					compruebaLetra(letra);
					
					/*Si la letra no es valida restar un error*/
					if(!palabraSecreta.contains(String.valueOf(letra))) {
						intentosGastados--;
					}
				}
				case 2 ->{
					/*Pedimos al usuario que introduzca una letra*/
					System.out.println("Introduce una palabra");
					
					/*Leemos la letra*/
					sc.nextLine();
					palabra = sc.nextLine().toLowerCase().trim().replace(" ", "");
					
					/*Llamamos a la funcion para comprobar si la palabra es valida*/
					compruebaPalabra(palabra);
					
					/*Si la palabra no es valida restar un error*/
					if(!palabraSecreta.equalsIgnoreCase(palabra)) {
						intentosGastados--;
					}
				}
				default ->{
					System.out.println("Opcion incorrecta. Vuelve a introducirla");
				}
				}
			}while(opcion <= 0);
			
			/*Mostramos la palabraPista al usuario llamando a la funcion*/
			pintaPista();
			
			/*Imprimimos el numero de intentos que le quedan al jugador*/
			System.out.println("Te quedan " + intentosGastados + " intentos");
		}
		
		/*Si el jugador ha acertado la palabra ha ganado pero si se ha gastado los intentos ha perdido*/
		if(palabraPista.equalsIgnoreCase(palabraSecreta)) {
			System.out.println("¡¡ENHORABUENA!! HAS ACERTADO");
		} else if(intentosGastados == 0) {
			System.out.println("GAME OVER");
		}
	}
	
	/*Creamos una funcion estatica que no recibe ni devuelve ningun parametro y se encargara de almacenar en 
	 * una variable la palabra secreta de una de las palabras del array la cual sera aleatoria*/
	static void generaPalabra() {
		
		/*Creamos una variable para almacenar el numero aleatorio que indica la plabra secreta*/
		int numPalabra = 0;
		
		/*Creamos la clase Random*/
		Random rand = new Random();
		
		/*Generamos un numero aleatorio para que nos indique que palabra del array sera la seleccionada*/
		numPalabra = rand.nextInt(0, palabras.length);
		
		/*Almacenamos la palabra aleatoria en la variable*/
		palabraSecreta = palabras[numPalabra];
	}
	
	/*Creamos una funcion estatica que no recibe parametros de entrada y devuelve un numero entero, se encargara de pintar por consola si adivinar por palabra
	 * o por letra*/
	static int menu() {
		
		/*Creamos una variable para almacenar el numero entero que elegira el usuario para tomar una decision*/
		int decision = 0;
		
		/*Creamos un bucle do while para pedior al usuario el numero hasta que no lo introduzca*/
		do {
			/*Pedimos al usuario que introduzca una opcion*/
			System.out.println("Seleccione una de las siguientes opciones:");
			System.out.println("1. Introducir letra");
			System.out.println("2. Introducir palabra");
			
			/*Leemos la decision del usuario*/
			decision = sc.nextInt();
		}while(decision != 1 && decision != 2);
		
		/*Devolvemos la decision del usuario*/
		return decision;
	}
	
	/*Creamos una funcion estatica que reciba como parametro de entrada una letra pero no devuelve nada y se encarga de comprobar si la letra
	 * esta en la palabra a acertar y si se encuentra actualuza la palabra sino la añade en no acertadas*/
	static void compruebaLetra(char letra) {
		
		/*Creamos una variable para almacenar la posicion de la letra*/
		int posicion = 0;
		
		/*Convertimos la letra a minuscula*/
		letra = Character.toLowerCase(letra);
		
		/*Buscamos la primera posicion de la letra*/
		posicion = palabraSecreta.indexOf(letra);
		
		/*Creamos un if para que si la posicion es -1 y no esta ya en la lista sumar la letra a no acertadas*/
		if(posicion == -1 && !noAcertadas.contains(String.valueOf(letra))) {
			noAcertadas += letra + ", ";
		}
		
		/*Creamos un bucle while para buscar la letra indicada*/
		while(posicion >= 0) {
			
			/*Almacenamos la letra actualizada en la variable*/
			palabraPista = palabraPista.substring(0, posicion) + palabraSecreta.substring(posicion, posicion+1) + palabraPista.substring(posicion+1);
			
			/*Buscamos a partir de la posicion anterior*/
			posicion = palabraSecreta.indexOf(posicion, letra);
		}
	}
	
	/*Creamos una funcion estatica que reciba como parametro de entrada una palabra pero no devuelve nada y se encarga de comprobar si la palabra
	 * es la misma que la oculta*/
	static void compruebaPalabra(String palabra) {
		
		/*Si la palabra introducida es igual a la secreta la palabra pista sera igual a la palabra secreta*/
		if(palabra.equalsIgnoreCase(palabraSecreta)) {
			palabraPista = palabraSecreta;
		}
	}
	
	/*Creamos una funcion estatica que no recibe ni devuelve ningun parametro y se encarga de pintar la palabraPista*/
	static void pintaPista() {
		
		/*Mostramos al usuario las letras no acertadas*/
		System.out.println(noAcertadas);
		
		/*Mostramos la palabraPista al usuario*/
		System.out.println(palabraPista);
	}
}