public class EjemploInterface {
	static void ManejoInstrumento(InstrumentoMusical f) {
		System.out.println(f.tipoInstrumento());
		f.afinar();
		f.tocar();
	}

	public static void main(String[] args) {
		InstrumentoMusical guitarra = new InstrumentoCuerda();
		ManejoInstrumento(guitarra);

		System.out.println();
		
		InstrumentoMusical trompeta = new InstrumentoViento();
		ManejoInstrumento(trompeta);

		// InstrumentoMusical im = new InstrumentoMusical();
	}
}