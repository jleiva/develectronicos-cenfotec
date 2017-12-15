package com.cenfotec.develectronicos.entities;

public class Departamento {
	private String idDept;
	private String nombreDept;
	
	
	public Departamento(String idDept, String nombreDept) {
		this.idDept = idDept;
		this.nombreDept = nombreDept;
	}

	public String getIdDept() {
		return idDept;
	}
	
	public String getNombreDept() {
		return nombreDept;
	}

	@Override
	public String toString() {
		return "Departamento [" + (idDept != null ? "idDept=" + idDept + ", " : "")
				+ (nombreDept != null ? "nombreDept=" + nombreDept : "") + "]";
	}
		
}
