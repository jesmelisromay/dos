package figuras;

public class Cilindro implements Figura {
   private double altura;  // la altura del Cilindro
   private Circulo c;
   // constructor sin argumentos; el valor predeterminado de altura es 0.0
   public Cilindro()
   {
      // la llamada implícita al constructor de Circulo ocurre aquí
   } 

   // constructor
   public Cilindro( int x, int y, double radio, double valorAltura )
   {
      c=  new Circulo( new Punto(x, y), radio );  // llamar al constructor de Circulo
      altura = valorAltura;
   } 

   // Se pueden añadir más constructores
   
   // establecer la altura del Cilindro
   public void establecerAltura( double valorAltura )
   {
      altura = ( valorAltura < 0.0 ? 0.0 : valorAltura );
   } 

   // obtener la altura del Cilindro
   public double obtenerAltura()
   {
      return altura;
   } 

   // Sobreescribe obtenerArea para devolver area de Cilindro
   public double obtenerArea()
   {
      return 2 * c.obtenerArea() + c.obtenerLongCircunferencia() * altura;
   } 

   // desarrolla el método del interfaz obtenerVolumen para devolver valor del Cilindro
   public double obtenerVolumen()
   {
      // Area del círculo de la base por la altura
      return c.obtenerArea() * altura;
   } 

   // desarrolla el método del interfaz obtenerNombre para devolver "Cilindro"
   public String obtenerNombre()
   {
      return "Cilindro";
   } 

   // sobrescribir toString para devolver representación String del Cilindro
   public String toString()
   {
      return c + "; Altura = " + altura;
   } 

} // fin de la clase Cilindro