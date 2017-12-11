package com.cenfotec.develectronicos.entities.procedure.states;

import com.cenfotec.develectronicos.entities.procedure.interfaces.StateEntregaProducto;

public class FinalizarEntregaProducto implements StateEntregaProducto {

	@Override
	public void iniciarTramite() {
		// TODO Auto-generated method stub

	}

	@Override
	public void notificacionEntregaProducto() {
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
		finalizarTramite();
	}

}
