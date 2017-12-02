package com.cenfotec.develectronicos.data;

import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.io.FileNotFoundException;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.cenfotec.develectronicos.utils.enums.DAOType;
import com.cenfotec.develectronicos.utils.factory.DAOFactory;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DocumentoDAOTests {
	
	@Test
	public void instanciaCorrectaSegunTipo() {
		DocumentoDAO daoJson = DAOFactory.crearDAO(DAOType.JSON_FILE);
		DocumentoDAO daoMongo = DAOFactory.crearDAO(DAOType.MONGO);
		
		assertTrue(daoJson instanceof JsonDocumentoDAO);
		assertTrue(daoMongo instanceof MongoDocumentoDAO);
	}
	
	@Test
	public void retornaNullSiArchivoJsonNoExiste() {
		DocumentoDAO daoJson = mock(JsonDocumentoDAO.class);
		when(daoJson.find("nombreArchivo")).thenReturn(null);
	
		byte[] dataToDecrypt =  daoJson.find("nombreArchivo");	
		assertNull(dataToDecrypt);
	}
}
