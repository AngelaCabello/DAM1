package trimestre1;

import java.util.Scanner;

public class ej027 {
/*Declara 2 variables numéricas (con el valor que desees), 
 * he indica cual es mayor de los dos. Si son iguales indicarlo también. 
 * Ves cambiando los valores para comprobar que funciona.*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leer = new Scanner(System.in);
		int valor1=20;
		int valor2=20;
		
		if(valor1 < valor2) {
			System.out.println(valor1 + " es menor "+ valor2);
		}else if(valor1 > valor2){
			System.out.println(valor1 + " es mayor " + valor2);
		}else {
			System.out.println(valor1 + " y " + valor2 + " son iguales ");
		}
		leer.close();
	}

}
