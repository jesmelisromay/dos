
public class basicos3_2 {

	public static void main(String[] args) {
		/*
		 * 2. Haz un programa en Java que muestre si dos números son o no amigos. Los números se pedirán por teclado. 
Explicación: Se dice que dos números son amigos si la suma de los divisores del primero (excluido el propio número) es el segundo número y viceversa. 

Ej: Los números 220 y 284 son amigos 
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
