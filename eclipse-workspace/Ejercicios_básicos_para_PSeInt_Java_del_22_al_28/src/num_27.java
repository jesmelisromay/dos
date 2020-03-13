import java.util.Scanner;

public class num_27 {

	public static void main(String[] args) {
		/*27.- Calcular el salario total de un grupo de N trabajadores 
		 * (pide el valor de N al usuario). Cada trabajador habrá trabajado un número
		 *  de horas distintas pero todos tienen el mismo salario por hora.
		 */
		Scanner sc = new Scanner(System.in);
		
		int  pago, salario, horas, trabajadores, cont=1 , saldogrupal=0;

		System.out.println("introduzca el numero de trabajadores");
		trabajadores = sc.nextInt();
		System.out.println("introduzca el pago por horas");
		pago = sc.nextInt();

		for (int i = 0; i < trabajadores; i++) {

			System.out.println(" introduzca el numero de horas trabajadas por el trabajador " + cont);
			horas = sc.nextInt();
			salario = horas * pago;
			System.out.println(" el trabajador " + cont + " ha ganado " + salario);
			cont = cont + 1;

			saldogrupal = salario + saldogrupal;
		}
		System.out.println("el salario del grupo ha sido " + saldogrupal);

	}

}
