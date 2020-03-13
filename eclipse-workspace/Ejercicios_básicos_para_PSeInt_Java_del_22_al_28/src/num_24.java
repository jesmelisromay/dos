
public class num_24 {

	public static void main(String[] args) {
		/*24.- Desarrollar un algoritmo que nos calcule el cuadrado de los 9
		 *  primeros números naturales (recuerda la estructura desde-hasta)
		 */
		int num=0;
		double cuadrado;
		for (int i = 0; i < 9 ; i++) {
			
			cuadrado = Math.pow(num, 2);
			num ++;
			System.out.println("para el numero " + num + " el cuadrado es " + cuadrado);
			
		}
	}

}
