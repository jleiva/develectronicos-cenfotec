package com.cenfotec.develectronicos.entities.departments;

import static org.junit.Assert.*;

import org.junit.Test;

import com.cenfotec.develectronicos.utils.enums.TipoDepartamento;

public class VentasTest {
	
	Ventas vent = new Ventas();

	@Test
	public void testVentasStringString() {
		Ventas vent2 = new Ventas(TipoDepartamento.VEN.toString(), "VENTAS");
		
		assertTrue(vent2 instanceof Ventas);
	}

	@Test
	public void testVentas() {
		assertTrue(vent instanceof Ventas);
	}

	@Test
	public void testAprobarCompra() {
		assertTrue(vent.aprobarCompra("OPD-UYT"));
	}

}
