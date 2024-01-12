package trimestre1;

import java.util.Scanner;

public class ej008 {
	/*Verifica si un número `x` es igual a 10. Si es igual, imprime "El número es 10".*/
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leer = new Scanner(System.in);
		
		System.out.println("dime un numero entero");
		int num=leer.nextInt();
		
		if(num==10) {
			System.out.println("el numero introducido es igual a 10");
		}
		leer.close();
	}

}
