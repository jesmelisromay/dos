import java.util.Scanner;

public class num_10 {

	public static void main(String[] args) {
		
		//10. Hacer un programa que permita escribir los primeros 100 números pares
		

		
		int num2=1, cont=0;

		while (cont < 100) {
			if (num2 % 2 == 0) {
				System.out.println(num2);
				cont++;
			}
			num2 = num2 + 1;
		}
		
	}

}
