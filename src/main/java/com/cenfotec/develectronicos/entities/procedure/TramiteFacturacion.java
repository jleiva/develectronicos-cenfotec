package com.cenfotec.develectronicos.entities.procedure;

import com.cenfotec.develectronicos.entities.Orden;
import com.cenfotec.develectronicos.entities.Tramite;
import com.cenfotec.develectronicos.entities.procedure.interfaces.StateFacturacion;
import com.cenfotec.develectronicos.entities.procedure.states.GenerarFacturaFisica;
import com.cenfotec.develectronicos.entities.procedure.states.IniciarFacturacion;

public class TramiteFacturacion extends Tramite {
	IniciarFacturacion iniciarFacturacion;
	GenerarFacturaFisica generarFactura;
	
	StateFacturacion state;
	public TramiteFacturacion() {
		super();
		// TODO Auto-generated constructor stub
	}

	public TramiteFacturacion(Orden doc) {
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
