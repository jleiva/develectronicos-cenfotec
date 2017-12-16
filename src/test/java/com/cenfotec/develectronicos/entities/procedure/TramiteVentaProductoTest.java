package com.cenfotec.develectronicos.entities.procedure;

import static org.junit.Assert.*;

import org.junit.Test;

import com.cenfotec.develectronicos.entities.Orden;
import com.cenfotec.develectronicos.entities.extras.OrdenCompra;
import com.cenfotec.develectronicos.utils.enums.TipoDepartamento;
import com.cenfotec.develectronicos.utils.enums.TipoOrden;

import junit.framework.Assert;

@SuppressWarnings("deprecation")
public class TramiteVentaProductoTest {

	@Test
	public void shouldCreateProcedureVentaAndReturnDoc() {
		Orden ord = new Orden(TipoDepartamento.VEN.toString() ,TipoOrden.OrdenCompra.toString() ,"Juan","XO-11DS");
		OrdenCompra venta = new OrdenCompra(ord);
		TramiteVentaProducto ventaProducto = new TramiteVentaProducto(venta);
		
		Assert.assertEquals(venta, ventaProducto.getDoc());
	}

}
