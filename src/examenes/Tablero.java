package examenes;

import java.util.Arrays;

public class Tablero {
	
	static final char LETRA2 = 'a';
	
	public static void main(String[] args) {
		char tablero[][] = new char[5][5];
		
		final char LETRA = 'a';
		
		for(int i = 0; i < tablero.length; i++) {
			Arrays.fill(tablero[i], 'X');			
		}
		
		/*Creamos un bucle for para generar los numeros*/
		for(int i = 0; i < tablero.length; i++) {
			System.out.print("\t" + (i+1));
		}
		System.out.println();
		
		for(int i = 0; i < tablero.length; i++) {
			System.out.print( (char) (i + LETRA));
			for(int j = 0; j < tablero[i].length; j++) {
				System.out.print("\t" + tablero[i][j]);
			}
			System.out.println();
		}
	}
	
}
