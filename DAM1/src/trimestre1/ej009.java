package trimestre1;

import java.util.Scanner;

public class ej009 {
/*Determina si una variable `puntuacion` es mayor o igual a 50. Si es así, imprime "Aprobado", de lo contrario, imprime "Reprobado".*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leer = new Scanner(System.in);
		
		System.out.println("dime tu puntuacion del 0 al 100");
		int puntuacion=leer.nextInt();
		if(puntuacion>50) {
			System.out.println("Aprovado");
		}else {
			System.out.println("suspenso");
		}
		leer.close();
	}

}
