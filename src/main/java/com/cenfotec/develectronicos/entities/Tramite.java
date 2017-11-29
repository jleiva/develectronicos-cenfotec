package com.cenfotec.develectronicos.entities;

public abstract class Tramite {
	private Departamento dept;
	protected Documento doc = null;
	
	public Tramite() {
		this.doc = new Documento();
	}
	
	public Tramite(Documento doc) {
		this.doc = doc;
		
	}
	
	public Documento getDoc() {
		return doc;
	}
	
	protected abstract void setPasoActual();

	public abstract void encryptMessage();
	
	public abstract void decryptMessage();
	
	public abstract void save();
	
	public abstract void iniciar();
	
}
