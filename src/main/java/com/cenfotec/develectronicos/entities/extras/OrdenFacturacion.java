package com.cenfotec.develectronicos.entities.extras;

import com.cenfotec.develectronicos.entities.Documento;

public class OrdenFacturacion extends DecoradorDocumento{

	private Documento doc;
	private String idCliente;
	
	public OrdenFacturacion(Documento doc, String idCliente) {
		this.doc = doc;
		this.idCliente = idCliente;
	}

	public Documento getDoc() {
		return doc;
	}

	public void setDoc(Documento doc) {
		this.doc = doc;
	}

	public OrdenFacturacion(String idCliente) {
		this.idCliente = idCliente;
	}

	public String getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(String idCliente) {
		this.idCliente = idCliente;
	}

	@Override
	public String toString() {
		String mensaje;
		mensaje= super.toString() + "\n"+
				"Id del cliente"+ this.getIdCliente();		
		return mensaje;
	}
	
	
}
