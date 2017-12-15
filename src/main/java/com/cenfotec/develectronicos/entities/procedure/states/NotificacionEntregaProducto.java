package com.cenfotec.develectronicos.entities.procedure.states;

import com.cenfotec.develectronicos.entities.extras.OrdenFacturacion;
import com.cenfotec.develectronicos.entities.procedure.TramiteEntregaProducto;
import com.cenfotec.develectronicos.entities.procedure.interfaces.StateEntregaProducto;

public class NotificacionEntregaProducto implements StateEntregaProducto {

	private TramiteEntregaProducto tramiteEntregaProducto;
	
	@Override
	public void iniciarTramite() {
		System.out.println("La orden de generar factura ya esta en proceso....");
	}

	@Override
	public void notificacionEntregaProducto() {
		System.out.println("Contactando cliente.....");
		System.out.println("Enviando notificación.....");
		
		OrdenFacturacion inventario = (OrdenFacturacion) (this.tramiteEntregaProducto.getDoc());
		
		inventario.getDoc().setPasoActual(3);
		
		this.tramiteEntregaProducto.setDoc(inventario);
		this.tramiteEntregaProducto.setState(this.tramiteEntregaProducto.getFinalizarEntregaProducto());
		controller.actualizarOrden(this.tramiteEntregaProducto.getDoc());
	}

	@Override
	public void finalizarTramite() {
		System.out.println("La orden de entrega producto ya esta en proceso....");
	}

	@Override
	public void getEstadoActual() {
		System.out.println("Paso: Notificacion de entrega producto...");
	}

	@Override
	public void save() {
		
	}

	@Override
	public void ejecutarPasoActual() {
		notificacionEntregaProducto();
	}

}
