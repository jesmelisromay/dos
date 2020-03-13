import java.util.Scanner;

public class num_7 {

	public static void main(String[] args) {

		/*
		 * .-7  Dadas 3 longitudes. Decir mediante un mensaje si forman un triángulo:
		 * equilátero, isósceles o escaleno, o no forman triangulo (cada lado tiene que
		 * ser menos que la suma de los otros dos).
		 */
		Scanner sc=new Scanner(System.in);

		int lon1, lon2, lon3;

		System.out.println("introduzca la primera longitud: ");
		lon1 = sc.nextInt();
		System.out.println("introduzca la segunda longitud: ");
		lon2 = sc.nextInt();
		System.out.println("introduzca la tercera longitud: ");
		lon3 = sc.nextInt();

		if ((lon1 + lon2) >= lon3 && (lon1 + lon3) >= lon2 && (lon2 + lon3) >= lon1) {

			if (lon1 == lon2 && lon2 == lon3)
				System.out.println(" las longitudes forman un triangulo equilatero");

			else if (lon1 == lon2 || lon1 == lon3 || lon2 == lon3)
				System.out.println("las longitudes forman un triangulo isósceles ");

			else
				System.out.println("forma un tringulo escaleno");

		} else
			System.out.println(" no hace ningun triangulo ");

	}

}
