package trimestre1;

import java.util.Scanner;

public class ej037 {
/*Realiza una aplicación que nos pida un número de ventas a introducir, 
 * después nos pedirá tantas ventas por teclado como número de ventas se hayan indicado.
 * Al final mostrara la suma de todas las ventas. Piensa que es lo que se repite 
 * y lo que no.*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leer = new Scanner(System.in);
		int tam= leer.nextInt();
		int[] ventas = new int[tam];
		int totalVentas=0;
		for(int i=0;i<ventas.length;i++) {
			System.out.println("cuantas ventas son este mes"+i);
			ventas[i] = leer.nextInt();
			totalVentas+= ventas[i];
		}
		System.out.println("el total es" + totalVentas);
		
		leer.close();
	}
}
