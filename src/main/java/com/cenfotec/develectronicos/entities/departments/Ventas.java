package com.cenfotec.develectronicos.entities.departments;

import com.cenfotec.develectronicos.entities.Departamento;
import com.cenfotec.develectronicos.utils.enums.TipoDepartamento;

public class Ventas extends Departamento {

	public Ventas(String idDept, String nombreDept) {
		super(idDept, nombreDept);
		// TODO Auto-generated constructor stub
	}
	
	public Ventas() {
		super(TipoDepartamento.VEN.toString(), "VENTAS");
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

	public boolean aprobarCompra(boolean respuestaInventario) {
		
		//Genera orden de facturacion (if approved)
		return respuestaInventario;
		
	}

}
