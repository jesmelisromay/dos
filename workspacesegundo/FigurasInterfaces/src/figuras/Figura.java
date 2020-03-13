package figuras;
// Declaraci�n de la interfaz Figura.

public interface Figura
{
   public double obtenerArea();    // calcular el �rea
   public double obtenerVolumen(); // calcular el volumen
   //En esta soluci�n suponemos que si la figura es plana
   // el volumen ser� cero
   public String obtenerNombre();  // devolver el nombre de la figura
} // fin de la interfaz Figura