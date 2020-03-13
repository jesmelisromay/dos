package ejercicios;

import java.util.Scanner;

public class ejer_11 {
	/*
	 * La sucesión de Fibonacci se define de la siguiente forma: a1=1 a2=1 …
	 * an=an-1+an-2 para n>2,
	 * 
	 * Es decir, los dos primeros son 1 y el resto cada uno es la suma de los dos
	 * anteriores, los primeros son: 1, 1, 2, 3, 5, 8, 13, 21,... Haz un programa
	 * que calcule e imprima N términos de la sucesión, N se pedirá por teclado.
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int num_1 = 1, num_2=1 , fin, suma;
		System.out.println("introduzca un numero");
		fin = sc.nextInt();

		for (int i = 0; i < fin; i++) {

			if (i < 2)
				System.out.println(" 1 ");

			else {
				suma = num_1 + num_2;
				System.out.println(suma);
				num_2=num_1;
				num_1=suma;
			}

		}

	}

}
