import java.util.Scanner;

public class num_1 {

	public static void main(String[] args) {
		/*1. Hacer un programa que sume dos números leídos 
		 * por teclado y escriba el resultado con el mayor detalle posible
		 */
			Scanner sc = new Scanner(System.in);

		System.out.println("introduzca el numero 1 para sumarlo");
		int num1 = sc.nextInt();
		System.out.println("introduzca el numero 2 para sumarlo");
		int num2 = sc.nextInt();
		System.out.println("la suma de los numero de " + num1 + " y " + num2  + " es " +  (num1 + num2)); 
		
	}

}
