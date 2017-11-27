package com.cenfotec.develectronicos.entities.extras;

import com.cenfotec.develectronicos.entities.Documento;

public class OrdenFacturacion extends DecoradorDocumento{

	private Documento doc;
	private String idCliente;
	
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
	
	
}
