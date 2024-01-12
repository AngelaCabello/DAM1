package trimestre1;

import java.util.Scanner;

public class ej031 {
/*Lee un número por teclado y muestra por consola, el carácter al que pertenece 
 * en la tabla ASCII. Por ejemplo: si introduzco un 97, me muestre una a.*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leer = new Scanner(System.in);
		
        System.out.print("dime un numero, este aparecera en ASCII ");
        int num = leer.nextInt();
        char caracter = (char) num;
        System.out.println("El carácter ASCII para el número " + num + " es: " + caracter);

        leer.close();
	}

}
