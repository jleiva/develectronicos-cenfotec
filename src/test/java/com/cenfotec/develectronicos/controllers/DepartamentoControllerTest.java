package com.cenfotec.develectronicos.controllers;

import static org.junit.Assert.*;

import org.junit.Test;

import com.cenfotec.develectronicos.entities.Empleado;
import com.cenfotec.develectronicos.entities.Orden;
import com.cenfotec.develectronicos.entities.extras.OrdenCompra;
import com.cenfotec.develectronicos.entities.extras.OrdenEntrega;
import com.cenfotec.develectronicos.entities.extras.OrdenFacturacion;
import com.cenfotec.develectronicos.entities.extras.OrdenInventario;
import com.cenfotec.develectronicos.utils.enums.TipoDepartamento;
import com.cenfotec.develectronicos.utils.enums.TipoOrden;

public class DepartamentoControllerTest {
	
	DepartamentoController depCon = new DepartamentoController();
	Orden ord = new Orden(TipoDepartamento.CON.toString() ,TipoOrden.OrdenFacturacion.toString() ,"Juan","XO-11DS");
	Orden ord2 = new Orden(TipoDepartamento.BOD.toString() ,TipoOrden.OrdenInventario.toString() ,"Juan","XO-11DS");
	Orden ord3 = new Orden(TipoDepartamento.VEN.toString() ,TipoOrden.OrdenCompra.toString() ,"Juan","XO-11DS");
	Orden ord4 = new Orden(TipoDepartamento.BOD.toString() ,TipoOrden.OrdenEntrega.toString() ,"Juan","XO-11DS");
	Empleado emp1 = new Empleado("Leizar","L-dono","007",TipoDepartamento.VEN.toString());
	Empleado emp2 = new Empleado("Leizar","L-dono","008",TipoDepartamento.CON.toString());
	Empleado emp3 = new Empleado("Leizar","L-dono","009",TipoDepartamento.BOD.toString());

	@Test
	public void testDepartamentoController() {
		assertTrue(depCon instanceof DepartamentoController);
	}

	@Test
	public void testIsEmpleadoValido() {
		assertTrue(depCon.isEmpleadoValido() == false);
	}

	@Test
	public void testIsOrdenValidada() {
		assertTrue(depCon.isOrdenValidada() == false);
	}

	@Test
	public void testValidarEmpleado() {
		
		depCon.validarEmpleado("asd","asd");
		
		assertTrue(depCon.isEmpleadoValido() == true);
	}

	@Test
	public void testProcesarOrdenOrdenEmpleado() {
		//Pendiente
		assertTrue(true);
	}

	@Test
	public void testProcesarOrdenOrdenInventarioEmpleado() {
		OrdenInventario inventario = new OrdenInventario(ord2, false);
		
		assertTrue(depCon.procesarOrden(inventario, emp3));
	}

	@Test
	public void testProcesarOrdenOrdenCompraEmpleado() {
		OrdenCompra venta = new OrdenCompra(ord3);
		
		assertTrue(depCon.procesarOrden(venta, emp1));
		
	}

	@Test
	public void testProcesarOrdenOrdenFacturacionEmpleado() {
		OrdenFacturacion fact = new OrdenFacturacion(ord);
		
		assertTrue(depCon.procesarOrden(fact, emp2));
	}

	@Test
	public void testProcesarOrdenOrdenEntregaEmpleado() {
		OrdenEntrega entrega = new OrdenEntrega(ord);
		
		assertTrue(depCon.procesarOrden(entrega, emp2));
	}

	@Test
	public void testToString() {
		assertTrue(depCon.toString().contains("Estado orden: "));
	}

}
