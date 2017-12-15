package com.cenfotec.develectronicos.entities.procedure.states;

import com.cenfotec.develectronicos.entities.extras.OrdenInventario;
import com.cenfotec.develectronicos.entities.procedure.TramiteConsultaInventario;
import com.cenfotec.develectronicos.entities.procedure.interfaces.StateConsultaInventario;
import com.cenfotec.develectronicos.utils.enums.TipoOrden;

public class IniciarConsultaInventarioState implements StateConsultaInventario {
	
	private TramiteConsultaInventario tramiteInventario;

	public IniciarConsultaInventarioState(TramiteConsultaInventario aThis) {
		this.tramiteInventario = aThis;
	}
	
	@Override
	public void iniciarTramite() {
		System.out.println("Iniciando tramite, espere por favor....");
		
		OrdenInventario inventario = (OrdenInventario) (this.tramiteInventario.getDoc());
		
		inventario.getDoc().setPasoActual(2);
		this.tramiteInventario.setDoc(inventario);
		
		controller.crearOrden(TipoOrden.OrdenInventario, tramiteInventario.getDoc());
		this.tramiteInventario.setState(this.tramiteInventario.getConsultaInventarioState());	
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
