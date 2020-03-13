import java.util.Scanner;

public class num_8 {

	public static void main(String[] args) {
		//8.Se piden 3 números al usuario y s escriben ascendente y descendentemente
		
		Scanner sc = new Scanner(System.in);

		
		int num1, num2, num3;
		System.out.println("Introduzca numero 1 ");
		num1= sc.nextInt();
		System.out.println("Introduzca numero 2 ");
		num2=sc.nextInt();
		System.out.println("Introduzca numero 3 ");
		num3 = sc.nextInt();
		
		if (num1 >= num2  && num1 >=num3 ) {
			if (num2>=num3)
			
			System.out.println(" la secuencia  descendente es " + num1 + " "+   num2  + " " + num3 );
			else 
				System.out.println(" la secuencia descendente es " + num1 + " "+   num3  + " " + num2 );
			}
		if (num2 >= num1 && num2 >= num3) {
			if (num1 >= num3)
				System.out.println(" la secuencia descendente es " + num2 + " " + num1 + " " + num3);
			else
				System.out.println(" la secuencia  descendente es " + num2 + " " + num3 + " " + num1);
		}
		if (num3 >= num1 && num3 >= num2) {
			if (num1 >= num2)
				System.out.println(" la secuencia descendente es " + num3 + " " + num1 + " " + num2);
			else
				System.out.println(" la secuencia descendente es " + num3 + " " + num2 + " " + num1);
		}
		
		if (num1 <= num2  && num1 <=num3 ) {
			if (num2<=num3)
			
			System.out.println(" la secuencia  ascedente es " + num1 + " "+   num2  + " " + num3 );
			else 
				System.out.println(" la secuencia ascedente es " + num1 + " "+   num3  + " " + num2 );
			}
		if (num2 <= num1 && num2 <= num3) {
			if (num1 <= num3)
				System.out.println(" la secuencia ascedente es " + num2 + " " + num1 + " " + num3);
			else
				System.out.println(" la secuencia  ascedente es " + num2 + " " + num3 + " " + num1);
		}
		if (num3 <= num1 && num3 <= num2) {
			if (num1 <= num2)
				System.out.println(" la secuencia ascedente es " + num3 + " " + num1 + " " + num2);
			else
				System.out.println(" la secuencia ascedente es " + num3 + " " + num2 + " " + num1);
		}
	
	
	
	
	
	}
	

}