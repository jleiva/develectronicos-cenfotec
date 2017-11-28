package com.cenfotec.develectronicos.entities.procedure;

import com.cenfotec.develectronicos.entities.Documento;
import com.cenfotec.develectronicos.entities.Tramite;
import com.cenfotec.develectronicos.entities.procedure.interfaces.StateConsultaInventario;
import com.cenfotec.develectronicos.entities.procedure.states.ConsultarInventarioState;
import com.cenfotec.develectronicos.entities.procedure.states.FinalizarTramiteConsultaInventarioState;
import com.cenfotec.develectronicos.entities.procedure.states.InicioTramiteConsultaInventarioState;

public class TramiteConsultaInventario extends Tramite {
	
	private ConsultarInventarioState consultaInventarioState;
	private FinalizarTramiteConsultaInventarioState finalizarTramiteConsultaInventario;
	private InicioTramiteConsultaInventarioState inicioTramiteConsultaInventario; 
	
	private StateConsultaInventario state;
	
	public TramiteConsultaInventario() {
		super();
		consultaInventarioState = new ConsultarInventarioState(this);
		finalizarTramiteConsultaInventario = new FinalizarTramiteConsultaInventarioState(this);
		inicioTramiteConsultaInventario = new InicioTramiteConsultaInventarioState(this);
		
		state = inicioTramiteConsultaInventario;
	}

	public TramiteConsultaInventario(Documento doc) {
		super(doc);
		consultaInventarioState = new ConsultarInventarioState(this);
		finalizarTramiteConsultaInventario = new FinalizarTramiteConsultaInventarioState(this);
		inicioTramiteConsultaInventario = new InicioTramiteConsultaInventarioState(this);
		
		state = inicioTramiteConsultaInventario;
	}
	
	public void iniciarTramite() {
		state.iniciarTramite();
	}

	public void consultarInventario() {
		state.consultarInventario();
	}

	public void finalizarTramite() {
		state.finalizarTramite();
	}

	public void estadoActual() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void encryptMessage() {
		// TODO Auto-generated method stub
	}

	@Override
	public void decryptMessage() {
		// TODO Auto-generated method stub
	}

	@Override
	public void save() {
		// TODO Auto-generated method stub

	}

}
