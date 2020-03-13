import java.util.Scanner;

public class num_22 {

	public static void main(String[] args) {
		/*22.- Algoritmo que nos diga si una persona puede acceder a cursar un 
		 * ciclo formativo de grado superior o no. Para acceder a un grado superior, 
		 * es necesario un título de bachillerato, en caso de no tenerlo, se puede acceder 
		 * si hemos superado una prueba de acceso.
		 */
		
		Scanner sc = new Scanner(System.in);
		String  bachi, prue_Acce;
		
		System.out.println("¿ tienes el titulo de bachillerato ? responder con SI o NO "); 
		bachi = sc.nextLine();	

		if (bachi.equals("si"))
			System.out.println("felicidades puedes acceder al grado superior");
		else {
			System.out.println("tienes la prueba de acceso superada? responder con SI o NO ");
			prue_Acce = sc.nextLine();

			if (prue_Acce.equals("si"))
				System.out.println(" felicidades puedes acceder al grado superior");
			else
				System.out.println("lo siento no puedes acceder");
		}

	}

}
