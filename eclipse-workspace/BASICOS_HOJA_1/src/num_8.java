import java.util.Scanner;

public class num_8 {

	public static void main(String[] args) {
		/*8. Modificar el ejercicio 7 para que permita sumar N números.
		 *  El valor de N se debe leer previamente por teclado. 
		 */
		
Scanner sc = new Scanner(System.in);
		
		int suma=0, num=0 , i=1, cuantos;
		
		System.out.println("introduzaca la cantidad de numeros que desea sumar ");
		cuantos = sc.nextInt();
		
		while (i<=cuantos) {
			
			System.out.println("introduzca el  numero " + i );
			num= sc.nextInt();
		    
			suma= num + suma;
		    i++;
			
		} System.out.println("la suma es " + suma);
		
	}

}
