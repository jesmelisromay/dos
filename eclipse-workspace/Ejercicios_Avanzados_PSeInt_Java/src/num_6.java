import java.util.Scanner;

public class num_6 {

	public static void main(String[] args) {
		/* 6.  Desarrollar un programa que determine si un número tiene o no parte
		 * fraccionaria.
		 */ 
		Scanner sc = new Scanner(System.in);
		
		  double num; 
		  System.out.println("introduzca un numero: "); 
		  num = sc.nextDouble();
		 
		 if (num %1 != 0 )
		  System.out.println(" el numero si tiene parte Fraccionara ");
		 else
		  System.out.println("el numero no tiene parte fraccionaria ");
		 
	}

}
