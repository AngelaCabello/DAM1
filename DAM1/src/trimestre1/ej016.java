package trimestre1;

import java.util.Scanner;

public class ej016 {
/*Para una variable `mes`, imprime "Inicio de año" si es "enero", 
 * "Mitad de año" si es "junio" o "julio", y "Fin de año" si es "diciembre". 
 * En cualquier otro caso, imprime "Mes del año".*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leer = new Scanner(System.in);
		
		System.out.println("dime un dia de la semana");
		String mes = leer.next();
		
		switch(mes) {
		case "enero":
			System.out.println("inicio de año");
			break;
		case "junio":
			System.out.println("mitad de año");
			break;
		case "julio":
			System.out.println("mitad de año");
			break;
		case "diciembre":
			System.out.println("fin de año");
			break;
		default:
			System.out.println("mes del año");
		}
		
		leer.close();
	}

}
