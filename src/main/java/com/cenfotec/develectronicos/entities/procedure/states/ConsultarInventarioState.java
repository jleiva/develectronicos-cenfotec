package com.cenfotec.develectronicos.entities.procedure.states;

import com.cenfotec.develectronicos.entities.extras.OrdenInventario;
import com.cenfotec.develectronicos.entities.procedure.TramiteConsultaInventario;
import com.cenfotec.develectronicos.entities.procedure.interfaces.StateConsultaInventario;
import com.cenfotec.develectronicos.utils.enums.EstadoTramite;

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
		
		OrdenInventario inventario = (OrdenInventario) (this.tramiteInventario.getDoc());
		boolean estaProducto = controller.procesarConsultarInventario(inventario.getDoc().getProductoId());
		 
		if(estaProducto == true) {
			
			inventario.setStockStatus(true);
			this.tramiteInventario.getFinalizarTramiteConsultaInventario();
		}else {
			(inventario.getDoc()).setEstado(EstadoTramite.Finalizado);
			inventario.setStockStatus(false);
		}
		
		inventario.getDoc().setPasoActual(3);
		
		this.tramiteInventario.setDoc(inventario);
		this.tramiteInventario.setState(this.tramiteInventario.getFinalizarTramiteConsultaInventario());
		controller.actualizarOrden(this.tramiteInventario.getDoc());
	}

	@Override
	public void finalizarTramite() {
		System.out.println("La orden de consulta de inventario ya esta en proceso....");
	}


	@Override
	public void save() {
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
