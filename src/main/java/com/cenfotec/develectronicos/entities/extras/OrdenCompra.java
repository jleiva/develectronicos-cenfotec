package com.cenfotec.develectronicos.entities.extras;

import com.cenfotec.develectronicos.entities.Orden;

public class OrdenCompra extends DecoradorDocumento {

	private Orden doc;
	private String idOrdenConsulta;
	private String idOrdenFacturacion;

	public OrdenCompra(Orden doc) {
		this.doc = doc;
		this.doc.actualizarIdOrden("OC");
		this.idOrdenConsulta = "-1";
		this.idOrdenFacturacion = "-1";
	}
	
	public Orden getDoc() {
		return doc;
	}
	
	public String getIdOrdenConsulta() {
		return idOrdenConsulta;
	}

	public void setIdOrdenConsulta(String idOrdenConsulta) {
		this.idOrdenConsulta = idOrdenConsulta;
	}

	public String getIdOrdenFacturacion() {
		return idOrdenFacturacion;
	}

	public void setIdOrdenFacturacion(String idOrdenFacturacion) {
		this.idOrdenFacturacion = idOrdenFacturacion;
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
