package com.cenfotec.develectronicos.entities.procedure;

import com.cenfotec.develectronicos.entities.Orden;
import com.cenfotec.develectronicos.entities.Tramite;
import com.cenfotec.develectronicos.entities.extras.OrdenFacturacion;
import com.cenfotec.develectronicos.entities.procedure.interfaces.StateFacturacion;
import com.cenfotec.develectronicos.entities.procedure.states.FinalizarFacturacionState;
import com.cenfotec.develectronicos.entities.procedure.states.GenerarFacturaFisicaState;
import com.cenfotec.develectronicos.entities.procedure.states.IniciarFacturacion;

public class TramiteFacturacion extends Tramite {
	IniciarFacturacion iniciarFacturacion;
	GenerarFacturaFisicaState generarFactura;
	FinalizarFacturacionState finalizarFacturacion;
	
	StateFacturacion state;

	public TramiteFacturacion(Orden doc) {
		super(doc);
		iniciarFacturacion = new IniciarFacturacion();
		generarFactura = new GenerarFacturaFisicaState();
		finalizarFacturacion = new FinalizarFacturacionState();
		setPasoActual();
	}
	
	@Override
	protected void setPasoActual() {
		int pasoActual = ((OrdenFacturacion) this.documento).getDoc().getPasoActual();
		switch(pasoActual) {
		case 1:
			state = iniciarFacturacion;
			break;
		case 2:
			state = generarFactura;
			break;
		case 3:
			state = finalizarFacturacion;
			break;
		}
	}

	@Override
	public void ejecutarPasoActual() {
		state.ejecutarPasoActual();
	}
	
	@Override
	public void getEstadoActual() {
		System.out.println(documento.toString());
		state.getEstadoActual();
	}

	public IniciarFacturacion getIniciarFacturacion() {
		return iniciarFacturacion;
	}

	public void setIniciarFacturacion(IniciarFacturacion iniciarFacturacion) {
		this.iniciarFacturacion = iniciarFacturacion;
	}

	public GenerarFacturaFisicaState getGenerarFactura() {
		return generarFactura;
	}

	public void setGenerarFactura(GenerarFacturaFisicaState generarFactura) {
		this.generarFactura = generarFactura;
	}

	public FinalizarFacturacionState getFinalizarFacturacion() {
		return finalizarFacturacion;
	}
	
	public void setFinalizarFacturacion(FinalizarFacturacionState finalizarFacturacion) {
		this.finalizarFacturacion = finalizarFacturacion;
	}

	public StateFacturacion getState() {
		return state;
	}

	public void setState(StateFacturacion state) {
		this.state = state;
	}
}
