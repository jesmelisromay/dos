public class Cuadrado implements Figura {
	int lado;
	
	// Constructor
	public Cuadrado (int ladoParametro) {
		lado = ladoParametro;
	}
	
	// Implementaci�n del m�todo de la interfaz
	public int area(){
		 return lado*lado;
	}
}


