package com.cenfotec.develectronicos.entities.procedure.interfaces;

public interface StateConsultaInventario {

	public void iniciarTramite();
	public void consultarInventario();
	public void finalizarTramite();
	public void getEstadoActual();
	public void save();
	public void ejecutarPasoActual();
}
