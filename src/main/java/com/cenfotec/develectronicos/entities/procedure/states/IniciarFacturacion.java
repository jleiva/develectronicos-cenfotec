package com.cenfotec.develectronicos.entities.procedure.states;

import com.cenfotec.develectronicos.entities.extras.OrdenFacturacion;
import com.cenfotec.develectronicos.entities.procedure.TramiteFacturacion;
import com.cenfotec.develectronicos.entities.procedure.interfaces.StateFacturacion;
import com.cenfotec.develectronicos.utils.enums.TipoOrden;

public class IniciarFacturacion implements StateFacturacion {
	
	private TramiteFacturacion tramiteFacturacion;
	
	@Override
	public void iniciarTramite() {
		System.out.println("Iniciando tramite, espere por favor....");
		OrdenFacturacion inventario = (OrdenFacturacion) (this.tramiteFacturacion.getDoc());
		
		inventario.getDoc().setPasoActual(2);
		this.tramiteFacturacion.setDoc(inventario);
		
		controller.crearOrden(TipoOrden.OrdenFacturacion, tramiteFacturacion.getDoc());
		this.tramiteFacturacion.setState(this.tramiteFacturacion.getGenerarFactura());
	}

	@Override
	public void generarFacturaFisica() {
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
