public class Cuadrado implements Figura {
	int lado;
	
	// Constructor
	public Cuadrado (int ladoParametro) {
		lado = ladoParametro;
	}
	
	// Implementación del método de la interfaz
	public int area(){
		 return lado*lado;
	}
}


