package com.cenfotec.develectronicos.entities;

public abstract class Tramite {
	private Departamento dept;
	private Documento doc = null;
	
	public Tramite() {
		this.doc = new Documento();
	}
	
	public Tramite(Documento doc) {
		this.doc = doc;
	}
	
	public Documento getDoc() {
		return doc;
	}


	private void setDoc(Documento doc) {
		this.doc = doc;
	}
	
	public abstract void encryptMessage();
	
	public abstract void decryptMessage();
	
	public abstract void save();
	
}
