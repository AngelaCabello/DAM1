package trimestre1;

import java.util.Scanner;

public class EjercicioSwitchBucle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner scanner = new Scanner(System.in);
		   int numero;

		   	do {
		        System.out.println("Menú de Partidos de Fútbol:");
		        System.out.println("Opción 1. Real Madrid – Barcelona");
		        System.out.println("Opción 2. Betis – Sevilla");
		        System.out.println("Opción 3. Atlético de Madrid – Celta");
		        System.out.println("Opción 4. Salir");
		        System.out.print("Pon un numero de 1 al 4");
		         numero = scanner.nextInt();

		     switch (numero) {
		                case 1:
		                    System.out.println("Resultado: Real Madrid 3 - 5 Barcelona");
		                    break;
		                case 2:
		                    System.out.println("Resultado: Betis 1 - 3 Sevilla");
		                    break;
		                case 3:
		                    System.out.println("Resultado: Atlético de Madrid 4 - 2 Celta");
		                    break;
		                case 4:
		                    System.out.println("¡Hasta luego!");
		                    break;
		                default:
		                    System.out.println("Numero no valido. Pon otro");
		            }

		            System.out.println(); 

		     } while (numero != 4);

		        scanner.close();
		    }
		
	}