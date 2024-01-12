package trimestre1;

public class ej036 {
/*Muestra los números del 1 al 100 (ambos incluidos) divisibles entre 2 y 3. 
 * Utiliza el bucle que desees.*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 1;
		while (num <= 100) {
            if (num % 2 == 0 && num % 3 == 0) {
                System.out.println(num);
            }
            num++;
	}
	}
}
