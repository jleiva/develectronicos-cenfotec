package com.cenfotec.develectronicos.entities.extras;

import com.cenfotec.develectronicos.entities.Orden;

public class OrdenEntrega extends DecoradorDocumento{

	private Orden doc;

	public OrdenEntrega() {
		this.doc = new Orden("OE-","Entrega","Responsable", "Idproducto");
	}
	
	public OrdenEntrega(Orden doc) {
		this.doc = doc;
	}

	public String toString() {
		String mensaje= doc.toString();
		return mensaje;
	}

}
