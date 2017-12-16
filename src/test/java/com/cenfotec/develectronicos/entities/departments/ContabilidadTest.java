package com.cenfotec.develectronicos.entities.departments;

import static org.junit.Assert.*;

import org.junit.Test;

import com.cenfotec.develectronicos.utils.enums.TipoDepartamento;

public class ContabilidadTest {
	
	Contabilidad cont = new Contabilidad();

	@Test
	public void testContabilidadStringString() {
		Contabilidad cont2 = new Contabilidad(TipoDepartamento.CON.toString(), "CONTABILIDAD");
		
		assertTrue(cont2 instanceof Contabilidad);
	}

	@Test
	public void testContabilidad() {
		assertTrue(cont instanceof Contabilidad);
	}

	@Test
	public void testProcesarPago() {
		assertTrue(cont.procesarPago("OPD-UYT"));
	}

}
