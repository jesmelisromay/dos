package num3;

public class Main {

	public static void main(String[] args) {

		Implementacion f1 = new Implementacion("la comida");
		Implementacion f2 = new Implementacion("la comida");
		Implementacion f3 = new Implementacion("la comida esta buena");
		Implementacion f4 = new Implementacion("de la comida no se puede abusar");

		String otro = "no";
		int b = 0;
		
		try {

			System.out.println(f1.esMayor(f4));
			System.out.println(f1.esIgual(f2));
			System.out.println(f4.esMayor(f1));
			System.out.println(f3.esMenor(b));
			System.out.println(f1.esMayor(otro));
			System.out.println(f1.esMayor(b));

		} catch (excepcion e) {
			System.out.println(e.getMessage());

		}

	}

}
