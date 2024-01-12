package trimestre1;

import java.util.Scanner;

public class ej030 {
/* Lee un número por teclado e indica si es divisible entre 2 (resto = 0). Si no lo es, también debemos indicarlo.*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leer = new Scanner(System.in);
		
		System.out.println("dime un numero: ");
		int num = leer.nextInt();
		if (num % 2 == 0) {
			System.out.println(num + " divisble entre 2");
		} else {
			System.out.println(num + " no divisible entre 2");
		}
		leer.close();
	}

}
