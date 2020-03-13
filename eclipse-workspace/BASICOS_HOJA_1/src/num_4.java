import java.util.Scanner;

public class num_4 {

	public static void main(String[] args) {
		/*4 Un año es bisiesto si es múltiplo de 4, exceptuando los múltiplos de 100, 
	     * que solo son bisiestos cuando son múltiplos además de 400.
	     */

	   Scanner sc = new Scanner(System.in);
		int anio;
	    
	    System.out.println("introduca un anio");
		anio =sc.nextInt();
	    
		if ( anio %100 ==0 && anio %400 != 0 ) {
			
			System.out.println("El anio " + anio + " no es biesiesto");
		}
		else if (anio %4 == 0) {
	    	
	    	System.out.println("El anio " + anio + " es biesiesto");
	    }
	    	
	    	
		else {
			System.out.println("el anio " + anio + " no es bisiesto");

		}

	}

}
