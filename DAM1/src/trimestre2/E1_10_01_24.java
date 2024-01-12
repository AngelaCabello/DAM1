package trimestre2;

import java.util.Scanner;

public class E1_10_01_24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*1.Sistema de Reserva de Asientos para Cine 
		   - Descripción: Crear un sistema de consola para reservar asientos en una sala de cine. 
		   				  El programa debe mostrar una matriz que represente los asientos (libres y ocupados) y permitir al usuario seleccionar asientos para reservarlos.
		   - Retos: Manejar correctamente la entrada del usuario, actualizar y mostrar el estado actual de los asientos, y gestionar situaciones como asientos ya reservados o entradas inválidas.*/
		
		Scanner leer = new Scanner(System.in);
		
		 int[][] posicion;
		 posicion = new int[11][6];
		 
		for(int a = 1;a <11; a++) {
			for(int b = 1;b<6;b++) {
			posicion[a][b]= 0;
			}
		}
		for(int a = 1; a <11; a++) {
			for(int b = 1; b<6; b++) {
				System.out.print(posicion[a][b]+ " ");
			}
			System.out.println("");
		}
		
		
		System.out.println("nuestro cine solo tiene 10 asientos por fila, y 5 filas");
		System.out.println("dime el asiento y fila que quieres");
		int a;
		int b;
		
		do {
		a = leer.nextInt();
		b = leer.nextInt();
		
		if(posicion[a][b]==0){
			System.out.println("lo acabas de ocupar");
			posicion[a][b]=1;
		}else {
			System.out.println("ya esta ocupado");
		}
		for(int c = 1; c<11; c++) {
			for(int d=1; d<6; d++) {
				System.out.print(posicion[c][d]+ " ");
			}
			System.out.println("");
		}
		
		}while(a!=11);
	}

}
