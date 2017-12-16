package com.cenfotec.develectronicos.entities.procedure;

import org.junit.Test;

import com.cenfotec.develectronicos.entities.Orden;
import com.cenfotec.develectronicos.entities.extras.OrdenFacturacion;
import com.cenfotec.develectronicos.utils.enums.TipoDepartamento;
import com.cenfotec.develectronicos.utils.enums.TipoOrden;

import junit.framework.Assert;

@SuppressWarnings("deprecation")
public class TramiteFacturacionTest {

	@Test
	public void shouldCreateProcedureFacturacionAndReturnDoc() {
		Orden ord = new Orden(TipoDepartamento.CON.toString() ,TipoOrden.OrdenFacturacion.toString() ,"Juan","XO-11DS");
		OrdenFacturacion fact = new OrdenFacturacion(ord);
		TramiteFacturacion facturacion = new TramiteFacturacion(fact);
		
		Assert.assertEquals(fact, facturacion.getDoc());
	}

}
