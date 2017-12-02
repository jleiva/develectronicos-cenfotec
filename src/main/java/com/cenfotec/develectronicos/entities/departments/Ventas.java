package com.cenfotec.develectronicos.entities.departments;

import com.cenfotec.develectronicos.entities.Departamento;

public class Ventas extends Departamento {

	public Ventas(int idDept, String nombreDept) {
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

	//Crear orden de compra??
		
	public boolean aprobarCompra(boolean respuestaInventario) {
		
		//Genera orden de facturacion (if approved)
		return respuestaInventario;
		
	}

}
