package trimestre1;

import java.util.Scanner;

public class ej005 {
/*Crea un programa de nombre Ejemplo3Numeros que pida 3 valores decimales y que: 
• Muestre el resultado de multiplicar los 3 
• Muestre el resultado de sumar los 3 
• Muestre por consola si el 1er número es mayor que el 2o 
• Muestre por consola si los 3 números son iguales 
• Muestre por consola si el 1er número es múltiple de 2*/
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leer = new Scanner(System.in);
		
		System.out.println("dime un numero decimal");
		double decimal1=leer.nextDouble();
		System.out.println("dime otro numero decimal");
		double decimal2=leer.nextDouble();
		System.out.println("dime otro numero decimal");
		double decimal3=leer.nextDouble();
		
		System.out.println("ahora vamos a multiplicarlos, el resultado es " +(decimal1*decimal2*decimal3));
		System.out.println("ahora la suma de los 3, resultado: "+ (decimal1+decimal2+decimal3));
		
		if(decimal1>decimal2) {
			System.out.println(decimal2);
		}if (decimal1==decimal2 && decimal2==decimal3){
			System.out.println("los 3 numeros son iguales");
		}if(decimal1 % 2 == 0) {
			System.out.println();
	
		}
		
		leer.close();
	}

}
