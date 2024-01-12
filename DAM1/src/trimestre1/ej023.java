package trimestre1;

public class ej023 {
/*Ejercicio con break:Escribe un programa en Java que comience a contar desde 1 hacia arriba indefinidamente. 
 * Sin embargo, si encuentra un número que sea múltiplo de 7, debe detenerse utilizando break. 
 * El programa debe imprimir cada número a medida que cuenta.*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num= 1;
		while(num>0) {
			System.out.println(num);
			num++;
			
			if (num%7==0) {
				System.out.println(" es multiplo de 7");
				break;
			}
		}
	}

}
