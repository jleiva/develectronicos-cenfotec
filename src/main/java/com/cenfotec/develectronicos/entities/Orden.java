package com.cenfotec.develectronicos.entities;

import java.time.LocalDateTime;

import com.cenfotec.develectronicos.utils.enums.EstadoTramite;

public class Orden extends Documento {
	 static public int cont=0;
	 private String idDoc;
	 private String idDep;
	 private String tipoTramite;
	 private String responsable;
	 private String productoId;
	 private LocalDateTime fechaCreacion; 
	 private int pasoActual;
	 private EstadoTramite estado;

	public Orden() {
			this.idDoc= "ORD-" + getNewCont();
			this.idDep = "NA";
			this.tipoTramite = "Tramite-OR";
			this.responsable = "Responsable";
			this.productoId = "IDProd";
			this.fechaCreacion = LocalDateTime.now();
			this.pasoActual = 1;
			this.estado = EstadoTramite.Pendiente;
	}		
	 		
	public Orden(String idDep, String tipoTramite, String responsable, String idProd) {
	    this.idDoc= "ORD-" + getNewCont();
		this.idDep = idDep;
		this.tipoTramite = tipoTramite;
		this.responsable = responsable;
		this.productoId = idProd;
		this.fechaCreacion = LocalDateTime.now();
		this.pasoActual = 1;
	}
		 
	public Orden(String tipoTramite, String responsable, String productId, String idDep,
			int paso) {
		this.idDoc= "ORD-" + getNewCont();
		this.idDep = idDep;
		this.tipoTramite = tipoTramite;
		this.responsable = responsable;
		this.productoId = productId;
		this.fechaCreacion = LocalDateTime.now();
		this.pasoActual = paso;
		this.estado = EstadoTramite.EnProceso;
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

	public String getIdDep() {
		return idDep;
	}

	public void setIdDep(String idDep) {
		this.idDep = idDep;
	}
	
	@Override
	public String toString() {
		String mensaje;
		
		mensaje="Fecha: " + this.getFechaCreacion() + "\n"+
				"Id del documento: " + this.getIdDoc() + "\n"+
		        "Tipo del tramite: " + this.getTipoTramite() + "\n"+
		        "Responsable: " + this.getResponsable()+ "\n"+
		        "Id Departamento: " + this.getIdDep()+ "\n"+
		        "Id del producto: " + this.getProductoId();
		return mensaje;
		
	}

	public void actualizarIdOrden(String id) {
		this.idDoc = this.idDoc.replace("ORD",id);
		
	}

}
