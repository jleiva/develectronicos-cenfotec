package com.cenfotec.develectronicos.entities.procedure;

import com.cenfotec.develectronicos.entities.Orden;
import com.cenfotec.develectronicos.entities.Tramite;
import com.cenfotec.develectronicos.entities.extras.OrdenCompra;
import com.cenfotec.develectronicos.entities.procedure.interfaces.StateVentaProducto;
import com.cenfotec.develectronicos.entities.procedure.states.ConsultarInventarioVentaProducto;
import com.cenfotec.develectronicos.entities.procedure.states.FinalizarVentaProducto;
import com.cenfotec.develectronicos.entities.procedure.states.GenerarFacturacionVentaProducto;
import com.cenfotec.develectronicos.entities.procedure.states.IniciarVentaProducto;

public class TramiteVentaProducto extends Tramite {
	IniciarVentaProducto iniciarVentaProducto;
	ConsultarInventarioVentaProducto consultarInventario;
	GenerarFacturacionVentaProducto generarFactura;
	FinalizarVentaProducto finalizarVentaProducto;
	
	StateVentaProducto state;
	public TramiteVentaProducto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public TramiteVentaProducto(Orden doc) {
		super(doc);
		// TODO Auto-generated constructor stub
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

	public ConsultarInventarioVentaProducto getConsultarInventario() {
		return consultarInventario;
	}

	public void setConsultarInventario(ConsultarInventarioVentaProducto consultarInventario) {
		this.consultarInventario = consultarInventario;
	}

	public GenerarFacturacionVentaProducto getGenerarFactura() {
		return generarFactura;
	}

	public void setGenerarFactura(GenerarFacturacionVentaProducto generarFactura) {
		this.generarFactura = generarFactura;
	}

	public FinalizarVentaProducto getFinalizarVentaProducto() {
		return finalizarVentaProducto;
	}

	public void setFinalizarVentaProducto(FinalizarVentaProducto finalizarVentaProducto) {
		this.finalizarVentaProducto = finalizarVentaProducto;
	}

	public StateVentaProducto getState() {
		return state;
	}

	public void setState(StateVentaProducto state) {
		this.state = state;
	}
	
	

}
