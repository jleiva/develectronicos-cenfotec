package com.cenfotec.develectronicos.entities;

public class Empleado {
	private String nombre;
	private String apellido;
	private String id;
	private String idDept;
	
	public Empleado(String nombre, String apellido, String id, String idDept){
		this.nombre = nombre;
		this.apellido = apellido;
		this.id = id;
		this.idDept = idDept;
	}
	 
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
	
	public String toString() {
		return this.nombre + " " + this.apellido + "\n" + 
				"ID: " + this.id + "\n" +
				"Departamento: " + this.idDept;
    }
	
}
