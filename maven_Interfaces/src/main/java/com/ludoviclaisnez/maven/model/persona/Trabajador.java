package com.ludoviclaisnez.maven.model.persona;

public class Trabajador extends Persona implements Tareas {
	
	private String empresa; 
	private int experiencia; 
	
	
	private Empresa empresaBizkaia; 
	
	
	
	public Trabajador() {
		
	}


	public Trabajador(String email, String nombre) {
		super(email, nombre);
		// TODO Auto-generated constructor stub
	}


	public Trabajador(Trabajador trabajador, Empresa empresaBizkaia) {
		super(trabajador.getEmail(), trabajador.getNombre());
		this.empresa = trabajador.empresa;
		this.experiencia = trabajador.experiencia;
		this.empresaBizkaia = empresaBizkaia; 
	}


	public Trabajador(String email, String nombre, String empresa, int experiencia, Empresa empresaBizkaia) {
		super(email, nombre);
		this.empresa = empresa;
		this.experiencia = experiencia;
		this.empresaBizkaia = empresaBizkaia; 
	}
	
	@Override
	public String toString() {
		return super.toString() + " Trabajador [empresa=" 
	+ empresa + ", experiencia=" + experiencia 
	+ ", " + getTareas()+ ", " + getEmpresaBizkaia().getEmpresa();
	}


	public String getEmpresa() {
		return empresa;
	}


	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}


	public int getExperiencia() {
		return experiencia;
	}


	public void setExperiencia(int experiencia) {
		this.experiencia = experiencia;
	}

	@Override
	public String getTareas() {
		
		return "Tiene que vender cosas para ganarse la vida";
	}


	public Empresa getEmpresaBizkaia() {
		return empresaBizkaia;
	}


	public void setEmpresaBizkaia(Empresa empresaBizkaia) {
		this.empresaBizkaia = empresaBizkaia;
	}
	
	
	
	
	
	
	
	

}
