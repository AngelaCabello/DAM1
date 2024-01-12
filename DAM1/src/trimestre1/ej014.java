package trimestre1;

import java.util.Scanner;

public class ej014 {
/*Evalúa si un número `n` es igual a 1, imprime "Uno", si `n` es igual a 2, imprime "Dos", 
 * de lo contrario, imprime "Otro número".*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leer = new Scanner(System.in);
		
		System.out.println("dime un numero");
		int n=leer.nextInt();
				
		if(n==1) {
		 System.out.println("Uno");
		}else if (n==2){
		 System.out.println("Dos");
	    }else {
	    	System.out.println("otro numero");
	    }
	leer.close();
	}

}
