package trimestre1;

import java.util.Scanner;

public class ej012 {
/*Evalúa si un número `num` es positivo. 
 * Si es positivo, imprime "Número positivo", de lo contrario, imprime "Número no positivo".*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leer = new Scanner(System.in);
		
		System.out.println("dime un numero");
		int num=leer.nextInt();
		
		if(num>=0) {
			System.out.println("es positivo");
		}else {
			System.out.println("es negativo");
		}
		leer.close();
	}

}
