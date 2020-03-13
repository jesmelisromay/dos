import java.util.Scanner;

public class num_5 {

	public static void main(String[] args) {
		
		/*5.- Se trata de escribir el algoritmo que permita emitir
		 *  la factura correspondiente a una compra de un artículo determinado,
		 *   del que se adquieren una o varias unidades. El IVA es del 15% y si el precio bruto
		 *    (precio venta más IVA) es mayor de 50 euros se debe realizar un descuento del 5%.
		 */
		
		Scanner sc = new Scanner(System.in);
		
		double precio, cantidad, total, iva;

		System.out.println("introduzca el precio del articulo");
		precio = sc.nextDouble();
		System.out.println("introduzca la cantidad de  articulos");
		cantidad  = sc.nextDouble();
		
		total = precio*cantidad;
		iva = total * 0.15 ;
		
		if (total > 50 ) {
			total = total + iva;
			total =  total * 95/100;
		
		} else 
			total = total + iva;
		
		System.out.println("el total del la factura es " + total );
			
			
			
		
		
		
	}

}
