package trimestre1;

import java.util.Scanner;

public class ej010 {
/*Chequea si un carácter `letra` es 'a'. Si es 'a', imprime "Es la primera letra del alfabeto", si no, imprime "No es la primera letra del alfabeto".*/
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leer = new Scanner(System.in);
		
		System.out.println("dime una letra");
		char letra=leer.next().charAt(0);
		
		char a = 'a';
		if(letra==a) {
			System.out.println("el la 1 letra abecedario");
		}else {
			System.out.println("no es la 1 letra abecedario");
		}
		leer.close();
	}

}