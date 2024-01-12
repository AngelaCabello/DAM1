package trimestre1;

import java.util.Scanner;

public class ej002 {
	/*Crea un programa en Java que permita calcular el promedio de calificaciones de un estudiante y determinar si el estudiante aprobó o no. Utiliza las siguientes variables:
	String nombreEstudiante: para almacenar el nombre del estudiante.
	char calificacion1 y char calificacion2: para almacenar las calificaciones obtenidas en dos asignaturas.
	int calificacion3 y int calificacion4: para almacenar las calificaciones numéricas obtenidas en otras dos asignaturas.
	double promedioCalificaciones: para calcular y almacenar el promedio de las calificaciones.
	boolean aprobo: para determinar si el estudiante aprobó (promedio mayor o igual a 70).
	El programa debe mostrar por la consola el nombre del estudiante, las calificaciones de las asignaturas, el promedio de calificaciones y si el estudiante aprobó o no.
	Asegúrate de inicializar las variables con valores adecuados y realizar los cálculos necesarios para obtener el promedio y determinar si el estudiante aprobó.*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leer = new Scanner(System.in);
		
		System.out.println("Vamos a calcular tu media");
		
		System.out.println("dime tu nombre");
		String nombre = leer.next();
		
		System.out.println("ahora dime tu 1 nota");
		char calificacion1= leer.next().charAt(0);
		System.out.println("ahora dime tu 2 nota");
		char calificacion2= leer.next().charAt(0);
		System.out.println("ahora dime tu 3 nota");
		int calificacion3= leer.nextInt();
		System.out.println("ahora dime tu 4 nota");
		int calificacion4= leer.nextInt();
		
		double promedioCalificaciones = (((double)calificacion1+(double)calificacion2+(double)calificacion3+(double)calificacion4) /4);
		
		System.out.println("tu media es: " + promedioCalificaciones);
		
		 boolean media = true;
				 if(promedioCalificaciones >= 70) {
					 System.out.println("has aprobado");
				 }else {
					 media = false;
					 System.out.println("has suspendido");
				 }
		leer.close();
	}

}
