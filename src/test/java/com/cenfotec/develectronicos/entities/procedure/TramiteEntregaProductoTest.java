package com.cenfotec.develectronicos.entities.procedure;


import org.junit.Test;

import com.cenfotec.develectronicos.entities.Orden;
import com.cenfotec.develectronicos.entities.extras.OrdenEntrega;
import com.cenfotec.develectronicos.utils.enums.TipoDepartamento;
import com.cenfotec.develectronicos.utils.enums.TipoOrden;

import junit.framework.Assert;


@SuppressWarnings("deprecation")
public class TramiteEntregaProductoTest {

	@Test
	public void shouldCreateProcedureEntregaAndReturnDoc() {
		Orden ord = new Orden(TipoDepartamento.BOD.toString() ,TipoOrden.OrdenEntrega.toString() ,"Juan","XO-11DS");
		OrdenEntrega entrega = new OrdenEntrega(ord);
		TramiteEntregaProducto entregaProducto = new TramiteEntregaProducto(entrega);
		
		Assert.assertEquals(entrega, entregaProducto.getDoc());
	}

}
