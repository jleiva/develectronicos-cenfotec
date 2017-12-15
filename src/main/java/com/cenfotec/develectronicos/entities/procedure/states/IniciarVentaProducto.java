package com.cenfotec.develectronicos.entities.procedure.states;

import com.cenfotec.develectronicos.entities.extras.OrdenCompra;
import com.cenfotec.develectronicos.entities.procedure.TramiteVentaProducto;
import com.cenfotec.develectronicos.entities.procedure.interfaces.StateVentaProducto;
import com.cenfotec.develectronicos.utils.enums.TipoOrden;

public class IniciarVentaProducto implements StateVentaProducto {

	private TramiteVentaProducto tramite;
	
	public IniciarVentaProducto(TramiteVentaProducto aThis) {
		this.tramite = aThis;
	}
	
	@Override
	public void iniciarTramite() {
		OrdenCompra inventario = (OrdenCompra) (this.tramite.getDoc());
		
		inventario.getDoc().setPasoActual(2);
		this.tramite.setDoc(inventario);
		
		controller.crearOrden(TipoOrden.OrdenInventario, tramite.getDoc());
		this.tramite.setState(this.tramite.getConsultarInventario());
	}

	@Override
	public void consultarInventario() {
		System.out.println("El tramite esta en proceso de iniciar...");
	}

	@Override
	public void generarOrdenFacturacion() {
		System.out.println("El tramite esta en proceso de iniciar...");
	}

	@Override
	public void finalizarTramite() {
		System.out.println("Aun falta pasos para que el tramite termine");
	}

	@Override
	public void getEstadoActual() {
		System.out.println("Paso: Iniciando tramite...");
	}

	@Override
	public void save() {
		// TODO Auto-generated method stub

	}

	@Override
	public void ejecutarPasoActual() {
		iniciarTramite();
	}

}
