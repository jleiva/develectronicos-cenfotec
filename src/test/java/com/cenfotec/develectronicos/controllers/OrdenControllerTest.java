package com.cenfotec.develectronicos.controllers;

import static org.hamcrest.CoreMatchers.not;
import static org.junit.Assert.*;

import org.hamcrest.collection.IsEmptyCollection;
import org.junit.Test;

import com.cenfotec.develectronicos.entities.Documento;
import com.cenfotec.develectronicos.entities.Empleado;
import com.cenfotec.develectronicos.entities.Orden;
import com.cenfotec.develectronicos.entities.extras.OrdenCompra;
import com.cenfotec.develectronicos.entities.extras.OrdenEntrega;
import com.cenfotec.develectronicos.entities.extras.OrdenFacturacion;
import com.cenfotec.develectronicos.entities.extras.OrdenInventario;
import com.cenfotec.develectronicos.utils.enums.TipoDepartamento;
import com.cenfotec.develectronicos.utils.enums.TipoOrden;

public class OrdenControllerTest {
	
	OrdenController oc = new OrdenController();
	Orden ord = new Orden(TipoDepartamento.CON.toString() ,TipoOrden.OrdenFacturacion.toString() ,"Juan","XO-11DS");
	Orden ord2 = new Orden(TipoDepartamento.BOD.toString() ,TipoOrden.OrdenInventario.toString() ,"Juan","XO-11DS");
	Orden ord3 = new Orden(TipoDepartamento.VEN.toString() ,TipoOrden.OrdenCompra.toString() ,"Juan","XO-11DS");
	Orden ord4 = new Orden(TipoDepartamento.BOD.toString() ,TipoOrden.OrdenEntrega.toString() ,"Juan","XO-11DS");
	Empleado emp1 = new Empleado("Leizar","L-dono","007",TipoDepartamento.VEN.toString());
	Empleado emp2 = new Empleado("Leizar","L-dono","008",TipoDepartamento.CON.toString());
	Empleado emp3 = new Empleado("Leizar","L-dono","009",TipoDepartamento.BOD.toString());

	@Test
	public void testOrdenController() {
		assertTrue(oc instanceof OrdenController);
	}

	@Test
	public void testListarOrdenesCompra() {
		//ordenes listadas
		assertThat(oc.listarOrdenesCompra(), not(IsEmptyCollection.empty()));
	}

	@Test
	public void testListarOrdenesInventario() {
		assertThat(oc.listarOrdenesInventario(), IsEmptyCollection.empty());
	}

	@Test
	public void testListarOrdenesFacturacion() {
		assertThat(oc.listarOrdenesFacturacion(), IsEmptyCollection.empty());
	}

	@Test
	public void testListarOrdenesEntrega() {
		assertThat(oc.listarOrdenesEntrega(), IsEmptyCollection.empty());
	}

	@Test
	public void testCrearOrdenTipoOrdenStringStringStringString() {
		Documento doc;
				
		doc = oc.crearOrden(TipoOrden.OrdenCompra,TipoDepartamento.VEN.toString(),"dummy","Leizar","P09-ERT");
		
		assertTrue(doc instanceof Documento);
	}

	@Test
	public void testCrearOrdenTipoOrdenDocumento() {
		Documento doc2;
		
		doc2 = oc.crearOrden(TipoOrden.OrdenCompra, ord3);
		
		assertTrue(doc2 instanceof Documento);
	}

	@Test
	public void testSeleccionarOrdenListOfOrdenString() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	public void testSeleccionarOrdenListOfStringStringBoolean() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	public void testProcesarConsultarInventarioString() {
		assertTrue(oc.procesarConsultarInventario("asd"));
	}

	@Test
	public void testProcesarConsultarInventarioOrdenInventarioEmpleado() {
		OrdenInventario inventario = new OrdenInventario(ord2, false);
		
		assertTrue(oc.procesarConsultarInventario(inventario,emp3));
	}

	@Test
	public void testProcesarAprobarCompra() {
		OrdenCompra venta = new OrdenCompra(ord3);
		
		assertTrue(oc.procesarAprobarCompra(venta,emp1));
	}

	@Test
	public void testProcesarProcesarPago() {
		OrdenFacturacion fact = new OrdenFacturacion(ord);
		
		assertTrue(oc.procesarProcesarPago(fact,emp2));
	}

	@Test
	public void testProcesarEntregarProducto() {
		OrdenEntrega entrega = new OrdenEntrega(ord);
		
		assertTrue(oc.procesarEntregarProducto(entrega,emp2));
	}

	@Test
	public void testActualizarOrden() {
		OrdenCompra venta = new OrdenCompra(ord3);
		
		oc.actualizarOrden(venta);
		
		assertTrue(venta instanceof Documento);
	}


	@Test
	public void testObtenerDocumento() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	public void testProcesarOrden() {
		//Pendiente
		assertTrue(true);
	}

}
