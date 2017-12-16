package com.cenfotec.develectronicos.entities;

import static org.junit.Assert.*;

import org.junit.Test;

import com.cenfotec.develectronicos.utils.enums.TipoDepartamento;

public class EmpleadoTest {
	
	Empleado emp1 = new Empleado("L-desu","L-dono","007",TipoDepartamento.VEN.toString());

	@Test
	public void testEmpleado() {
		assertTrue(emp1 instanceof Empleado);
	}

	@Test
	public void testGetNombre() {
		assertTrue(emp1.getNombre() == "L-desu");
	}

	@Test
	public void testGetApellido() {
		assertTrue(emp1.getApellido() == "L-dono");
	}

	@Test
	public void testGetId() {
		assertTrue(emp1.getId() == "007");
	}

	@Test
	public void testGetIdDept() {
		assertTrue(emp1.getIdDept() == TipoDepartamento.VEN.toString());
	}

	@Test
	public void testToString() {
		 assertTrue(emp1.toString().contains(emp1.getNombre() + " " + emp1.getApellido()));
	}

}
