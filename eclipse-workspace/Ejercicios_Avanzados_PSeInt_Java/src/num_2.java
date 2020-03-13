import java.util.Scanner;

public class num_2 {

	public static void main(String[] args) {
		/*2.- A un trabajador le descuentan de su sueldo el 10% si 
		 * su sueldo es menor o igual a 1000, por encima de 1000 y hasta 2000
		 *  el 5% del adicional, y por encima de 2000 el 3% del adicional.
		 *   Haz un programa que calcule el descuento y sueldo neto que recibe el trabajadorç
		 *    dado su sueldo.
		 *    
		 */
		Scanner sc = new Scanner(System.in);
		double sueldo_0, sueldo_1, sueldo_2, sueldo_3, adicional_1, adicional_2;
		
		System.out.println("introduzca su sueldo ");
		sueldo_0 = sc.nextDouble();
		
		if (sueldo_0 <=1000)
			sueldo_1 = sueldo_0 * 90/100;
		
		else if (sueldo_0 >1000 && sueldo_0 <2000) {
			                              //si el usuario dice 1500
			adicional_1 = sueldo_0 - 1000;//saco los 500
			sueldo_2= adicional_1 * 95/100;//descuento de los 500
		   	sueldo_0= sueldo_0 - adicional_1;//quito los 500 al sueldo original 
			sueldo_1 = sueldo_0 * 90/100; //hago el descuento de los prieros 1000
		    sueldo_2 = sueldo_2 + sueldo_1;}//sumo los sueldos 
		
		else if (sueldo_0 > 2000) {
			adicional_2 = sueldo_0 - 2000;
			sueldo_3 = adicional_2 * 93/100;
			
		} //////////////////////no terminado 
			
			
			
			
			
			
			
			
			
			
	}

}
