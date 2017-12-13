package com.cenfotec.develectronicos.utils;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.cenfotec.develectronicos.entities.Orden;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SerializeDocumentTests {
	private SerializeDocument util;
	
	@Before
	public void setUp() {
		util = new SerializeDocument();
	}
	
	@SuppressWarnings("static-access")
	@Test
	public void serializarDeDocumentoAjsonRetornaString() {
		Orden documento = new Orden();
		String json = util.toJSON(documento);
		
		assertTrue(json instanceof String);
	}
	
	@SuppressWarnings("static-access")
	@Test
	public void serializarDeStringADocumento() {
		String jsonString = "{\"idDoc\":\"idDoc02\", \"tipoTramite\":\"VentaProducto\", \"responsable\":\"Jose Leiva\", \"productoId\":\"MAM0516\"}";
		Orden documento = util.fromJSON(jsonString);
		
		assertTrue(documento instanceof Orden);
		assertEquals("idDoc02", documento.getIdDoc());
		assertEquals("VentaProducto", documento.getTipoTramite());
		assertEquals("Jose Leiva", documento.getResponsable());
		assertEquals("MAM0516", documento.getProductoId());
	}
}
