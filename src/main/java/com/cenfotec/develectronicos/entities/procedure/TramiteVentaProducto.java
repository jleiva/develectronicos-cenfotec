package com.cenfotec.develectronicos.entities.procedure;

import com.cenfotec.develectronicos.entities.Orden;
import com.cenfotec.develectronicos.entities.Tramite;
import com.cenfotec.develectronicos.entities.extras.OrdenCompra;
import com.cenfotec.develectronicos.entities.procedure.interfaces.StateVentaProducto;
import com.cenfotec.develectronicos.entities.procedure.states.ConsultarInventarioVentaProductoState;
import com.cenfotec.develectronicos.entities.procedure.states.FinalizarVentaProductoState;
import com.cenfotec.develectronicos.entities.procedure.states.GenerarFacturacionVentaProductoState;
import com.cenfotec.develectronicos.entities.procedure.states.IniciarVentaProducto;

public class TramiteVentaProducto extends Tramite {
	IniciarVentaProducto iniciarVentaProducto;
	ConsultarInventarioVentaProductoState consultarInventario;
	GenerarFacturacionVentaProductoState generarFactura;
	FinalizarVentaProductoState finalizarVentaProducto;
	
	StateVentaProducto state;

	public TramiteVentaProducto(Orden doc) {
		super(doc);
		iniciarVentaProducto = new IniciarVentaProducto(this);
		consultarInventario = new ConsultarInventarioVentaProductoState(this);
		generarFactura = new GenerarFacturacionVentaProductoState(this);
		finalizarVentaProducto = new FinalizarVentaProductoState(this);
		
		setPasoActual();
	}

	@Override
	protected void setPasoActual() {
		int pasoActual = ((OrdenCompra) this.documento).getDoc().getPasoActual();
		switch(pasoActual) {
		case 1:
			state = iniciarVentaProducto;
			break;
		case 2:
			state = consultarInventario;
			break;
		case 3:
			state = generarFactura;
			break;
		case 4:
			state = finalizarVentaProducto;
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

	public IniciarVentaProducto getIniciarVentaProducto() {
		return iniciarVentaProducto;
	}

	public void setIniciarVentaProducto(IniciarVentaProducto iniciarVentaProducto) {
		this.iniciarVentaProducto = iniciarVentaProducto;
	}

	public ConsultarInventarioVentaProductoState getConsultarInventario() {
		return consultarInventario;
	}

	public void setConsultarInventario(ConsultarInventarioVentaProductoState consultarInventario) {
		this.consultarInventario = consultarInventario;
	}

	public GenerarFacturacionVentaProductoState getGenerarFactura() {
		return generarFactura;
	}

	public void setGenerarFactura(GenerarFacturacionVentaProductoState generarFactura) {
		this.generarFactura = generarFactura;
	}

	public FinalizarVentaProductoState getFinalizarVentaProducto() {
		return finalizarVentaProducto;
	}

	public void setFinalizarVentaProducto(FinalizarVentaProductoState finalizarVentaProducto) {
		this.finalizarVentaProducto = finalizarVentaProducto;
	}

	public StateVentaProducto getState() {
		return state;
	}

	public void setState(StateVentaProducto state) {
		this.state = state;
	}
	
	

}
