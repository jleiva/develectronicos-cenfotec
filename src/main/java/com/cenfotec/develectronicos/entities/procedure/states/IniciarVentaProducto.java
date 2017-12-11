package com.cenfotec.develectronicos.entities.procedure.states;

import com.cenfotec.develectronicos.entities.procedure.TramiteVentaProducto;
import com.cenfotec.develectronicos.entities.procedure.interfaces.StateVentaProducto;

public class IniciarVentaProducto implements StateVentaProducto {

	private TramiteVentaProducto tramite;
	
	public IniciarVentaProducto(TramiteVentaProducto aThis) {
		this.tramite = aThis;
	}
	
	@Override
	public void iniciarTramite() {
		this.tramite.setState(this.tramite.getConsultarInventario());
	}

	@Override
	public void consultarInventario() {
		// TODO Auto-generated method stub

	}

	@Override
	public void generarOrdenFacturacion() {
		// TODO Auto-generated method stub

	}

	@Override
	public void finalizarTramite() {
		// TODO Auto-generated method stub

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
		iniciarTramite();
	}

}
