package figuras;

public class Punto
{
   private int x;  // parte x del par de coordenadas
   private int y;  // parte y del par de coordenadas

   // constructor sin argumentos; el valor predeterminado de x e y es 0
   public Punto()
   {
      // la llamada impl�cita al constructor de Object ocurre aqu�
   } 

   // constructor
   public Punto( int valorX, int valorY )
   {
      // la llamada impl�cita al constructor de Object ocurre aqu�
      x = valorX;  // no hay necesidad de validaci�n
      y = valorY;  // no hay necesidad de validaci�n
   } 
 
   // establecer x en el par de coordenadas
   public void establecerX( int valorX )
   {
      x = valorX;  // no hay necesidad de validaci�n
   } 

   // devolver x del par de coordenadas
   public int obtenerX()
   {
      return x;
   } 

   // establecer y en el par de coordenadas
   public void establecerY( int valorY )
   {
      y = valorY;  // no hay necesidad de validaci�n
   } 

   // devolver y del par de coordenadas
   public int obtenerY()
   {
      return y;
   } 

   // desarrolla el m�todo del interfaz obtenerNombre para que devuelva "Punto"
   public String obtenerNombre()
   {
      return "Punto";
   } 

   // sobrescribir toString para que devuelva la representaci�n String de Punto
   public String toString()
   {
      return "[" + obtenerX() + ", " + obtenerY() + "]";
   } 

} // fin de la clase Punto