package com.cenfotec.develectronicos.entities;

import java.time.LocalDateTime;

public class Documento {
	 String idDoc;
	 String tipoTramite;
	 String responsable;
	 String productoId;
	 LocalDateTime fechaCreacion; 	 
 
	 public Documento(String idDoc, String tipoTramite, String responsable, String productId, 
			 String stockStatus) {
		this.idDoc = idDoc;
		this.tipoTramite = tipoTramite;
		this.responsable = responsable;
		this.productoId = productId;
		this.fechaCreacion = LocalDateTime.now();
	}
	public Documento(String idDoc, String tipoTramite, String responsable, String productId, 
			 String stockStatus,LocalDateTime fecha ) {
		this.idDoc = idDoc;
		this.tipoTramite = tipoTramite;
		this.responsable = responsable;
		this.productoId = productId;
		this.fechaCreacion = fecha;
	}

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
	 
	 public String getProductoId() {
	  return productoId;
	 }
	 
	 public void setProductoId(String productId) {
	  this.productoId = productId;
	 }
	 
	 public LocalDateTime getFechaCreacion() {
	  return fechaCreacion;
	 }
	 
	 public void setFechaCreacion(LocalDateTime fechaCreacion) {
	  this.fechaCreacion = fechaCreacion;
	 }
	 
	 public String getTipoTramite() {
	  return tipoTramite;
	 }
	 
	 public void setTipoTramite(String tipoTramite) {
	  this.tipoTramite = tipoTramite;
	 }

}