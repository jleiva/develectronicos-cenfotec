package com.cenfotec.develectronicos.entities.procedure.states;

import com.cenfotec.Controllers.GestorConsultaInventario;
import com.cenfotec.develectronicos.entities.Documento;
import com.cenfotec.develectronicos.entities.extras.OrdenInventario;
import com.cenfotec.develectronicos.entities.procedure.TramiteConsultaInventario;
import com.cenfotec.develectronicos.entities.procedure.interfaces.StateConsultaInventario;
import com.cenfotec.develectronicos.utils.enums.EnumEstadoTramite;

public class FinalizarConsultaInventarioState implements StateConsultaInventario {

	private TramiteConsultaInventario tramiteInventario;
	
	public FinalizarConsultaInventarioState(TramiteConsultaInventario aThis) {
		this.tramiteInventario = aThis;
	}
	
	@Override
	public void iniciarTramite() {
		System.out.println("La orden de consulta de inventario ya esta en finalizando, pronto le indicaremos la respuesta....");
	}

	@Override
	public void consultarInventario() {
		System.out.println("La orden de consulta de inventario ya esta en finalizando, pronto le indicaremos la respuesta....");
	}

	@Override
	public void finalizarTramite() {
		System.out.println("El tramite esta por finalizar....");
		GestorConsultaInventario gestor = new GestorConsultaInventario();
		OrdenInventario inventario = (OrdenInventario) (this.tramiteInventario.getDoc());
		if(inventario.getDoc().getEstado() == EnumEstadoTramite.EnProceso) {
			inventario.getDoc().setEstado(EnumEstadoTramite.Finalizado);
			this.tramiteInventario.setDoc(inventario);
			gestor.updateOrden(tramiteInventario.getDoc());
		}		
	}
	
	@Override
	public void save() {
		// TODO Auto-generated method stub
	}

	@Override
	public void getEstadoActual() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void ejecutarPasoActual() {
		finalizarTramite();
	}

}
