
public class basicos3_2 {

	public static void main(String[] args) {
		/*
		 * 2. Haz un programa en Java que muestre si dos n�meros son o no amigos. Los n�meros se pedir�n por teclado. 
Explicaci�n: Se dice que dos n�meros son amigos si la suma de los divisores del primero (excluido el propio n�mero) es el segundo n�mero y viceversa. 

Ej: Los n�meros 220 y 284 son amigos 
220 = 1+2+4+5+10+11+20+22+44+55+110 = 284 
284 = 1+2+4+71+142 = 220

		 */
		
		int num=936, divi=0, num2=9437, divi2=0;
		
		for (int i = 1; i < num; i++) {
			
			if(num%i==0)
				divi+=i;
			
			//System.out.println("la i"+i);
		//	System.out.println(divi);
			
			
		}
		
for (int i = 1; i < num2; i++) {
			
			if(num2%i==0)
				divi2+=i;

	}
System.out.println(divi);
System.out.println(divi2);

if (divi==num2)
	System.out.println("son amigos ");
else 
	System.out.println("no son amigos ");

	}
}
