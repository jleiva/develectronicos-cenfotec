package com.cenfotec.develectronicos.entities.procedure;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import com.cenfotec.develectronicos.entities.Orden;
import com.cenfotec.develectronicos.entities.extras.OrdenInventario;
import com.cenfotec.develectronicos.utils.enums.TipoDepartamento;
import com.cenfotec.develectronicos.utils.enums.TipoOrden;

import junit.framework.Assert;


@SuppressWarnings("deprecation")
@RunWith(SpringRunner.class)
@SpringBootTest
public class TramiteConsultarInventarioTest {

	@Test
	public void shouldCreateProcedureAndReturnDoc() {
		Orden ord = new Orden(TipoDepartamento.BOD.toString() ,TipoOrden.OrdenInventario.toString() ,"Juan","XO-11DS");
		OrdenInventario inventario = new OrdenInventario(ord, false);
		TramiteConsultaInventario tramite = new TramiteConsultaInventario(inventario);
		
		Assert.assertEquals(inventario, tramite.getDoc());
	}
	
}
