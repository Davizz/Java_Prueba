package int3;

//import miprimerproyecto.f.interfaces.parte2.Samsung;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PuertasSolidas solid = new PuertasSolidas();
		Trasgo trasgo = new Trasgo();
		Barbaro conan = new Barbaro(trasgo, solid, "Conan", 32);
		System.out.println(conan);
		
	}

}
