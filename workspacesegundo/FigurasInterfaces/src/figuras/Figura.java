package figuras;
// Declaración de la interfaz Figura.

public interface Figura
{
   public double obtenerArea();    // calcular el área
   public double obtenerVolumen(); // calcular el volumen
   //En esta solución suponemos que si la figura es plana
   // el volumen será cero
   public String obtenerNombre();  // devolver el nombre de la figura
} // fin de la interfaz Figura