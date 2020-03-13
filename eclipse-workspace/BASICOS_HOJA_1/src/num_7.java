import java.util.Scanner;

public class num_7 {

	public static void main(String[] args) {

		//7. Modificar el ejercicio 1 para sumar 10 números leídos por teclado. 
		Scanner sc = new Scanner(System.in);
		
		int suma=0, num=0 , i=1;
		
		
		while (i<=10) {
			
			System.out.println("introduzca un numero");
			num= sc.nextInt();
		    
			suma= num + suma;
		    i++;
			
		} System.out.println("la suma es " + suma);
		 
		
		
		
	}

	}


