package com.cenfotec.develectronicos.utils.factory;

import com.cenfotec.develectronicos.entities.Documento;
import com.cenfotec.develectronicos.entities.Orden;
import com.cenfotec.develectronicos.entities.extras.OrdenCompra;
import com.cenfotec.develectronicos.entities.extras.OrdenEntrega;
import com.cenfotec.develectronicos.entities.extras.OrdenFacturacion;
import com.cenfotec.develectronicos.entities.extras.OrdenInventario;
import com.cenfotec.develectronicos.utils.enums.TipoOrden;

public class OrdenFactory {

	public Documento crearOrden(TipoOrden tipo, Orden ord) {
		
		switch (tipo){
				case OrdenCompra:
					return new OrdenCompra(ord);
				case OrdenEntrega:
					return new OrdenEntrega(ord);
				case OrdenFacturacion:
					return new OrdenFacturacion(ord);
				case OrdenInventario:
					return new OrdenInventario(ord);
				default:
					return null;
	        }		
		
	}
	
	
}
