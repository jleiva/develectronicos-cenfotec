package com.cenfotec.develectronicos.entities.departments;

import com.cenfotec.develectronicos.entities.Departamento;
import com.cenfotec.develectronicos.utils.enums.TipoDepartamento;

public class Contabilidad extends Departamento {

	public Contabilidad(String idDept, String nombreDept) {
		super(idDept, nombreDept);
		// TODO Auto-generated constructor stub
	}
	
	public Contabilidad() {
		super(TipoDepartamento.CON.toString(), "CONTABILIDAD");
	}

	@Override
	public String getIdDept() {
		// TODO Auto-generated method stub
		return super.getIdDept();
	}

	@Override
	public String getNombreDept() {
		// TODO Auto-generated method stub
		return super.getNombreDept();
	}
	
	public boolean procesarPago(int precio, String responsable) {
		
		//Crear ordenes de entrega?
		return true;	
		
	}
	

}
