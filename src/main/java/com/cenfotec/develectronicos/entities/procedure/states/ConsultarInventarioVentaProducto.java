package com.cenfotec.develectronicos.entities.procedure.states;

import com.cenfotec.develectronicos.entities.procedure.TramiteVentaProducto;
import com.cenfotec.develectronicos.entities.procedure.interfaces.StateVentaProducto;

public class ConsultarInventarioVentaProducto implements StateVentaProducto {

	private TramiteVentaProducto tramite;
	
	public ConsultarInventarioVentaProducto(TramiteVentaProducto aThis) {
		this.tramite = aThis;
	}
		
	@Override
	public void iniciarTramite() {
		// TODO Auto-generated method stub

	}

	@Override
	public void consultarInventario() {
		this.tramite.setState(this.tramite.getGenerarFactura());
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
		consultarInventario();
	}

}
