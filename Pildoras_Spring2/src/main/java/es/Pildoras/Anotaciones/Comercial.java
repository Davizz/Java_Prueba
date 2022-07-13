package es.Pildoras.Anotaciones;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import es.Pildoras.IoC.Empleados;

@Component
public class Comercial implements Empleados{

	@Autowired
	public Comercial(CreacionInforme nuevoInforme) {
	this.nuevoInforme = nuevoInforme;
	}
	@Override
	public String getTareas() {
		// TODO Auto-generated method stub
		return "Vender";
	}

	public String getInforme() {
	return nuevoInforme.getInforme();
}
	
	private CreacionInforme nuevoInforme;
}
