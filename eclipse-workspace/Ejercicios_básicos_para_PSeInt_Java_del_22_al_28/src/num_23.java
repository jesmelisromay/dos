import java.util.Scanner;

public class num_23 {

	public static void main(String[] args) {
		/*23.Modifica el ejercicio 21, de forma que si se teclea un cero o negativo,
		 *  se vuelva a pedir el número por teclado (así hasta que se teclee un número mayor que cero) 
		 *  (recuerda la estructura mientras).
		 */
		Scanner sc = new Scanner(System.in);
		double num;

		System.out.println("introduzca un numero: ");
		num = sc.nextDouble();

		while (num <= 0) {
			System.out.println("introduzca un numero mayor que 0 : ");
			num = sc.nextDouble();
		}

		if (num % 2 == 0 )
			System.out.println(" tu numero es par ");

		else
			System.out.println("tu numero es impar");
			
		
		

}
}
