package excepciones1;
import java.util.*;

public class EjConExcepciones2 {
	public static void main(String args[]) {
	     Scanner scanner = new Scanner(System.in);
	     boolean ex;
	    
	     // A�adimos un bucle para que siga pidiendo la posici�n hasta que el dato le�do se corresponda 
	     // con un dato entero y en el argumento en la posici�n adecuada tenga un valor num�rico.
	     do {
		     ex = false;
	    	 try {
		     	System.out.println("Introduce una posicion");   	
		     	//mostrarEntero (args, scanner.nextInt()); 
		     	// nextInt devuelve excepci�n y no llega a vaciar el buffer
		     	// por lo que no vuelve a pedir posici�n
		     	mostrarEntero(args, Integer.parseInt(scanner.next()));
		     }
		     catch(ArrayIndexOutOfBoundsException error){
		     	System.out.println(" error " + "Introduzca una posicion dentro del rango del array");
		     	 ex = true;
		     }
		     catch(InputMismatchException error){
		     	System.out.println(" error " + "Introduzca una posicion en formato numerico");
		     	 ex = true;
		     }
	    	 catch (NumberFormatException error) {
				System.out.println(" error " + "El dato leido no es numerico");
				ex = true;
	    	 }
		     catch(Exception error){
		     	System.out.println(" error " + error);// Ejecuta el m�todo toString()
		     	ex = true;
		     }
	     }while (ex);
	     
	     scanner.close();
	 
	   }
	  
	   public static void mostrarEntero(String args[], int n) {
	      System.out.println("Entero " + obtenerEntero(args, n));	
	   }
	   
	   public static int obtenerEntero(String args[], int n) {
	      return Integer.parseInt(args[n]);	
	   }
}
