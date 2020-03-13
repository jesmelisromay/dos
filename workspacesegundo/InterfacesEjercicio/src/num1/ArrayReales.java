package num1;

public class ArrayReales implements Estadisticas {
	
	double [] Atributo ;
	
	
	
	
	public ArrayReales(int tamano) {
		
		Atributo= new double[tamano] ;
	}
	
	public double minimo(){
		
		double minimo=Atributo[0];
		
		for (int i = 0; i < Atributo.length; i++) {
			if(Atributo[i]<minimo){
				minimo=Atributo[i];
			}
		}
		
		return minimo;
		
	}
	public double maximo(){
		
double maximo=Atributo[0];
		
		for (int i = 0; i < Atributo.length; i++) {
			if(Atributo[i]>maximo){
				maximo=Atributo[i];
			}
		}
		
		return maximo;
		
	}
	public double sumatorio(){
		
double suma=0;
		
		for (int i = 0; i < Atributo.length; i++) {
			suma=suma+Atributo[i];
		}
		
		return suma;
		
		
	}

}
