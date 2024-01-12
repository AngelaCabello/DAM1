package trimestre1;

import java.util.Scanner;

public class ej018 {
/*Escribe un programa en Java que pida al usuario ingresar un número entre 1 y 10. 
 * El programa no debe terminar hasta que el usuario ingrese un número dentro de ese rango.
package trimestre1;*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leer = new Scanner(System.in);
		
		int num; 
		do {
			System.out.println("dime un numero, hasta que entre en el rango");
			num = leer.nextInt();
		}while(!(num>=1 && num<=10));
				System.out.println("esta dentro del rango");
		leer.close();
	}

}
