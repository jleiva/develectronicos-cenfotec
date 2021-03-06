package com.cenfotec.develectronicos.entities.extras;

import com.cenfotec.develectronicos.entities.Orden;

public class OrdenEntrega extends DecoradorDocumento{

	private Orden doc;

	public OrdenEntrega(Orden doc) {
		this.doc = doc;
		this.doc.actualizarIdOrden("OE");
	}
	
	@Override
	public String toString() {
		String mensaje= doc.toString();
		return mensaje;
	}

	public Orden getDoc() {
		return doc;
	}

	public void setDoc(Orden doc) {
		this.doc = doc;
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
