package com.nombrealumno.poo.poo_anotaciones;

import org.springframework.stereotype.Component;

@Component
public class EstadisticasLibros implements Estadisticas {

	private double ventasTotales;
	private String tipoVentas;
	private double gananciasTotales;
	private final double IVA;
	private boolean accesoDatos;

	public EstadisticasLibros(double ventasTotales, String tipoVentas, double gananciasTotales, double iVA,
			boolean accesoDatos) {
		this.ventasTotales = ventasTotales;
		this.tipoVentas = tipoVentas;
		this.gananciasTotales = gananciasTotales;
		IVA = iVA;
		this.accesoDatos = accesoDatos;
	}

	/* __Fase_024__--> CONFIG FICHERO */

	@Override
	public double getVentasTotales() {
		// TODO Auto-generated method stub
		return ventasTotales;
	}

	@Override
	public double getGananciasTotales() {
		// TODO Auto-generated method stub
		return gananciasTotales;
	}

	@Override
	public String getTipoVentas() {
		// TODO Auto-generated method stub
		return tipoVentas;
	}

	@Override
	public boolean getAccesoDatos() {
		// TODO Auto-generated method stub
		return accesoDatos;
	}

	@Override
	public double getIva() {
		// TODO Auto-generated method stub
		return IVA;
	}

	public void setVentasTotales(double ventasTotales) {
		this.ventasTotales = ventasTotales;
	}

	public void setTipoVentas(String tipoVentas) {
		this.tipoVentas = tipoVentas;
	}

	public void setGananciasTotales(double gananciasTotales) {
		this.gananciasTotales = gananciasTotales;
	}

	public void setAccesoDatos(boolean accesoDatos) {
		this.accesoDatos = accesoDatos;
	}

}
