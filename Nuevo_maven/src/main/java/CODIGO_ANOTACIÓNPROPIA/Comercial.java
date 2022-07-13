package CODIGO_ANOTACIÓNPROPIA;

import org.springframework.stereotype.Component;

@Component("ComercialAnotacion")
public class Comercial implements Empleados{

	@Override
	public String getTareas() {
		// TODO Auto-generated method stub
		return "Vender mucho";
	}

	@Override
	public String getInforme() {
		// TODO Auto-generated method stub
		return "Informe agregado del comercial";
	}

}
