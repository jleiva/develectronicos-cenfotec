package com.cenfotec.develectronicos.entities;

public abstract class Tramite {
	protected Documento documento = null;
	
	public Tramite() {
		this.documento = new Orden();
	}
	
	public Tramite(Documento doc) {
		this.documento = doc;
	}
	
	public Documento getDoc() {
		return documento;
	}
	
	protected abstract void setPasoActual();
	
	public void getEstadoActual() {
		System.out.println(documento.toString());
	}
	
	public void setDoc(Documento doc) {
		this.documento = doc;
	}

	public abstract void ejecutarPasoActual();
	
}
