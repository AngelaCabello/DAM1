package trimestre1;

import java.util.Scanner;

public class ej029 {
/*Modifica la aplicación anterior, para que nos pida el nombre que queremos 
 * introducir por consola.*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leer = new Scanner(System.in);
		String nombre;
		
		System.out.println("dime un nombre: ");
		nombre = leer.nextLine();
		System.out.println("bienvenido " + nombre);
		}
}