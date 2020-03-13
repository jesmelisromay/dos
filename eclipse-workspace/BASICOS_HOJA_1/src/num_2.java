import java.util.Scanner;

public class num_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*2. Haz un programa que convierta un número de galones en litros y escriba el resultado. 
		 *En un galón hay 3.7854 litros.*/
		
		double litros=3.7854; 
		double galones;
		
		System.out.println("introduzca el numero de galones");
		galones= sc.nextDouble();
		System.out.println(" el numero de " + galones + " galones en litro es de " + (galones * litros));

	}

}
