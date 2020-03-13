import java.util.Scanner;

public class num_3 {

	public static void main(String[] args) {

		/*3. Haz un programa que solicite una medida en pies y realice la conversión a 
		 * pulgadas, yardas, cm y metros. Ten en cuenta que un pie tiene 12 pulgadas, 
		 * una pulgada equivale a 2.54 cm y 1 yarda son 0.9144 metros. 
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("introduca una medida en Pies");
		double pies =sc.nextDouble();
		double yardas=0.9144;
		double pulgadas=12; //un pie tiene 12pulgadas
		double piepul = pies*pulgadas;
		System.out.println("en "+ pies + " pies hay " + piepul + " pulgadas");
		double cm=2.54; //en una pulgada hay 2.54cm
		double cmpul= cm*pulgadas * pies;
		System.out.println("en " + pies + " pies hay "+  cmpul + " centimetros "  );
	    double yar = (cmpul/yardas) / 100;
	    System.out.println("en " + pies + " pies hay "+  yar + " yardas"  );
	    double me= cmpul/100;
	    System.out.println("en " + pies + " pies hay "+  me + " metros"  ); 

	}

}
