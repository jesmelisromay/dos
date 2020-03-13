import excepcion.*;

public class ExcepcionApp3 {
    public static void main(String[] args) {
        String str1="100";
	    String str2="10";
        String respuesta;
	    int cociente;
        try{
            cociente=calcular(str1, str2);
            respuesta=String.valueOf(cociente);
        }catch(NumberFormatException ex){
            respuesta="Se han introducido caracteres no num�ricos";
        }catch(ArithmeticException ex){
            respuesta="Divisi�n entre cero";
        }catch(ExcepcionIntervalo ex){
            respuesta=ex.getMessage();
        }catch(Exception ex){
        	respuesta=ex.getMessage();	
        }
        
        System.out.println(respuesta);

        try  {
			//espera la pulsaci�n de una tecla y luego RETORNO
            System.in.read();
        }catch (Exception e) {  }
    }
    
    // NumberFormatException, ArithmeticException no son obligatorias
    
/*    static int calcular(String str1, String str2) throws ExcepcionIntervalo,
     NumberFormatException, ArithmeticException{
        int num=Integer.parseInt(str1);
        int den=Integer.parseInt(str2);
        if((num>100)||(den<-5)){
            throw new ExcepcionIntervalo("N�meros fuera del intervalo");
        }
        return (num/den);
    }*/
    
    // Se puede hacer como arriba o as�:
    static int calcular(String str1, String str2) throws Exception{
        int num=Integer.parseInt(str1);
        int den=Integer.parseInt(str2);
        if((num>100)||(den<-5)){
            throw new ExcepcionIntervalo("N�meros fuera del intervalo");
        }
        return (num/den);
    }
}

 
