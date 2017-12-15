package com.cenfotec.develectronicos.entities.procedure.states;

import com.cenfotec.develectronicos.entities.extras.OrdenEntrega;
import com.cenfotec.develectronicos.entities.procedure.TramiteFacturacion;
import com.cenfotec.develectronicos.entities.procedure.interfaces.StateFacturacion;
import com.cenfotec.develectronicos.utils.enums.EstadoTramite;

public class FinalizarFacturacionState implements StateFacturacion {

	private TramiteFacturacion tramiteFacturacion;
	
	@Override
	public void iniciarTramite() {
		System.out.println("EL tramite ya esta en finalizando, pronto le indicaremos la respuesta....");
	}

	@Override
	public void generarFacturaFisica() {
		System.out.println("EL tramite ya esta en finalizando, pronto le indicaremos la respuesta....");
	}

	@Override
	public void finalizarTramite() {
		System.out.println("El tramite esta por finalizar....");
		
		OrdenEntrega inventario = (OrdenEntrega) (this.tramiteFacturacion.getDoc());
		if(inventario.getDoc().getEstado() == EstadoTramite.EnProceso) {
			inventario.getDoc().setEstado(EstadoTramite.Finalizado);
			this.tramiteFacturacion.setDoc(inventario);
			controller.actualizarOrden(tramiteFacturacion.getDoc());
		}	
	}

	@Override
	public void getEstadoActual() {
		System.out.println("Paso: Finalizando Tramite");
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
