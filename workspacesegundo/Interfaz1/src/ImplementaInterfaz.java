public class ImplementaInterfaz implements MiInterfaz {
  
  int multiplicando=MiInterfaz.CONSTANTE;
  
  public int metodoAbstracto( int parametro ) {
    return ( parametro * multiplicando );
  } 
}


