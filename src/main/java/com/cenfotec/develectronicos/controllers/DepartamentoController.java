package com.cenfotec.develectronicos.controllers;

import com.cenfotec.develectronicos.entities.Empleado;
import com.cenfotec.develectronicos.entities.Orden;
import com.cenfotec.develectronicos.entities.departments.Bodega;
import com.cenfotec.develectronicos.entities.departments.Contabilidad;
import com.cenfotec.develectronicos.entities.departments.Ventas;
import com.cenfotec.develectronicos.entities.extras.OrdenCompra;
import com.cenfotec.develectronicos.entities.extras.OrdenEntrega;
import com.cenfotec.develectronicos.entities.extras.OrdenFacturacion;
import com.cenfotec.develectronicos.entities.extras.OrdenInventario;

public class DepartamentoController {
	
	private Bodega bod;
	private Contabilidad cont;
	private Ventas vent;
	private boolean empleadoValido;
	private boolean ordenValidada;
	
	public DepartamentoController() {
		this.bod = new Bodega();
		this.cont = new Contabilidad();
		this.vent = new Ventas();
		this.empleadoValido = false;
		this.ordenValidada = false;
		
	}
	
	public boolean isEmpleadoValido() {
		return empleadoValido;
	}

	private void setEmpleadoValido(boolean empleadoValido) {
		this.empleadoValido = empleadoValido;
	}

	public boolean isOrdenValidada() {
		return ordenValidada;
	}

	private void setOrdenValidada(boolean ordenValidada) {
		this.ordenValidada = ordenValidada;
	}

	public void validarEmpleado(String pIdDeptOrden, String pIdDeptEmpleado) {
		
		if (pIdDeptOrden == pIdDeptEmpleado) {
			this.setEmpleadoValido(true);
		} else {
			this.setEmpleadoValido(false);
		}
	
	}
	
	public boolean procesarOrden(Orden ord, Empleado emp) {
		
		validarEmpleado(ord.getIdDep(), emp.getIdDept());
		
		if (isEmpleadoValido()) {
			
			switch(ord.getIdDoc().substring(0,2)) {
			case "OI":
				this.setOrdenValidada(this.bod.consultarInventario(ord.getProductoId()));
			case "OC":
				this.setOrdenValidada(this.vent.aprobarCompra(ord.getProductoId()));
			case "OF":
				this.setOrdenValidada(this.cont.procesarPago(ord.getProductoId()));
			case "OE":
				this.setOrdenValidada(this.bod.entregarProducto(ord.getProductoId()));
			default:
				this.setOrdenValidada(false);
				
			}
			
			return this.isOrdenValidada();
			
		} else {
			
			return this.isEmpleadoValido();
			
		}

	}
	
	public boolean procesarOrden(OrdenInventario ord, Empleado emp) {
		
		validarEmpleado(ord.getIdDep(), emp.getIdDept());
		
		if (isEmpleadoValido()) {
		
				this.setOrdenValidada(this.bod.consultarInventario(ord.getDoc().getProductoId()));
				return this.isOrdenValidada();	
				
		} else {
			
			return this.isEmpleadoValido();
			
		}

	}
	
	public boolean procesarOrden(OrdenCompra ord, Empleado emp) {
		
		validarEmpleado(ord.getIdDep(), emp.getIdDept());
		
		if (isEmpleadoValido()) {
		
				this.setOrdenValidada(this.vent.aprobarCompra(ord.getDoc().getProductoId()));
				return this.isOrdenValidada();	
				
		} else {
			
			return this.isEmpleadoValido();
			
		}

	}
	
	public boolean procesarOrden(OrdenFacturacion ord, Empleado emp) {
		
		validarEmpleado(ord.getIdDep(), emp.getIdDept());
		
		if (isEmpleadoValido()) {
		
				this.setOrdenValidada(this.cont.procesarPago(ord.getDoc().getProductoId()));
				return this.isOrdenValidada();	
				
		} else {
			
			return this.isEmpleadoValido();
			
		}

	}
	
	public boolean procesarOrden(OrdenEntrega ord, Empleado emp) {
		
		validarEmpleado(ord.getIdDep(), emp.getIdDept());
		
		if (isEmpleadoValido()) {
		
				this.setOrdenValidada(this.bod.entregarProducto(ord.getDoc().getProductoId()));
				return this.isOrdenValidada();	
				
		} else {
			
			return this.isEmpleadoValido();
			
		}

	}
	
	@Override
	public String toString() {
		String mensaje;
		String estado = null;
		if(this.isEmpleadoValido() == false) {
			estado="Empleado invalido.";
		}else if (isOrdenValidada()) {
			estado="Orden aprovada.";
		} else {
			estado="Orden denegada.";
		}
		mensaje= "Estado orden: " + estado;		
		return mensaje;
	}

}
