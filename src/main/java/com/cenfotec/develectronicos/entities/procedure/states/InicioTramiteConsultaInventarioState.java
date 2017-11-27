package com.cenfotec.develectronicos.entities.procedure.states;

import com.cenfotec.develectronicos.entities.procedure.TramiteConsultaInventario;
import com.cenfotec.develectronicos.entities.procedure.interfaces.StateConsultaInventario;

public class InicioTramiteConsultaInventarioState implements StateConsultaInventario {
	
	private TramiteConsultaInventario tramiteInventario;

	public InicioTramiteConsultaInventarioState(TramiteConsultaInventario aThis) {
		this.tramiteInventario = aThis;
	}
	
	@Override
	public void iniciarTramite() {
		// Aca tiene que ejecutar el proceso del tramite y pasarlo al siguiente estado
	}

	@Override
	public void consultarInventario() {
		System.out.println("El tramite esta en proceso de iniciar...");
	}

	@Override
	public void finalizarTramite() {
		System.out.println("Aun falta pasos para que el tramite termine");

	}

	@Override
	public void estadoActual() {
		// TODO Auto-generated method stub
		
	}

}
