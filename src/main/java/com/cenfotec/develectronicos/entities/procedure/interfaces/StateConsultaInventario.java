package com.cenfotec.develectronicos.entities.procedure.interfaces;

import com.cenfotec.develectronicos.entities.Documento;

public interface StateConsultaInventario {

	public boolean iniciarTramite();
	public boolean consultarInventario(Documento doc);
	public boolean finalizarTramite();
	public String estadoActual();
	public void siguientePaso();
	public void save();
}
