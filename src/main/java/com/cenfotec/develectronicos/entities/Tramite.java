package com.cenfotec.develectronicos.entities;

public abstract class Tramite {
	Departamento dept;
	Documento doc = null;
	
	public Tramite() {
		this.doc = new Documento();
	}
	
	public Tramite(Documento doc) {
		this.doc = doc;
	}
	
	public abstract void encryptMessage();
	
	public abstract void decryptMessage();
	
	public abstract void save();
	
}
