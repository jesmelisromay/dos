import java.util.Scanner;

public class num_26 {

	public static void main(String[] args) {
		/*26.- Se pide representar el algoritmo que nos calcule
		 *  la suma de los N primeros números pares. Es decir, 
		 *  si el usuario escribe un 5 para el valor de N, nos haga la suma de 2+4+6+8+10.
		 */
		Scanner sc = new Scanner(System.in);
		
		int num, num2=1, suma=0, cont=0;
		
		System.out.println("introduza un numero ");
		num = sc.nextInt();
		
		while (cont < num) {
			if (num2 % 2 == 0) {
				suma = suma + num2;
				cont++;
			}
			num2 = num2 + 1;
		}
		
		System.out.println("la suma para los " + num + " primeros numero pares es " + suma);
			

		

	}

}
