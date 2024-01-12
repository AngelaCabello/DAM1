package trimestre1;

public class ej024 {
/*Ejercicio con continue: Crea un programa en Java que utilice un bucle for para iterar a 
 * través de los números del 1 al 10. El programa debe imprimir todos los números excepto
 *  los que son divisibles por 3. Para los números divisibles por 3, 
 *  el bucle debe usar continue para saltar la impresión y pasar al siguiente número.*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		for(num=1;num<=10;num++) {
			if (num%3==0) {
				continue;
			}
			System.out.println(num);
		}
	}
}
