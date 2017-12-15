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
	
	public boolean procesarPago(String idProducto) {
		
		return true;	
		
	}
	

}
