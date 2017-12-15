package com.cenfotec.develectronicos.entities.procedure.states;

import com.cenfotec.develectronicos.entities.Orden;
import com.cenfotec.develectronicos.entities.extras.OrdenCompra;
import com.cenfotec.develectronicos.entities.extras.OrdenFacturacion;
import com.cenfotec.develectronicos.entities.extras.OrdenInventario;
import com.cenfotec.develectronicos.entities.procedure.TramiteVentaProducto;
import com.cenfotec.develectronicos.entities.procedure.interfaces.StateVentaProducto;
import com.cenfotec.develectronicos.utils.enums.TipoOrden;

public class GenerarFacturacionVentaProductoState implements StateVentaProducto {
	
	private TramiteVentaProducto tramite;
	
	public GenerarFacturacionVentaProductoState(TramiteVentaProducto aThis) {
		this.tramite = aThis;
	}
	
	@Override
	public void iniciarTramite() {
		System.out.println("El tramite ya se inicia anteriormente, actualmente esta creando la facturacion...");
	}

	@Override
	public void consultarInventario() {
		System.out.println("El tramite ya consulto el inventario, actualmente esta creando la facturacion ...");
	}

	@Override
	public void generarOrdenFacturacion() {
		
		System.out.println("Generando Factura.....");
		
		OrdenCompra compra = (OrdenCompra) (this.tramite.getDoc());
		OrdenFacturacion ordenFacturacion = new OrdenFacturacion(new Orden());
//		OrdenFacturacion ordenFacturacion;
		if(compra.getIdOrdenFacturacion() == "-1") {
//			
			ordenFacturacion = new OrdenFacturacion(new Orden());
			
			controller.crearOrden(TipoOrden.OrdenFacturacion, ordenFacturacion);
			
			compra.setIdOrdenConsulta(ordenFacturacion.getIdDoc());
			System.out.println("Se ha generado la orden de facturacion, en espera de respuesta.....");
		}else {
//			OrdenFacturacion ordenFacturacion = controller.getOrden(compra.getIdOrdenFacturacion());
			if(ordenFacturacion.getDoc().getPasoActual() == 3) {
				compra.getDoc().setPasoActual(4);
				this.tramite.setState(this.tramite.getFinalizarVentaProducto());
			}else {
				System.out.println("Aun se esta realizando la facturacion espere por favor.....");
			};
		};
		
		this.tramite.setDoc(compra);
		controller.actualizarOrden(this.tramite.getDoc());
	}

	@Override
	public void finalizarTramite() {
		System.out.println("En espera de la orden facturacion...");
	}

	@Override
	public void getEstadoActual() {
		System.out.println("Paso: Facturacion");
	}

	@Override
	public void save() {
		
	}

	@Override
	public void ejecutarPasoActual() {
		generarOrdenFacturacion();
	}

}
