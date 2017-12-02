package com.cenfotec.develectronicos.entities;

import java.time.LocalDateTime;

import com.cenfotec.develectronicos.utils.enums.EstadoTramite;

public class Orden extends Documento {

	 private String idDoc;
	 private String tipoTramite;
	 private String responsable;
	 private String productoId;
	 private LocalDateTime fechaCreacion; 
	 private int pasoActual;
	 private EstadoTramite estado;
 
	 public Orden(String idDoc, String tipoTramite, String responsable, String productId, 
			 String stockStatus) {
		this.idDoc= idDoc;
		this.tipoTramite = tipoTramite;
		this.responsable = responsable;
		this.productoId = productId;
		this.fechaCreacion = LocalDateTime.now();
		this.pasoActual =1;
	}
	 
	public Orden(String idDoc, String tipoTramite, String responsable, String productId, 
			 String stockStatus,LocalDateTime fecha, int paso ) {
		this.idDoc= idDoc;
		this.tipoTramite = tipoTramite;
		this.responsable = responsable;
		this.productoId = productId;
		this.fechaCreacion = LocalDateTime.now();
		this.pasoActual = paso;
	}

	public Orden() {
		ContadorDoc cont = new ContadorDoc();
		this.idDoc = "DOC-"+ cont.getCont();
		cont.aumentarCont(); //no creo esto del contador sea ac� pero lo pongo para hacer pruebas
		this.tipoTramite = "Documento";
		this.responsable = "NA";
		this.productoId = "NA";
		this.fechaCreacion = LocalDateTime.now();
		this.estado = EstadoTramite.EnProceso;
		this.pasoActual = 1;
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
		
		mensaje="Id del documento:" + this.getIdDoc() + "\n"+
		        "Tipo del tramite:" + this.getTipoTramite() + "\n"+
		        "Responsable:" + this.getResponsable()+ "\n"+
		        "Id del producto:" + this.getProductoId();
		return mensaje;
		
	}

}
