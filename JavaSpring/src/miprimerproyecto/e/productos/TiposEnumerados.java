package miprimerproyecto.e.productos;

public class TiposEnumerados {
	enum Tallas {
		CHIQUITIN("XXS"), SUPERPEQ("XS"), PEQ("S"), 
		MEDIANO("M"), GRANDE("L"), SUPERGRANDE("XL");

		private Tallas(String abreviatura) {
			this.abreviatura = abreviatura;
		}

		private String abreviatura;

		public String getAbreviatura() {
			return abreviatura;
		}

	
		
		
	}
}
