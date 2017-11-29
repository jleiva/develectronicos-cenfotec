package com.cenfotec.develectronicos.entities.extras;

import com.cenfotec.develectronicos.entities.Documento;

public class OrdenCompra extends DecoradorDocumento{

	private Documento doc;

	public OrdenCompra(Documento doc) {
		this.doc = doc;
	}

	public Documento getDoc() {
		return doc;
	}

	public void setDoc(Documento doc) {
		this.doc = doc;
	}
	
	
}
