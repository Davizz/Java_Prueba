package es.Pildoras.Anotaciones;

import org.springframework.stereotype.Component;

@Component
public class InformeFinanciero implements CreacionInforme {

	@Override
	public String getInforme() {
		// TODO Auto-generated method stub
		return "Presentación de informe";
	}

}
