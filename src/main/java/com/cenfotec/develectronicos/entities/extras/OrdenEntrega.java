package com.cenfotec.develectronicos.entities.extras;

import com.cenfotec.develectronicos.entities.Orden;

public class OrdenEntrega extends DecoradorDocumento{

	private Orden doc;

	public OrdenEntrega(Orden doc) {
		this.doc = doc;
	}

	@Override
	public String toString() {
		String mensaje= doc.toString();
		return mensaje;
	}

}
