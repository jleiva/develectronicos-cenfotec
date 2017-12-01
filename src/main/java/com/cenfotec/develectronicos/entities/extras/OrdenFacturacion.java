package com.cenfotec.develectronicos.entities.extras;

import com.cenfotec.develectronicos.entities.Orden;

public class OrdenFacturacion extends DecoradorDocumento{

	private Orden doc;
	private String idCliente;
	
	public OrdenFacturacion(Orden doc, String idCliente) {
		this.doc = doc;
		this.idCliente = idCliente;
	}

	public OrdenFacturacion(String idCliente) {
		this.idCliente = idCliente;
	}

	@Override
	public String toString() {
		String mensaje;
		mensaje= doc.toString() + "\n"+
				"Id del cliente"+ this.idCliente;		
		return mensaje;
	}
	
	
}
