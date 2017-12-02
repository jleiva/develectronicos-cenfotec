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
	
	public boolean consultarInventario(String productoId) {
		
		//El product ID "0" retorna que no existe.
		if (productoId == "0") {
			return false;
		}
		
		return true;
		
	}
	
	public boolean entregarProducto(String productoID) {
		
		//El tramite de entregar producto hace una validacion de inventario
		//esto para evitar entregar un producto que no exite... (por aquello)
		return consultarInventario(productoID);
		
	}

}
