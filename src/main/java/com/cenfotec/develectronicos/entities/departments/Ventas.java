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

	public boolean aprobarCompra(String idProducto) {
		
		return true;
		
	}

}
