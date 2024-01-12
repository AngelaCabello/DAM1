package trimestre1;

import java.util.Scanner;

public class ej013 {
/*Dado un número `calificacion`, imprime "Excelente" si es mayor o igual a 90, de lo contrario, 
 * si es mayor o igual a 70, imprime "Bueno", en caso contrario, imprime "Necesita mejorar".*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leer = new Scanner(System.in);
		
		System.out.println("dime tu nota del 0-100");
		int calificacion=leer.nextInt();
				
		if(calificacion>=90) {
		 System.out.println("excelente");
		}else if (calificacion>=70){
		 System.out.println("Bueno");
	    }else {
	    	System.out.println("necesitas mejorar");
	    }
	leer.close();
	}

}
