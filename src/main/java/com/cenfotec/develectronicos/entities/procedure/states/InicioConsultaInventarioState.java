package com.cenfotec.develectronicos.entities.procedure.states;

import com.cenfotec.Controllers.GestorConsultaInventario;
import com.cenfotec.develectronicos.entities.procedure.TramiteConsultaInventario;
import com.cenfotec.develectronicos.entities.procedure.interfaces.StateConsultaInventario;

public class InicioConsultaInventarioState implements StateConsultaInventario {
	
	private TramiteConsultaInventario tramiteInventario;

	public InicioConsultaInventarioState(TramiteConsultaInventario aThis) {
		this.tramiteInventario = aThis;
	}
	
	@Override
	public void iniciarTramite() {
		System.out.println("Iniciando tramite, espere por favor....");
		GestorConsultaInventario gestor = new GestorConsultaInventario();
		int idOrden = gestor.createOrden(tramiteInventario.getDoc());
		if(gestor.getOrden(idOrden) != 0) {
			this.tramiteInventario.setState(this.tramiteInventario.getConsultaInventarioState());
		}
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
	public void save() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getEstadoActual() {
		System.out.println("Paso: Iniciando tramite...");
	}

	@Override
	public void ejecutarPasoActual() {
		iniciarTramite();
		
	}
}