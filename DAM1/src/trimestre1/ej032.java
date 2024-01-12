package trimestre1;

import java.util.Scanner;

public class ej032 {
/*Modifica el ejercicio anterior, para que en lugar de pedir un número, 
 * pida un carácter (char) y muestre su código en la tabla ASCII.
*/
	public static void main(String[] args) {
		// TODO Auto-generated method stubs
		Scanner leer = new Scanner(System.in);

        System.out.print("dime una letra para convertirla en código ASCII: ");
        char caracter = leer.next().charAt(0);
        int ASCII = (int) caracter;
        System.out.println("la letra en ASCII " + caracter + " es: " + ASCII);
        
        leer.close();
	}

}
