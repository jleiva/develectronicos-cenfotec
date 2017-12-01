package com.cenfotec.develectronicos.entities;

public abstract class Tramite {
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
	
	public void getEstadoActual() {
		System.out.println(doc.toString());
	}
	
	public abstract void ejecutarPasoActual();
	
}
