package com.cenfotec.develectronicos.entities.procedure.states;

import com.cenfotec.develectronicos.entities.extras.OrdenEntrega;
import com.cenfotec.develectronicos.entities.extras.OrdenInventario;
import com.cenfotec.develectronicos.entities.procedure.TramiteEntregaProducto;
import com.cenfotec.develectronicos.entities.procedure.interfaces.StateEntregaProducto;
import com.cenfotec.develectronicos.utils.enums.EstadoTramite;

public class FinalizarEntregaProductoState implements StateEntregaProducto {

	private TramiteEntregaProducto tramiteEntregaProducto;
	
	@Override
	public void iniciarTramite() {
		System.out.println("EL tramite ya esta en finalizando, pronto le indicaremos la respuesta....");
	}

	@Override
	public void notificacionEntregaProducto() {
		System.out.println("EL tramite ya esta en finalizando, pronto le indicaremos la respuesta....");
	}

	@Override
	public void finalizarTramite() {
		System.out.println("El tramite esta por finalizar....");
		
		OrdenEntrega inventario = (OrdenEntrega) (this.tramiteEntregaProducto.getDoc());
		if(inventario.getDoc().getEstado() == EstadoTramite.EnProceso) {
			inventario.getDoc().setEstado(EstadoTramite.Finalizado);
			this.tramiteEntregaProducto.setDoc(inventario);
			controller.actualizarOrden(tramiteEntregaProducto.getDoc());
		}	
	}

	@Override
	public void getEstadoActual() {
		// TODO Auto-generated method stub

	}

	@Override
	public void save() {
		// TODO Auto-generated method stub

	}

	@Override
	public void ejecutarPasoActual() {
		finalizarTramite();
	}

}
