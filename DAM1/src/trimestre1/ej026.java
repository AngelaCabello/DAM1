package trimestre1;

import java.util.Scanner;

public class ej026 {
/*) Declara dos variables numéricas (con el valor que desees), 
 * muestra por consola la suma, resta, multiplicación, división y módulo (resto de la división).*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leer = new Scanner(System.in);
		int variable1=5;
		int variable2=12;
		
		System.out.println("la suma es: " + (variable1 + variable2));
		System.out.println("la resta es: " + (variable1 - variable2));
		System.out.println("la multiplicacion es: " + (variable1 * variable2));
		System.out.println("la division es: " + (variable1 / variable2));
		System.out.println("el modulo es: "+ (variable1%variable2));
		
		leer.close();
	}

}
