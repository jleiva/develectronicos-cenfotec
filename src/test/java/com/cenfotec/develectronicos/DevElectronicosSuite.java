package com.cenfotec.develectronicos;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import com.cenfotec.develectronicos.data.DocumentoDAOTests;
import com.cenfotec.develectronicos.utils.SerializeDocumentTests;

@RunWith(Suite.class)
@Suite.SuiteClasses({
	DocumentoDAOTests.class,
	SerializeDocumentTests.class
})
public class DevElectronicosSuite {

}
