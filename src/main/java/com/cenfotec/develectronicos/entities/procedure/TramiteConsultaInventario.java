package com.cenfotec.develectronicos.entities.procedure;

import com.cenfotec.develectronicos.entities.Documento;
import com.cenfotec.develectronicos.entities.Orden;
import com.cenfotec.develectronicos.entities.Tramite;
import com.cenfotec.develectronicos.entities.extras.OrdenInventario;
import com.cenfotec.develectronicos.entities.procedure.interfaces.StateConsultaInventario;
import com.cenfotec.develectronicos.entities.procedure.states.ConsultarInventarioState;
import com.cenfotec.develectronicos.entities.procedure.states.FinalizarConsultaInventarioState;
import com.cenfotec.develectronicos.entities.procedure.states.IniciarConsultaInventarioState;

public class TramiteConsultaInventario extends Tramite {
	
	private ConsultarInventarioState consultaInventarioState;
	private FinalizarConsultaInventarioState finalizarTramiteConsultaInventario;
	private IniciarConsultaInventarioState inicioTramiteConsultaInventario; 
	
	private StateConsultaInventario state;

	public TramiteConsultaInventario(Documento doc) {
		super(doc);
		consultaInventarioState = new ConsultarInventarioState(this);
		finalizarTramiteConsultaInventario = new FinalizarConsultaInventarioState(this);
		inicioTramiteConsultaInventario = new IniciarConsultaInventarioState(this);
		
		setPasoActual();
	}
	
	@Override
	protected void setPasoActual() {
		int pasoActual = ((OrdenInventario) this.documento).getDoc().getPasoActual();
		switch(pasoActual) {
		case 1:
			state = inicioTramiteConsultaInventario;
			break;
		case 2:
			state = consultaInventarioState;
			break;
		case 3:
			state = finalizarTramiteConsultaInventario;
			break;
		}
	}

	@Override
	public void getEstadoActual() {
		System.out.println(documento.toString());
		state.getEstadoActual();
	}
	
	@Override
	public void ejecutarPasoActual() {
		state.ejecutarPasoActual();
	}

	public StateConsultaInventario getState() {
		return state;
	}

	public void setState(StateConsultaInventario state) {
		this.state = state;
	}

	public ConsultarInventarioState getConsultaInventarioState() {
		return consultaInventarioState;
	}

	void setConsultaInventarioState(ConsultarInventarioState consultaInventarioState) {
		this.consultaInventarioState = consultaInventarioState;
	}

	public FinalizarConsultaInventarioState getFinalizarTramiteConsultaInventario() {
		return finalizarTramiteConsultaInventario;
	}

	void setFinalizarTramiteConsultaInventario(FinalizarConsultaInventarioState finalizarTramiteConsultaInventario) {
		this.finalizarTramiteConsultaInventario = finalizarTramiteConsultaInventario;
	}

	public IniciarConsultaInventarioState getInicioTramiteConsultaInventario() {
		return inicioTramiteConsultaInventario;
	}

	void setInicioTramiteConsultaInventario(IniciarConsultaInventarioState inicioTramiteConsultaInventario) {
		this.inicioTramiteConsultaInventario = inicioTramiteConsultaInventario;
	}

}
