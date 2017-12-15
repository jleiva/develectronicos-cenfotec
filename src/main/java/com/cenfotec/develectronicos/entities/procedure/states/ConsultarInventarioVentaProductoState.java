package com.cenfotec.develectronicos.entities.procedure.states;

import com.cenfotec.develectronicos.entities.Orden;
import com.cenfotec.develectronicos.entities.extras.OrdenCompra;
import com.cenfotec.develectronicos.entities.extras.OrdenInventario;
import com.cenfotec.develectronicos.entities.procedure.TramiteVentaProducto;
import com.cenfotec.develectronicos.entities.procedure.interfaces.StateVentaProducto;
import com.cenfotec.develectronicos.utils.enums.TipoOrden;

public class ConsultarInventarioVentaProductoState implements StateVentaProducto {

	private TramiteVentaProducto tramite;
	
	public ConsultarInventarioVentaProductoState(TramiteVentaProducto aThis) {
		this.tramite = aThis;
	}
		
	@Override
	public void iniciarTramite() {
		System.out.println("El tramite ya se inicia anteriormente, actualmente se esta consultando el inventario...");
	}

	@Override
	public void consultarInventario() {
		
		System.out.println("Consultando inventario.....");
		
		OrdenCompra compra = (OrdenCompra) (this.tramite.getDoc());
		OrdenInventario ordenInventario = new OrdenInventario(new Orden(), false);
//		OrdenInventario ordenInventario;
		if(compra.getIdOrdenConsulta() == "-1") {
			ordenInventario = new OrdenInventario(new Orden(), false);
			
			controller.crearOrden(TipoOrden.OrdenInventario, ordenInventario);
			
			compra.setIdOrdenConsulta(ordenInventario.getIdDoc());
			System.out.println("Se ha generado la orden de consulta de inventario, en espera de respuesta.....");
		}else {
//			OrdenInventario ordenInventario = controller.getOrden(compra.getIdOrdenConsulta());
			if(ordenInventario.isStockStatus() == false) {
				System.out.println("Lastimosamente no hay productos de este tipo.....");
				this.tramite.setState(this.tramite.getFinalizarVentaProducto());
			}else {
				if(ordenInventario.getDoc().getPasoActual() == 3) {
					compra.getDoc().setPasoActual(3);
					this.tramite.setState(this.tramite.getGenerarFactura());
				}else {
					System.out.println("Aun se esta realizando la consulta del inventario espere por favor.....");
				};
			};
		};
		
		this.tramite.setDoc(compra);
		controller.actualizarOrden(this.tramite.getDoc());
	}

	@Override
	public void generarOrdenFacturacion() {
		System.out.println("En espera de la orden consultar inventario...");
	}

	@Override
	public void finalizarTramite() {
		System.out.println("En espera de la orden consultar inventario...");

	}

	@Override
	public void getEstadoActual() {
		System.out.println("Paso: Consulta de inventario");
	}

	@Override
	public void save() {
		
	}

	@Override
	public void ejecutarPasoActual() {
		consultarInventario();
	}

}
