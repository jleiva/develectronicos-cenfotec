package com.cenfotec.develectronicos.entities.procedure.states;

import com.cenfotec.develectronicos.entities.procedure.TramiteVentaProducto;
import com.cenfotec.develectronicos.entities.procedure.interfaces.StateVentaProducto;

public class GenerarFacturacionVentaProducto implements StateVentaProducto {
	
	private TramiteVentaProducto tramite;
	
	public GenerarFacturacionVentaProducto(TramiteVentaProducto aThis) {
		this.tramite = aThis;
	}
	
	@Override
	public void iniciarTramite() {
		// TODO Auto-generated method stub

	}

	@Override
	public void consultarInventario() {
		// TODO Auto-generated method stub

	}

	@Override
	public void generarOrdenFacturacion() {
		this.tramite.setState(this.tramite.getFinalizarVentaProducto());
	}

	@Override
	public void finalizarTramite() {
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
		generarOrdenFacturacion();
	}

}
