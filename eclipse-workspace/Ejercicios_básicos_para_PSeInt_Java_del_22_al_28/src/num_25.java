import java.util.Scanner;

public class num_25 {

	public static void main(String[] args) {
		/*25.- Se pide representar el algoritmo que nos calcule
		 *  la suma de los N primeros números naturales. N se leerá por teclado 
		 *  (no tenemos por qué llamar a la variable N, podemos llamarla como queramos).
		 */
		Scanner sc = new Scanner(System.in);
		
		int num, suma=0;
		
		System.out.println("introduzca un numero ");
		num= sc.nextInt();
		
		for (int i = 0; i <= num; i++) {
			
			suma = suma + i;	
		} 
		System.out.println("la suma es " + suma);
	}
	

}
