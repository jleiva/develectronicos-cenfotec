package com.cenfotec.develectronicos.entities.procedure.states;

import com.cenfotec.develectronicos.entities.procedure.interfaces.StateFacturacion;

public class IniciarFacturacion implements StateFacturacion {

	@Override
	public void iniciarTramite() {
		// TODO Auto-generated method stub

	}

	@Override
	public void generarFacturaFisica() {
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
