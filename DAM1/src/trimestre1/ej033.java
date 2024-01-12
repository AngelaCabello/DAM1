package trimestre1;

import java.util.Scanner;

public class ej033 {
/*Lee un número por teclado que pida el precio de un producto (puede tener decimales) y 
 * calcule el precio final con IVA. El IVA sera una constante que sera del 21%.*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leer = new Scanner(System.in);
		System.out.println("dime el precio del producto");
		double producto= leer.nextDouble();
		System.out.println("Vale, ahora le añadiremos el IVA " + (0.21*producto) + " y ese es el precio");
		
		leer.close();
	}

}
