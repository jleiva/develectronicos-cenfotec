package com.cenfotec.develectronicos.entities.extras;

import com.cenfotec.develectronicos.entities.Documento;

public class OrdenEntrega extends DecoradorDocumento{

	private Documento doc;

	public OrdenEntrega(Documento doc) {
		this.doc = doc;
	}

	public Documento getDoc() {
		return doc;
	}

}
