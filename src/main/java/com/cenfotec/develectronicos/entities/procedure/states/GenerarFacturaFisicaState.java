package com.cenfotec.develectronicos.entities.procedure.states;

import com.cenfotec.develectronicos.entities.extras.OrdenFacturacion;
import com.cenfotec.develectronicos.entities.extras.OrdenInventario;
import com.cenfotec.develectronicos.entities.procedure.TramiteFacturacion;
import com.cenfotec.develectronicos.entities.procedure.interfaces.StateFacturacion;
import com.cenfotec.develectronicos.utils.enums.EstadoTramite;

public class GenerarFacturaFisicaState implements StateFacturacion {

	private TramiteFacturacion tramiteFacturacion;
	
	@Override
	public void iniciarTramite() {
		System.out.println("La orden de consulta de generar factura ya esta en proceso....");
	}

	@Override
	public void generarFacturaFisica() {
		System.out.println("Generando factura.....");
		System.out.println("Imprimiendo factura.....");
		
		OrdenFacturacion inventario = (OrdenFacturacion) (this.tramiteFacturacion.getDoc());
		
		inventario.getDoc().setPasoActual(3);
		
		this.tramiteFacturacion.setDoc(inventario);
		this.tramiteFacturacion.setState(this.tramiteFacturacion.getFinalizarFacturacion());
		controller.actualizarOrden(this.tramiteFacturacion.getDoc());
	}

	@Override
	public void finalizarTramite() {
		System.out.println("La orden de generar factura ya esta en proceso....");
	}

	@Override
	public void getEstadoActual() {
		System.out.println("Paso: Generar factura");
	}

	@Override
	public void save() {
		
	}

	@Override
	public void ejecutarPasoActual() {
		generarFacturaFisica();
	}

}
