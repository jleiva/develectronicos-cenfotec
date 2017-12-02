package com.cenfotec.develectronicos.entities;

import java.time.LocalDateTime;

import com.cenfotec.develectronicos.utils.enums.EstadoTramite;

public class Orden extends Documento {
	 static public int cont=0;
	 private String idDoc;
	 private String tipoTramite;
	 private String responsable;
	 private String productoId;
	 private LocalDateTime fechaCreacion; 
	 private int pasoActual;
	 private EstadoTramite estado;
 
	 public Orden(String idDoc, String tipoTramite, String responsable, String productId) {
		this.idDoc= idDoc+ getNewCont();;
		this.tipoTramite = tipoTramite;
		this.responsable = responsable;
		this.productoId = productId;
		this.fechaCreacion = LocalDateTime.now();
		this.pasoActual =1;
	}
	 
	public Orden(String idDoc, String tipoTramite, String responsable, String productId, int paso ) {
		this.idDoc= idDoc + getNewCont();
		this.tipoTramite = tipoTramite;
		this.responsable = responsable;
		this.productoId = productId;
		this.fechaCreacion = LocalDateTime.now();
		this.pasoActual = paso;
	}
	
	public int getNewCont() {		
		return cont+1;
	}

	public int getPasoActual() {
		return pasoActual;
	}
	
	public void setPasoActual(int pasoActual) {
		this.pasoActual = pasoActual;
	}
	
	public String getIdDoc() {
		return idDoc;
	}
	
	public String getTipoTramite() {
		return tipoTramite;
	}

	public String getProductoId() {
		return productoId;
	}

	public String getResponsable() {
		return responsable;
	}
	
	public LocalDateTime getFechaCreacion() {
		return fechaCreacion;
	}
	
	public EstadoTramite getEstado() {
		return estado;
	}

	public void setEstado(EstadoTramite estado) {
		this.estado = estado;
	}

	public String toString() {
		String mensaje;
		
		mensaje="Fecha:" + this.getFechaCreacion() + "\n"+
				"Id del documento:" + this.getIdDoc() + "\n"+
		        "Tipo del tramite:" + this.getTipoTramite() + "\n"+
		        "Responsable:" + this.getResponsable()+ "\n"+
		        "Id del producto:" + this.getProductoId();
		return mensaje;
		
	}

}
