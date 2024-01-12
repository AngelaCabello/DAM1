package trimestre1;

import java.util.Scanner;

public class ej007 {
/*Evalúa si una variable `temperatura` es menor a 0. Si es así, muestra un mensaje "Temperatura bajo cero".*/
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int temperatura;
		Scanner leer=new Scanner(System.in);
		
		System.out.println("Dime la temperatura actual");
		temperatura=leer.nextInt();
		if(temperatura<0) {
			System.out.println("Temperatura bajo cero.");
		}
		leer.close();
	}

}
