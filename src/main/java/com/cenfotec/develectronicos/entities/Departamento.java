package com.cenfotec.develectronicos.entities;

// Crear las clases por Departamento
// Ventas
// Bodega
// Contabilidad

// Recomendacion usar Herencia
// Analizar si cada Departamento debe tener un atributo de tipo Tramite
// donde cree el tipo de Tramite especifico que administra

public class Departamento {
	String idDept = "";
	String nombreDept = "";

	public String getIdDept() {
		return idDept;
	}
	public void setIdDept(String idDept) {
		this.idDept = idDept;
	}
	public String getNombreDept() {
		return nombreDept;
	}
	public void setNombreDept(String nombreDept) {
		this.nombreDept = nombreDept;
	}
	
	// Departamento ventas = new Departamento();
	// ventas.iniciarTramiteVentaProducto(prodId);
	
	// iniciarTramiteVentaProducto(prodId) {
	// 	Tramite tramite01 = new VentaProducto(prodId, idDept);	
	//}
	
	
}
