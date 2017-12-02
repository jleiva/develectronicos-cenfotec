package com.cenfotec.develectronicos.entities.procedure.states;

import com.cenfotec.Controllers.GestorConsultaInventario;
import com.cenfotec.develectronicos.Enums.EnumEstado;
import com.cenfotec.develectronicos.entities.procedure.TramiteConsultaInventario;
import com.cenfotec.develectronicos.entities.procedure.interfaces.StateConsultaInventario;

public class ConsultarInventarioState implements StateConsultaInventario {
	private TramiteConsultaInventario tramiteInventario;

	public ConsultarInventarioState(TramiteConsultaInventario aThis) {
		this.tramiteInventario = aThis;
	}
	
	@Override
	public void iniciarTramite() {
		System.out.println("La orden de consulta de inventario ya esta en proceso....");
	}

	@Override
	public void consultarInventario() {
		System.out.println("Consultando inventario.....");
		GestorConsultaInventario gestor = new GestorConsultaInventario();
		boolean estaProducto = gestor.consultarInventario(tramiteInventario.getDoc().getProductId());
		
		if(estaProducto == true) {
			this.tramiteInventario.getDoc().setStockStatus("Si");
			this.tramiteInventario.getFinalizarTramiteConsultaInventario();
		}else {
			this.tramiteInventario.getDoc().setEstado(EnumEstado.Finalizado);
			this.tramiteInventario.getDoc().setStockStatus("No");
		}
		
		this.tramiteInventario.setState(this.tramiteInventario.getFinalizarTramiteConsultaInventario());
		gestor.updateOrden(this.tramiteInventario.getDoc());
	}

	@Override
	public void finalizarTramite() {
		// TODO Auto-generated method stub
		System.out.println("La orden de consulta de inventario ya esta en proceso....");
	}


	@Override
	public void save() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getEstadoActual() {
		System.out.println("Paso: Consulta de inventario");
	}

	@Override
	public void ejecutarPasoActual() {
		consultarInventario();
	}

}