package ejercicios;

import java.util.Scanner;

public class ejer_5 {

	/*. Hacer un programa que dado un día D, un mes M y un año A, 
	 * calcule cual es el día siguiente.  Se debe tener en cuenta que en los
	 *  años bisiestos Febrero tiene 29 días y en los no bisiestos 28. 
	 */
	public static void main(String[] args) {
		int dia, mes , ano, bisiesto, nobisiesto; 
		Scanner sc = new Scanner (System.in);

		//Meses con 30 días: Abril, Junio, Septiembre y Noviembre. 

		//Meses con 31 días: Enero, Marzo, Mayo, Julio, Agosto, Octubre y Diciembre. 

		System.out.println("introduzca un dia"); 

		dia = sc.nextInt(); 

		System.out.println("introduzca un mes"); 

		mes = sc.nextInt(); 

		System.out.println("introduzca un año"); 

		ano = sc.nextInt(); 

		if (mes>12) { 

		System.out.println("debe introducir un mes entre el 1 y el 12 "); 

		} 

		  

		if (mes == 2 ) { 
		
		    
			if ( ano %100 ==0 && ano %400 != 0 ) { //este es el del 1900
				
				if (dia <28)
					System.out.println(" el dia es " +  (dia + 1) + " el mes es " + mes + " el año es " + ano );
				else if (dia ==28)
					System.out.println(" el dia es 1" + " el mes es " + (mes+1) + " el año es " + ano);
				else 
					System.out.println("debe introducir un dia entre el 1 y el 28 para el mes " + mes); 
				//System.out.println("El aÃ±o " + ano + " no es biesiesto");
			}
			else if (ano %4 == 0) { //est es el de bisiesto normal
				if (dia <29)
					System.out.println(" el dia es " +  (dia + 1) + " el mes es " + mes + " el año es " + ano );
				else if (dia ==29)
					System.out.println(" el dia es 1" + " el mes es " + (mes+1) + " el año es " + ano);
				else 
					System.out.println("debe introducir un dia entre el 1 y el 29 para el mes " + mes); 
				//System.out.println("El aÃ±o " + ano + " es biesiesto");
		    }
		    	
		    	
			else { 
				if (dia <28)
				System.out.println(" el dia es " +  (dia + 1) + " el mes es " + mes + " el año es " + ano );
			else if (dia ==28)
				System.out.println(" el dia es 1" + " el mes es " + (mes+1) + " el año es " + ano);
			else 
				System.out.println("debe introducir un dia entre el 1 y el 28 para el mes " + mes); 
				
				//System.out.println("el aÃ±o " + ano + " no es bisiesto");

			}
			
			
			
		    } 

		if (mes ==1 || mes ==3 || mes ==5 || mes ==7 || mes ==8 || mes ==10 || mes ==12) { 

		if (dia < 31) 

		System.out.println("el dia es  " + (dia+1) + " el mes es " + mes + " el año es " + ano); 

		else if (dia==31 && mes==12) 

		System.out.println("el dia es  1 " +  " el mes es 1 "+  " el año es " + (ano+1) ); 

		else if(dia==31) 

		System.out.println(" el dia es 1" + " el mes es " + (mes+1) + " el año es " + ano); 

		else if (dia >31) 

		System.out.println("debe introducir un dia entre el 1 y el 31 para el mes " + mes); 		 

		}  

		if  (mes ==4 ||  mes ==6 || mes ==9 || mes ==11) { 

		if (dia < 30) 

		System.out.println("el dia es  " + (dia+1) + " el mes es " + mes + " el año es " + ano); 

		else if(dia==30) 

		System.out.println(" el dia es 1" + " el mes es " + (mes+1) + " el año es " + ano); 

		else if (dia >30) 

		System.out.println("debe introducir un dia entre el 1 y el 30 para el mes " + mes); 

		} 

		} 

	}


