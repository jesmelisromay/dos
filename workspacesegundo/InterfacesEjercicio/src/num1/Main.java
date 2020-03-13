package num1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("diga el tamaño");
		int tamano=sc.nextInt();
		
		ArrayReales array = new ArrayReales(tamano);
		
		
		for (int i = 0; i < array.Atributo.length; i++) {
			System.out.println("ingrese el numero " +i);
			array.Atributo[i]=sc.nextDouble();
		}
		

		System.out.println("el maximo es " + array.maximo());
		System.out.println("el minimo es "+ array.minimo());
		System.out.println("la sume es " + array.sumatorio());
		
		

	}

}
