import java.util.Scanner;

public class num_28 {

	public static void main(String[] args) {
		/*28.- Calcular el salario total de un grupo de N trabajadores 
		 * (pide el valor de N al usuario). Cada trabajador habrá trabajado un
		 *  número de horas distintas pero todos tienen el mismo salario por hora. 
		 *  Si el número de horas excede de 40 la tarifa por hora se incrementa en un 
		 *  50% para las horas extra		 
		 */
		Scanner sc = new Scanner(System.in);

		double pago, salario, horas, trabajadores,  
				saldogrupal = 0, horasextra = 0, pagoextra = 0,
				pagonormal;
		int cont=1;

		System.out.println("introduzca el numero de trabajadores");
		trabajadores = sc.nextDouble();
		System.out.println("introduzca el pago por horas");
		pago = sc.nextDouble();

		for (int i = 0; i < trabajadores; i++) 
		{

			System.out.println("introduzca el numero de horas trabajadas a la semana por el trabajador " + cont);
			horas = sc.nextDouble();
			if (horas > 40) 
			{
				horasextra = horas - 40;
				pagoextra = horasextra * (pago * 1.5);
				pagonormal = 40 * pago;
				salario = pagoextra + pagonormal;
				System.out.println("este trabajador ha hecho " + horasextra +
						" horas de mas, ha ganado " + pagoextra + " adicional");
			}

			else
				salario = horas * pago;
			
			System.out.println("el trabajador " + cont + " ha ganado en total " + salario);
			cont = cont + 1;
			saldogrupal = salario + saldogrupal;
		}
		System.out.println("el salario del grupo ha sido " + saldogrupal);
	}

}
