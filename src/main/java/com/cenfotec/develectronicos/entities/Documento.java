package com.cenfotec.develectronicos.entities;

import java.time.LocalDateTime;

public abstract class Documento {
	private String idDoc;
	private String tipoTramite;
	private String responsable;
	private String productId;	
	LocalDateTime fechaCreacion = null;
		
	public String getIdDoc() {
		return idDoc;
	}
	
	public void setIdDoc(String idDoc) {
		this.idDoc = idDoc;
	}
	
	public String getResponsable() {
		return responsable;
	}
	
	public void setResponsable(String responsable) {
		this.responsable = responsable;
	}
	
	public String getProductId() {
		return productId;
	}
	
	public void setProductId(String productId) {
		this.productId = productId;
	}

	public LocalDateTime getFechaCreacion() {
		return fechaCreacion;
	}
	
	public String getTipoTramite() {
		return tipoTramite;
	}
	
	public void setTipoTramite(String tipoTramite) {
		this.tipoTramite = tipoTramite;
	}

}
