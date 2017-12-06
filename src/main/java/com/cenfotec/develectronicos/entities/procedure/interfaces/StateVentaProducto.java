package com.cenfotec.develectronicos.entities.procedure.interfaces;

import com.cenfotec.develectronicos.controllers.OrdenController;

public interface StateVentaProducto {
public OrdenController controller = new OrdenController();
	
	public void iniciarTramite();
	public void consultarInventario();
	public void generarOrdenFacturacion();
	public void finalizarTramite();
	public void getEstadoActual();
	public void save();
	public void ejecutarPasoActual();
}
