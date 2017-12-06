package com.cenfotec.develectronicos.entities.procedure;

import com.cenfotec.develectronicos.entities.Orden;
import com.cenfotec.develectronicos.entities.Tramite;
import com.cenfotec.develectronicos.entities.procedure.interfaces.StateEntregaProducto;
import com.cenfotec.develectronicos.entities.procedure.states.FinalizarEntregaProducto;
import com.cenfotec.develectronicos.entities.procedure.states.IniciarEntregaProducto;
import com.cenfotec.develectronicos.entities.procedure.states.NotificacionEntregaProducto;

public class TramiteEntregaProducto extends Tramite {
	IniciarEntregaProducto iniciarEntregaProducto;
	NotificacionEntregaProducto notificacionEntrega;
	FinalizarEntregaProducto finalizarEntregaProducto;
	
	StateEntregaProducto state;
	
	public TramiteEntregaProducto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public TramiteEntregaProducto(Orden doc) {
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
