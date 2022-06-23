package com.nombrealumno.poo.poo_anotaciones;

import org.springframework.stereotype.Component;
/*__Fase_018__ CREACIÓN CLASE IMPLEMENTANDO VENTA*/

@Component
public class Disponible implements Vendible {

	@Override
	public boolean vender() {
		// TODO Auto-generated method stub
		return true;
	}

}
