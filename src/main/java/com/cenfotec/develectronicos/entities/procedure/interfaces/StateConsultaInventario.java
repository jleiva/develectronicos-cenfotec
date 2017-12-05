package com.cenfotec.develectronicos.entities.procedure.interfaces;

import com.cenfotec.develectronicos.controllers.OrdenController;

public interface StateConsultaInventario {

	public OrdenController controller = new OrdenController();
	
	public void iniciarTramite();
	public void consultarInventario();
	public void finalizarTramite();
	public void getEstadoActual();
	public void save();
	public void ejecutarPasoActual();
}
