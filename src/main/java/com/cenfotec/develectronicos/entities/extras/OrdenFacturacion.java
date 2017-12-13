package com.cenfotec.develectronicos.entities.extras;

import com.cenfotec.develectronicos.entities.Orden;

public class OrdenFacturacion extends DecoradorDocumento{

	private Orden doc;
	private String idCliente;
	
	public OrdenFacturacion(Orden doc) {
		this.doc = doc;
		this.doc.actualizarIdOrden("OF");
	}
	
	public OrdenFacturacion(Orden doc, String idCliente) {
		this.doc = doc;
		this.doc.actualizarIdOrden("OF");
		this.idCliente = idCliente;
	}

	public OrdenFacturacion(String idCliente) {
		this.idCliente = idCliente;
	}
	
	public Orden getDoc() {
		return doc;
	}

	@Override
	public String toString() {
		String mensaje;
		mensaje= doc.toString() + "\n"+
				"Id del cliente"+ this.idCliente;		
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
