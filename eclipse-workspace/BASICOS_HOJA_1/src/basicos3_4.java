import java.util.Scanner;

public class basicos3_4 {

	public static void main(String[] args) {
		/*
		 * 4.  Para obtener el n�mero del tarot de una persona, hay que sumar los n�meros de su fecha de 
		 * nacimiento y reducirlo a un solo d�gito. 
Ej: 1 de Julio de 1990 1+7+1990 = 1998  1+9+9+8 = 27  2+7=9  El n�mero del tarot es el 9. 
Haz un programa que lea la fecha de nacimiento por teclado y escriba el n�mero del tarot. 
La fecha estar� formada por 3 n�meros enteros, el d�a, el mes y el a�o (4 d�gitos). 
		 */

		Scanner sc = new Scanner(System.in);
		int num1, num2,num3, suma, nu=0, ne=0;
		
		System.out.println("numero 1");
		num1=sc.nextInt();
		System.out.println("numero2");
		num2=sc.nextInt();
		System.out.println("numero2");
		num3=sc.nextInt();
		
		
		suma=num1+num2+num3;
		int cont=0;
		while(cont<suma){
		nu=suma%10;
		ne+=nu;
		suma=suma/10;
		cont++;
		System.out.println(suma+"suma");
		System.out.println(nu);
		System.out.println(ne);
		}
		
		
	}

}
