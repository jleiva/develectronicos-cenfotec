package com.cenfotec.develectronicos.entities.procedure.states;

import com.cenfotec.develectronicos.entities.Documento;
import com.cenfotec.develectronicos.entities.procedure.TramiteConsultaInventario;
import com.cenfotec.develectronicos.entities.procedure.interfaces.StateConsultaInventario;

public class InicioTramiteConsultaInventarioState implements StateConsultaInventario {
	
	private TramiteConsultaInventario tramiteInventario;

	public InicioTramiteConsultaInventarioState(TramiteConsultaInventario aThis) {
		this.tramiteInventario = aThis;
	}
	
	@Override
	public boolean iniciarTramite() {
		// Aca tiene que ejecutar el proceso del tramite y pasarlo al siguiente estado
		return true;
	}

	@Override
	public boolean consultarInventario(Documento doc) {
		System.out.println("El tramite esta en proceso de iniciar...");
		return true;
	}

	@Override
	public boolean finalizarTramite() {
		System.out.println("Aun falta pasos para que el tramite termine");
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
