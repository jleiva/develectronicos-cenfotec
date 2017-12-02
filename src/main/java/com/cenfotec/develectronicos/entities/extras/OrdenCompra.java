package com.cenfotec.develectronicos.entities.extras;

import com.cenfotec.develectronicos.entities.Orden;

public class OrdenCompra extends DecoradorDocumento{

	private Orden doc;

	public OrdenCompra() {
		this.doc = new Orden("OC-","Venta","Responsable", "Idproducto");
	}
	
	public OrdenCompra(Orden doc) {
		this.doc = doc;
	}

	public Orden getDoc() {
		return doc;
	}

	public String toString() {
		String mensaje= doc.toString();
		return mensaje;
	}
	
}
