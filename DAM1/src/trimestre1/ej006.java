package trimestre1;

import java.util.Scanner;

public class ej006 {
/*Determina si un número entero `edad` es mayor o igual a 18. Si es así, imprime un mensaje que diga "Mayor de edad".*/
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leer = new Scanner (System.in);
		int edad;
		System.out.println("Dime cual es tu edad?");
		edad=leer.nextInt();
		if(edad>=18) {
			System.out.println("Mayor de edad");
		}
		leer.close();
	}

}
