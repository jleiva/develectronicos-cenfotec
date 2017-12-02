package com.cenfotec.develectronicos.entities.procedure;

import com.cenfotec.develectronicos.entities.Orden;
import com.cenfotec.develectronicos.entities.Tramite;

public class TramiteVentaProducto extends Tramite {

	public TramiteVentaProducto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public TramiteVentaProducto(Orden doc) {
		super(doc);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void setPasoActual() {
//		switch(doc.pasoActual) {
//		case 1:
//			state = inicioTramiteConsultaInventario;
//			break;
//		case 2:
//			state = consultaInventarioState;
//			break;
//		case 3:
//			state = finalizarTramiteConsultaInventario;
//			break;
//		}
	}

	@Override
	public void ejecutarPasoActual() {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void getEstadoActual() {
		System.out.println(documento.toString());
//		state.getEstadoActual();
	}

}
