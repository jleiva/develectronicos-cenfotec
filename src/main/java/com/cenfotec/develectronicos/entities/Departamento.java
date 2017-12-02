package com.cenfotec.develectronicos.entities;

public class Departamento {
	private int idDept;
	private String nombreDept;
	
	
	public Departamento(int idDept, String nombreDept) {
		this.idDept = idDept;
		this.nombreDept = nombreDept;
	}

	public int getIdDept() {
		return idDept;
	}
	
	public String getNombreDept() {
		return nombreDept;
	}
		
}
