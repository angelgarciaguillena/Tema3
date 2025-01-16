package examenes;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class TresEnRaya {
		
	/*Creamos una tabla para almacenar el tablero*/
	static char tablero[][] = new char[9][9];
	
	/*Creamos el Scanner*/
	static Scanner sc = new Scanner(System.in);
	
	/*Creamos la clase Random*/
	static Random rand = new Random();
		
	public static void main(String[] args) {
		
		/*Creamos una variable para almacenar el numero que indica quien empezara el juego*/
		int empieza;
		
		/*Creamos una variable que nos servira como contador*/
		int contador = 0;
		
		/*Creamos una variable para almacenar el ganador del juego*/
		boolean ganador = false;
		
		/*Creamos una variable para almacenar si la posicion del jugador es valida*/
		boolean valida;
		
		/*Creamos una variable para almacenar el error*/
		boolean error = false;
		
		/*Creamos una variablepara almacenar la ficha*/
		char ficha = ' ';
		
		/*Creamos una variable para almacenar la respuesta del usuario a la pregunta de seguir jugando*/
		String jugarOtra = "";
		
		/*Llamamos a la funcion*/
		empieza = jugadorInicial();
		
		/*Creamos un bucle for para inicializar el tablero con guiones*/
		for(int i = 0; i < tablero.length; i++) {
			Arrays.fill(tablero[i], '-');
		}
		
		/*Imprimimos el tablero por pantalla llamando a la funcion*/
		System.out.println("Tablero:");
		imprimeTablero();
		
		/*Creamos un bucle do while para que se repita si el usuario no quiere salir*/
		do {
			
			/*Notificamos al usuario del inicio del juego*/
			System.out.println("Bienvenido al juego del tres en raya");
			
			/*Creamos un bucle while para que se repita hasta que alguien gane*/
			while(!ganador && contador < 81) {
				
				/*Si el primero en empezar es el programa o si el primero en empezar es el usuario se le notifica al usuario*/
				if(empieza == 0) {
					System.out.println("Empieza la maquina");
					
					/*Asignamos a la variable el tipo de ficha de la maquina*/
					ficha = 'X';
					
					/*Reiniciamos la variable empieza*/
					empieza = 2;
					
				} else if(empieza == 1) {
					System.out.println("Empieza el jugador");
					
					/*Asignamos a la variable el tipo de ficha del usuario*/
					ficha = 'O';
					
					/*Reiniciamos la variable empieza*/
					empieza = 2;
				}
				
				/*Si la ficha es x el turno es de la maquina pero si es O el turno es del jugador*/
				if(ficha == 'X') {
					
					/*Llamamos a la funcion*/
					mueveFichaAleatoria();
					
					/*Imprimimos el tablero por pantalla llamando a la funcion*/
					System.out.println("Tablero:");
					imprimeTablero();
					
					/*Se comprueba si hay un ganador llamando a la funcion*/
					ganador = esGanador(ficha);
					
					/*Asignamos que la siguiente ficha sea del jugador*/
					ficha = 'O';
					
				} else if(ficha == 'O') {
					
					/*Creamos un bucle do while para seguir preguntado al usuario la posicion hasta que no la introduzca correctamente*/
					do{
						/*Llamamos a la funcion*/
						valida = usuarioMueveFicha();
					}while(!valida);
					
					/*Imprimimos el tablero por pantalla llamando a la funcion*/
					System.out.println("Tablero:");
					imprimeTablero();
					
					/*Se comprueba si hay un ganador llamando a la funcion*/
					ganador = esGanador(ficha);
					
					/*Asignamos que la siguiente ficha sea de la maquina*/
					ficha = 'X';
				}
				
				/*Sumamos 1 al contador*/
				contador++;
			}
			
			/*Si ganador es verdad alguien ha ganado sino es empate*/
			if (ganador) {
				
				/*Si la ficha es x ha ganado el jugador si la ficha es O ha ganado la maquina*/
			    if (ficha == 'X') {
			        System.out.println("Ha ganado el jugador");
			    } else {
			        System.out.println("Ha ganado la máquina");
			    }
			    
			} else {
			    System.out.println("Es un empate");
			}
			
			/*Creamos un bucle do while para repetir hasta que no se introduzca una respuesta valida*/
			do {
				/*Creamos un try catch para notificar al usuario de los errores cometidos*/
				try {
					/*Preguntamos al usuario si desea seguir jugando*/
					System.out.println("¿Quieres seguir jugando? (Si/No)");
					
					/*Leemos la respuesta del usuario*/
					jugarOtra = sc.nextLine();
		
					/*Creamos un assert para notificar al usuario de que no ha introducido ni si ni no*/
					assert jugarOtra.equalsIgnoreCase("Si") || jugarOtra.equalsIgnoreCase("No") : "Error: No has introducido ni 'Si' ni 'No'";
					
					/*Asignamos que el error es falso*/
					error = false;
					
				/*Si comete el error del assert*/
				}catch (AssertionError e) {
					
					/*Mostramos el error al usuario*/
					System.err.println(e.getMessage());
					
					/*Asignamos que el error es verdadero*/
					error = true;
				}
			}while(error);		
			
			/*Limpiamos el tablero llamando a la funcion*/
			limpiarTablero();
			
			/*Reiniciamos las variables*/
			contador = 0;
			ganador = false;
			
		}while(jugarOtra.equalsIgnoreCase("Si"));
		
		/*Mostramos un mensaje al usuario de que el juego ha finalizado*/
		System.out.println("¡ADIOS!");
		
		/*Cerramos el Scanner*/
		sc.close();		
	}
	
	/*Creamos una funcion para imprimir el tablero por pantalla*/
	static void imprimeTablero(){
		
		/*Creamos un bucle for anidado para mostrar el tablero*/
		for(int i = 0; i < tablero.length; i++) {
			for(int j = 0; j < tablero[i].length; j++) {
				System.out.print(tablero[i][j] + "\t");
			}
			
			/*Hacemos un salto de linea*/
			System.out.println();
		}
	}
	
	/*Creamos una funcion que generara un numero aleatorio entre el 0 y el 1 que indicara quien empezara
	 * el juego y devolvera ese numero generado*/
	static int jugadorInicial() {
		
		/*Creamos una variable para almacenar el numero que indicara quien empieza el juego*/
		int empiezaJuego;
		
		/*Generamos un numero aleatorio y lo almacenamos en la variable*/
		empiezaJuego = rand.nextInt(0, 2);
		
		/*Devolvemos el numero que indica quien empieza el juego*/
		return empiezaJuego;
	}
	
	/*Creamos una funcion que se encargara de poner una ficha en una posicion aleatoria del tablero
	 * comprobando que esa casilla no este asignada por el jugador*/
	static void mueveFichaAleatoria() {
		
		/*Creamos una variable para almacenar la posicion aleatoria de la fila*/
		int posFila;
		
		/*Creamos una variable para almacenar la posicion aleatoria de la columna*/
		int posColumna;
		
		/*Generamos una posicion aleatoria para la fila y la columna*/
		posFila = rand.nextInt(0, tablero.length);
		posColumna = rand.nextInt(0, tablero.length);
		
		/*Creamos un bucle while para que si la posicion esta ocupada repetir la generacion del numero*/
		while(tablero[posFila][posColumna] == 'X' || tablero[posFila][posColumna] == 'O') {
			
			/*Generamos una posicion aleatoria para la fila y la columna*/
			posFila = rand.nextInt(0, tablero.length);
			posColumna = rand.nextInt(0, tablero.length);
		}
		
		/*Almacenamos el valor en el tablero*/
		tablero[posFila][posColumna] = 'X';		
	}
	
	static boolean usuarioMueveFicha() {
		
		/*Creamos una variable para almacenar si la casilla es valida o no*/
		boolean esValida = true;
		
		/*Creamos una variable para almacenar la posicion de fila del jugador*/
		int posFilaJugador = 0;
		
		/*Creamos una variable para almacenar la posicion de columna del jugador*/
		int posColumnaJugador = 0;
		
		/*Creamos un bucle do while para que se repita mientras el error es verdad*/
		do {
			/*Creamos un try catch para notificar al usuario de si ha cometido algun error*/
			try {
				
				/*Pedimos al usuario que introduzca una posicion de fila*/
				System.out.println("Introduce una posicion de fila");
				
				/*Leemos la posicion de fila del usuario*/
				posFilaJugador = sc.nextInt();
				
				/*Creamos un assert para notificar al usuario en caso de que el numero introducido no este dentro del rango*/
				assert posFilaJugador >= 0 && posFilaJugador <= 8 : "Error: El numero introducido no esta dentro del rango del tablero (0-8)";
				
				/*Asignamos que la posicion ya es valido*/
				esValida = true;
				
			/*Si se cumple este error*/
			} catch(AssertionError e) {
				
				/*Mostramos el error al usuario*/
				System.err.println(e.getMessage());
				
				/*Asignamos que la posicion no es valida*/
				esValida = false;
				
			/*Si se cumple este error*/
			} catch(InputMismatchException e){
				
				/*Mostramos el error al usuario*/
				System.err.println("Error: El numero no es entero");
				
				/*Asignamos que la posicion no es valida*/
				esValida = false;
				
			} finally {
				sc.nextLine();
			}
		}while(!esValida);
		
		/*Creamos un bucle do while para que se repita mientras el error es verdad*/
		do {
			/*Creamos un try catch para notificar al usuario de si ha cometido algun error*/
			try {
				
				/*Pedimos al usuario que introduzca una posicion de columna*/
				System.out.println("Introduce una posicion de columna");
				
				/*Leemos la posicion de columna del usuario*/
				posColumnaJugador = sc.nextInt();
				
				/*Creamos un assert para notificar al usuario en caso de que el numero introducido no este dentro del rango*/
				assert posColumnaJugador >= 0 && posColumnaJugador <= 8 : "Error: El numero introducido no esta dentro del rango del tablero (0-8)";
				
				/*Asignamos que la posicion ya es valido*/
				esValida = true;
				
			/*Si se cumple este error*/
			} catch(AssertionError e) {
				
				/*Mostramos el error al usuario*/
				System.err.println(e.getMessage());
				
				/*Asignamos que la posicion no es valida*/
				esValida = false;
				
			/*Si se cumple este error*/
			} catch(InputMismatchException e){
				
				/*Mostramos el error al usuario*/
				System.err.println("Error: El numero no es entero");
				
				/*Asignamos que la posicion no es valida*/
				esValida = false;
				
			} finally {
				sc.nextLine();
			}
		}while(!esValida);
		
		
		/*Si la posicion tiene algun de los dos tipos de fichas devolver false sino se almacenara la ficha*/
		if(tablero[posFilaJugador][posColumnaJugador] == 'X' || tablero[posFilaJugador][posColumnaJugador] == 'O') {
			esValida = false;
		} else {
			tablero[posFilaJugador][posColumnaJugador] = 'O';
		}
		
		/*Si la posicion de la fila o la columna sobresale del tablero no sear valido*/
		if (posFilaJugador < 0 || posFilaJugador >= tablero.length || posColumnaJugador < 0 || posColumnaJugador >= tablero[0].length) {
			    esValida = false;
		}
		
		/*Devolvemos si la casilla es valida*/
		return esValida;
	}
	
	/*Creamos una funcion para limpiar el tablero y eliminar todas las fichas*/
	static void limpiarTablero() {
		
		/*Creamos un bucle for para inicializar el tablero eliminando todas las fichas*/
		for(int i = 0; i < tablero.length; i++) {
			Arrays.fill(tablero[i], '-');
		}
	}
	
	/*Creamos una funcion que recibira como parametro la ficha del jugador y indicara si ha ganado el juego*/
	static boolean esGanador(char ficha) {
		
		/*Creamos una variable para almacenar si la ficha ha ganado*/
		boolean ganadorJuego = false;
		
		/*Creamos un bucle for anidado para recorrer el tablero*/
		for(int i = 0; i < tablero.length; i++) {
			for(int j = 0; j < tablero.length; j++) {
				
				/*Si las fichas se encuentran en fila, columna, en diagonal izquierda o en diagonal derecha, habra ganado*/
				if(j + 1 < tablero.length && j - 1 >= 0 && tablero[i][j+1] == ficha && tablero[i][j-1] == ficha && tablero[i][j] == ficha) {
					ganadorJuego = true; //En fila
					
				} else if(i + 1 < tablero.length && i - 1 >= 0 && tablero[i-1][j] == ficha && tablero[i+1][j] == ficha && tablero[i][j] == ficha) {
					ganadorJuego = true; //En columna
					
				} else if(i + 1 < tablero.length && j + 1 < tablero.length && i - 1 >= 0 && j - 1 >= 0 && tablero[i+1][j+1] == ficha && tablero[i-1][j-1] == ficha && tablero[i][j] == ficha) {
					ganadorJuego = true; //En diagonal izquierda
					
				} else if(i + 1 < tablero.length && j - 1 >= 0 && i - 1 >= 0 && j + 1 < tablero.length && tablero[i+1][j-1] == ficha && tablero[i-1][j+1] == ficha && tablero[i][j] == ficha) {
					ganadorJuego = true; //En diagonal derecha
				}
			}
		}
		
		/*Devolver si la ficha es ganador*/
		return ganadorJuego;
	}
}