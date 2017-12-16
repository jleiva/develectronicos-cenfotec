package com.cenfotec.develectronicos;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import com.cenfotec.develectronicos.controllers.DepartamentoControllerTest;
import com.cenfotec.develectronicos.controllers.OrdenControllerTest;
import com.cenfotec.develectronicos.data.DocumentoDAOTests;
import com.cenfotec.develectronicos.entities.DepartamentoTest;
import com.cenfotec.develectronicos.entities.EmpleadoTest;
import com.cenfotec.develectronicos.entities.departments.BodegaTest;
import com.cenfotec.develectronicos.entities.departments.ContabilidadTest;
import com.cenfotec.develectronicos.entities.departments.VentasTest;
import com.cenfotec.develectronicos.utils.SerializeDocumentTests;

@RunWith(Suite.class)
@Suite.SuiteClasses({
	DocumentoDAOTests.class,
	SerializeDocumentTests.class,
	
	DepartamentoControllerTest.class,
	OrdenControllerTest.class,
	
	DepartamentoTest.class,
	EmpleadoTest.class,
	
	BodegaTest.class,
	ContabilidadTest.class,
	VentasTest.class
	
	
})
public class DevElectronicosSuite {

}
