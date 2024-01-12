package trimestre1;

import java.util.Scanner;

public class ej001 {
	/*Definir una variable.
	Obtener el valor escrito por el usuario y guardarlo en la variable.
	Sumar 10 a la variable y guardar el resultado en otra variable.
	Comparar el valor del resultado con 15.
	Si el valor del resultado es:
	mayor que 15 mostrar un mensaje.
	menor que 15 mostrar otro mensaje.*/
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leer = new Scanner (System.in);
		
		System.out.println("dime un numero entero");
		int variable = leer.nextInt();
		
		int variable2= variable+10;
		System.out.println("ahora le sumamos 10 y esto da: " + variable2);
		
		System.out.println("ahora comparemos");
		if(variable2> 15) {
			System.out.println("el numero es mayor que 15");
		}else {
			System.out.println("el numero es menor que 15");
		}
		leer.close();
	}

}
