package com.cenfotec.develectronicos.entities.extras;

import com.cenfotec.develectronicos.entities.Orden;

public class OrdenCompra extends DecoradorDocumento {

	private Orden doc;

	public OrdenCompra(Orden doc) {
		this.doc = doc;
		this.doc.actualizarIdOrden("OC");
	}
	
	public Orden getDoc() {
		return doc;
	}

	@Override
	public String toString() {
		String mensaje= doc.toString();
		return mensaje;
	}

	@Override
	public String getIdDoc() {
		// TODO Auto-generated method stub
		return this.doc.getIdDoc();
	}

	@Override
	public String getIdDep() {
		// TODO Auto-generated method stub
		return this.doc.getIdDep();
	}
	
}
