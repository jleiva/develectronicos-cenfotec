package com.cenfotec.develectronicos.entities;

import static org.junit.Assert.*;

import org.junit.Test;

public class DepartamentoTest {
	
	Departamento dept = new Departamento("asd","NoName");

	@Test
	public void testDepartamento() {
		
		assertTrue(dept instanceof Departamento);
		
	}

	@Test
	public void testGetIdDept() {
		
		assertTrue(dept.getIdDept() == "asd");
		
	}

	@Test
	public void testGetNombreDept() {
		
		assertTrue(dept.getNombreDept() == "NoName");
		
	}

	@Test
	public void testToString() {
		
		 assertTrue(dept.toString().contains("Departamento ["));
		 
	}

}
