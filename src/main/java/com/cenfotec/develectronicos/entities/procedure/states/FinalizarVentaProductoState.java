package com.cenfotec.develectronicos.entities.procedure.states;

import com.cenfotec.develectronicos.entities.extras.OrdenEntrega;
import com.cenfotec.develectronicos.entities.procedure.TramiteVentaProducto;
import com.cenfotec.develectronicos.entities.procedure.interfaces.StateVentaProducto;
import com.cenfotec.develectronicos.utils.enums.EstadoTramite;

public class FinalizarVentaProductoState implements StateVentaProducto {

	private TramiteVentaProducto tramite;
	
	public FinalizarVentaProductoState(TramiteVentaProducto aThis) {
		this.tramite = aThis;
	}
	
	@Override
	public void iniciarTramite() {
		System.out.println("EL tramite ya esta en finalizando, pronto le indicaremos la respuesta....");
	}

	@Override
	public void consultarInventario() {
		System.out.println("EL tramite ya esta en finalizando, pronto le indicaremos la respuesta....");
	}

	@Override
	public void generarOrdenFacturacion() {
		System.out.println("EL tramite ya esta en finalizando, pronto le indicaremos la respuesta....");
	}

	@Override
	public void finalizarTramite() {
		System.out.println("El tramite esta por finalizar....");
		
		OrdenEntrega inventario = (OrdenEntrega) (this.tramite.getDoc());
		if(inventario.getDoc().getEstado() == EstadoTramite.EnProceso) {
			inventario.getDoc().setEstado(EstadoTramite.Finalizado);
			this.tramite.setDoc(inventario);
			controller.actualizarOrden(tramite.getDoc());
		}	
	}

	@Override
	public void getEstadoActual() {
		System.out.println("Paso: Finalizando Tramite");
	}

	@Override
	public void save() {
		
	}

	@Override
	public void ejecutarPasoActual() {
		finalizarTramite();
	}

}
