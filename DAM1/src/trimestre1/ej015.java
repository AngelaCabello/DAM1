package trimestre1;

import java.util.Scanner;

public class ej015 {
/*Dada una variable `dia` que contiene un día de la semana (por ejemplo, "lunes"), 
 * utiliza un `switch` para imprimir el número del día (1 para lunes, 2 para martes, etc.).*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leer = new Scanner(System.in);
		
		System.out.println("dime un dia de la semana");
		String dia = leer.next();
		
		switch(dia) {
		case "lunes":
			System.out.println("dia 1");
			break;
		case "martes":
			System.out.println("dia 2");
			break;
		case "miercoles":
			System.out.println("dia 3");
			break;
		case "jueves":
			System.out.println("dia 4");
			break;
		case "viernes":
			System.out.println("dia 5");
			break;
		case "sabado":
			System.out.println("dia 6");
			break;
		case "domingo":
			System.out.println("dia 7");
			break;
		default:
			System.out.println("no es un dia de la semana");
		}
		
		leer.close();
	}

}
