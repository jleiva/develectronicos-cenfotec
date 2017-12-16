package com.cenfotec.develectronicos.entities.departments;

import static org.junit.Assert.*;

import org.junit.Test;

import com.cenfotec.develectronicos.utils.enums.TipoDepartamento;

public class BodegaTest {
	
	Bodega bod = new Bodega();

	@Test
	public void testBodegaStringString() {
		
		Bodega bod2 = new Bodega(TipoDepartamento.BOD.toString(), "BODEGA");
		
		assertTrue(bod2 instanceof Bodega);
	}

	@Test
	public void testBodega() {
		assertTrue(bod instanceof Bodega);
	}

	@Test
	public void testConsultarInventario() {
		assertTrue(bod.consultarInventario("OPD-UYT"));
	}

	@Test
	public void testEntregarProducto() {
		assertTrue(bod.entregarProducto("OPD-UYT"));
	}

}
