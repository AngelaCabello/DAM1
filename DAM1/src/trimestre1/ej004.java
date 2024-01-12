package trimestre1;

import java.util.Scanner;

public class ej004 {
/*Escribe un programa que genere la nómina (bien desglosada) 
de un empleado según las siguientes condiciones: 
• Se pregunta el cargo del empleado (1 - Prog. junior, 2 - Prog. senior, 3 - Jefe de proyecto), 
los días que ha estado de viaje visitando clientes durante el mes y
 su estado civil (1 - Soltero, 2 - Casado). 
 • El sueldo base según el cargo es de 950, 1200 y 1600 euros 
 según si se trata de un prog. junior, un prog. senior o un jefe de proyecto respectivamente. 
 • Por cada día de viaje visitando clientes se pagan 30 euros extra en concepto de dietas. 
 Al sueldo neto hay que restarle el IRPF, que será de un 25% en caso de estar soltero y un 20% en caso de estar casado. 
 Ejemplo: 1 - Programador junior 2 - Prog. senior 3 - Jefe de proyecto Introduzca el cargo del empleado (1 - 3): 
 2 ¿Cuántos días ha estado de viaje visitando clientes? 5 
 Introduzca su estado civil (1 - Soltero, 2 - Casado): 
 2 -- | Sueldo base 1200,00 | | Dietas ( 5 viajes) 150,00 | |--| | Sueldo bruto 1350,00 | | Retención IRPF (20%) 270,00 | |--| | Sueldo neto 1080,00 | --*/
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leer = new Scanner(System.in);
		
        String cargo = null;
        double sueldo=0;
        boolean casado;
        int viajes;
        double dietas;
        double IRPF;
        System.out.println("dime que cargo tienes(prog.junior, prog.senior o jefe)");
        switch(cargo){
            case "prog.junior":
                sueldo = 950;
            case "prog.senior":
                sueldo =1200;
            case "jefe":  
                sueldo = 1600;
            default:
                System.out.println("no valido");
        }
        System.out.println("Su sueldo es actual es: "+sueldo);
        System.out.println("¿cuantos dias te has ido de viaje?");
         viajes= leer.nextInt();
         dietas=viajes*30;
         sueldo=sueldo+dietas;
         System.out.println("Su sueldo con la dietas es de; "+sueldo);
         System.out.println("Se ha gastado en dieta: "+dietas);
         System.out.println("eres casado (true o false)");
         casado = leer.nextBoolean();
         if(casado){
             IRPF=(sueldo*20)/100;
         }else
             IRPF=(sueldo*25)/100;        
        
        System.out.println("Su IRPF es de: "+IRPF);
        sueldo=sueldo-IRPF;
        System.out.println("Su sueldo final es de: "+sueldo);
		leer.close();
	}

}
