package com.cenfotec.develectronicos.entities;

import java.time.LocalDateTime;

import com.cenfotec.develectronicos.Enums.EnumEstado;

public class Documento {
	 String idDoc = "";
	 String tipoTramite = "";
	 String responsable = "";
	 String productId = "";
	 String stockStatus = "";
	 public int pasoActual;
	 LocalDateTime fechaCreacion = null;
	 EnumEstado estado = EnumEstado.EnProceso;
 
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
	 
	 public String getStockStatus() {
	  return stockStatus;
	 }
	 
	 public void setStockStatus(String stockStatus) {
	  this.stockStatus = stockStatus;
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

	public EnumEstado getEstado() {
		return estado;
	}

	public void setEstado(EnumEstado estado) {
		this.estado = estado;
	}

	public int getPasoActual() {
		return pasoActual;
	}

	public void setPasoActual(int pasoActual) {
		this.pasoActual = pasoActual;
	}
	 
	 

}