package com.cenfotec.develectronicos.entities.departments;

import com.cenfotec.develectronicos.entities.Departamento;

public class Contabilidad extends Departamento {

	public Contabilidad(int idDept, String nombreDept) {
		super(idDept, nombreDept);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int getIdDept() {
		// TODO Auto-generated method stub
		return super.getIdDept();
	}

	@Override
	public String getNombreDept() {
		// TODO Auto-generated method stub
		return super.getNombreDept();
	}
	
	//Listar ordenes de facturacion?
	
	
	public boolean procesarPago(int precio, String responsable) {
		
		//Crear ordenes de entrega?
		return true;	
		
	}
	

}
