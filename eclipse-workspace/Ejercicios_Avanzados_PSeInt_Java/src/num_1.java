import java.util.Scanner;

public class num_1 {

	public static void main(String[] args) {
		/*
		 * 1.- Haz un programa que pida al usuario dos horas expresadas en hora y minuto
		 * y calcule la diferencia entre las dos horas en horas y minutos. No hay
		 * restricción en el orden en que se introduzcan las horas, lo controla el
		 * programador.
		 */
		Scanner sc = new Scanner(System.in);

		int hora1, hora2, minuto1, minuto2, diferencia1, diferencia2;

		System.out.println("introduzca la primera hora");
		hora1 = sc.nextInt();
		while (hora1 < 0 || hora1 > 24) {
			System.out.println("introduzca una hora del 0 al 24");
			hora1 = sc.nextInt();
		}

		System.out.println("introduzca el minuto");
		minuto1 = sc.nextInt();
		while (minuto1 < 0 || minuto1 > 60) {
			System.out.println("introduzca unos minutos del 0 al 60");
			minuto1 = sc.nextInt();
		}

		System.out.println("introduzca la segunda hora");
		hora2 = sc.nextInt();

		while (hora2 < 0 || hora2 > 24) {
			System.out.println("introduzca una hora del 0 al 24");
			hora2 = sc.nextInt();

		}

		System.out.println("introduzca el minuto");
		minuto2 = sc.nextInt();
		while (minuto2 < 0 || minuto2 > 60) {
			System.out.println("introduzca unos minutos del 0 al 60");
			minuto2 = sc.nextInt();

		}

		if (hora1 > hora2)
			diferencia1 = hora1 - hora2;

		else
			diferencia1 = hora2 - hora1;

		if (minuto1 > minuto2)
			diferencia2 = minuto1 - minuto2;
		else
			diferencia2 = minuto2 - minuto1;

		System.out.println("la diferencia de seria de  " + diferencia1 + " horas con " + diferencia2 + " minutos ");
		

	}

}
