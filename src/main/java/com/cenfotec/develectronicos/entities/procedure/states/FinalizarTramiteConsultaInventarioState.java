package com.cenfotec.develectronicos.entities.procedure.states;

import com.cenfotec.develectronicos.entities.Documento;
import com.cenfotec.develectronicos.entities.procedure.TramiteConsultaInventario;
import com.cenfotec.develectronicos.entities.procedure.interfaces.StateConsultaInventario;

public class FinalizarTramiteConsultaInventarioState implements StateConsultaInventario {

	private TramiteConsultaInventario tramiteInventario;
	
	public FinalizarTramiteConsultaInventarioState(TramiteConsultaInventario aThis) {
		this.tramiteInventario = aThis;
	}
	
	@Override
	public boolean iniciarTramite() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean consultarInventario(Documento doc) {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean finalizarTramite() {
		// TODO Auto-generated method stub
		return true;
	}
	
	@Override
	public String estadoActual() {
		// TODO Auto-generated method stub
		return "";
	}

	@Override
	public void siguientePaso() {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void save() {
		// TODO Auto-generated method stub
		
	}

}
