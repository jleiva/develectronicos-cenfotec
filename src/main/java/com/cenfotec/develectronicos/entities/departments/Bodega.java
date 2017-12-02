package com.cenfotec.develectronicos.entities.departments;

import com.cenfotec.develectronicos.entities.Departamento;

public class Bodega extends Departamento {


	public Bodega(int idDept, String nombreDept) {
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
	
	//este mae lista las ordenes de inventario?? (aplica lo mismo para los otros depts)
	
	
	public boolean consultaInventario(String productoId) {
		
		if (productoId == "0") {
			return false;
		}
		
		return true;
		
	}
	
	public boolean entregarProducto(String productoID) {
		
		return consultaInventario(productoID);
		
	}

}
