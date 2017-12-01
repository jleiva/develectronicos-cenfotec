package com.cenfotec.develectronicos.entities.procedure.states;

import com.cenfotec.Controllers.GestorConsultaInventario;
import com.cenfotec.develectronicos.Enums.EnumEstado;
import com.cenfotec.develectronicos.entities.Documento;
import com.cenfotec.develectronicos.entities.procedure.TramiteConsultaInventario;
import com.cenfotec.develectronicos.entities.procedure.interfaces.StateConsultaInventario;

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
		GestorConsultaInventario gestor = new GestorConsultaInventario();
		Documento documento = tramiteInventario.getDoc();
		if(documento.getStockStatus() == "si") {
			tramiteInventario.getDoc().setEstado(EnumEstado.Finalizado);
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
