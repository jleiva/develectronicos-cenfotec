package com.cenfotec.develectronicos.entities.procedure;

import com.cenfotec.develectronicos.entities.Orden;
import com.cenfotec.develectronicos.entities.Tramite;
import com.cenfotec.develectronicos.entities.extras.OrdenEntrega;
import com.cenfotec.develectronicos.entities.procedure.interfaces.StateEntregaProducto;
import com.cenfotec.develectronicos.entities.procedure.states.FinalizarEntregaProducto;
import com.cenfotec.develectronicos.entities.procedure.states.IniciarEntregaProducto;
import com.cenfotec.develectronicos.entities.procedure.states.NotificacionEntregaProducto;

public class TramiteEntregaProducto extends Tramite {
	IniciarEntregaProducto iniciarEntregaProducto;
	NotificacionEntregaProducto notificacionEntrega;
	FinalizarEntregaProducto finalizarEntregaProducto;
	
	StateEntregaProducto state;
	
	public TramiteEntregaProducto(Orden doc) {
		super(doc);
		iniciarEntregaProducto = new IniciarEntregaProducto();
		notificacionEntrega = new NotificacionEntregaProducto();
		finalizarEntregaProducto = new FinalizarEntregaProducto();
		
		setPasoActual();
	}

	@Override
	protected void setPasoActual() {
		int pasoActual = ((OrdenEntrega) this.documento).getDoc().getPasoActual();
		switch(pasoActual) {
		case 1:
			state = iniciarEntregaProducto;
			break;
		case 2:
			state = notificacionEntrega;
			break;
		case 3:
			state = finalizarEntregaProducto;
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

	public IniciarEntregaProducto getIniciarEntregaProducto() {
		return iniciarEntregaProducto;
	}

	public void setIniciarEntregaProducto(IniciarEntregaProducto iniciarEntregaProducto) {
		this.iniciarEntregaProducto = iniciarEntregaProducto;
	}

	public NotificacionEntregaProducto getNotificacionEntrega() {
		return notificacionEntrega;
	}

	public void setNotificacionEntrega(NotificacionEntregaProducto notificacionEntrega) {
		this.notificacionEntrega = notificacionEntrega;
	}

	public FinalizarEntregaProducto getFinalizarEntregaProducto() {
		return finalizarEntregaProducto;
	}

	public void setFinalizarEntregaProducto(FinalizarEntregaProducto finalizarEntregaProducto) {
		this.finalizarEntregaProducto = finalizarEntregaProducto;
	}

	public StateEntregaProducto getState() {
		return state;
	}

	public void setState(StateEntregaProducto state) {
		this.state = state;
	}
}
