package com.cenfotec.develectronicos.entities;

public class Empleado {
	private String nombre;
	private String apellido;
	private String id;
	private String idDept;
	
	public String getNombre() {
		return nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public String getId() {
		return id;
	}
	public String getIdDept() {
		return idDept;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public void setId(String id) {
		this.id = id;
	}
	public void setIdDept(String idDept) {
		this.idDept = idDept;
	}
	
}
