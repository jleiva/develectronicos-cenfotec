package com.cenfotec.develectronicos.entities.procedure.states;

import com.cenfotec.develectronicos.entities.extras.OrdenEntrega;
import com.cenfotec.develectronicos.entities.procedure.TramiteEntregaProducto;
import com.cenfotec.develectronicos.entities.procedure.interfaces.StateEntregaProducto;
import com.cenfotec.develectronicos.utils.enums.TipoOrden;

public class IniciarEntregaProducto implements StateEntregaProducto {
	
	private TramiteEntregaProducto tramiteEntregaProducto;
	
	@Override
	public void iniciarTramite() {
		System.out.println("Iniciando tramite, espere por favor....");
		
		OrdenEntrega inventario = (OrdenEntrega) (this.tramiteEntregaProducto.getDoc());
		
		inventario.getDoc().setPasoActual(2);
		this.tramiteEntregaProducto.setDoc(inventario);
		
		controller.crearOrden(TipoOrden.OrdenEntrega, tramiteEntregaProducto.getDoc());
		this.tramiteEntregaProducto.setState(this.tramiteEntregaProducto.getNotificacionEntrega());
	}

	@Override
	public void notificacionEntregaProducto() {
		System.out.println("El tramite esta en proceso de iniciar...");
	}

	@Override
	public void finalizarTramite() {
		System.out.println("Aun falta pasos para que el tramite termine");
	}

	@Override
	public void getEstadoActual() {
		System.out.println("Paso: Iniciando tramite...");
	}

	@Override
	public void save() {
		// TODO Auto-generated method stub
	}

	@Override
	public void ejecutarPasoActual() {
		iniciarTramite();
	}

}
