package com.cenfotec.develectronicos.entities.procedure.states;

import com.cenfotec.develectronicos.entities.procedure.TramiteConsultaInventario;
import com.cenfotec.develectronicos.entities.procedure.interfaces.StateConsultaInventario;

public class ConsultarInventarioState implements StateConsultaInventario {
	private TramiteConsultaInventario tramiteInventario;

	public ConsultarInventarioState(TramiteConsultaInventario aThis) {
		this.tramiteInventario = aThis;
	}
	
	@Override
	public void iniciarTramite() {
		// TODO Auto-generated method stub

	}

	@Override
	public void consultarInventario() {
		// TODO Auto-generated method stub

	}

	@Override
	public void finalizarTramite() {
		// TODO Auto-generated method stub

	}
	
	@Override
	public void estadoActual() {
		// TODO Auto-generated method stub
		
	}

}
