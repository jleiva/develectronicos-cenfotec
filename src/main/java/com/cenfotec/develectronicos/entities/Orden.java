package com.cenfotec.develectronicos.entities;

import java.time.LocalDateTime;

public class Orden extends Documento {
	 static public int cont=0;
	 private String idDoc;
	 private String tipoTramite;
	 private String responsable;
	 private String productoId;
	 private LocalDateTime fechaCreacion; 
	 private int pasoActual;
 
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

	public Orden() {
		this.idDoc = "DOC-"+ getNewCont() ;
		this.tipoTramite = "Documento";
		this.responsable = "NA";
		this.productoId = "NA";
		this.fechaCreacion = LocalDateTime.now();
		cont=cont+1;
		
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
