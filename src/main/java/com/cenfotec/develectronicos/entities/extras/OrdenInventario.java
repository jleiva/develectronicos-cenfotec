package com.cenfotec.develectronicos.entities.extras;

import com.cenfotec.develectronicos.entities.Orden;

public class OrdenInventario extends DecoradorDocumento {

	private Orden doc;
	private boolean stockStatus;
	
	public OrdenInventario(Orden doc) {
		this.doc = doc;
		this.doc.actualizarIdOrden("OI");
		this.stockStatus = false;
		
	}
	
	public OrdenInventario(Orden doc, boolean stockStatus) {
		this.doc = doc;
		this.doc.actualizarIdOrden("OI");
		this.stockStatus = stockStatus;
	}	
	
	public boolean isStockStatus() {
		return stockStatus;
	}
	
	public void setStockStatus(boolean stockStatus) {
		this.stockStatus = stockStatus;
	}
	
	public Orden getDoc() {
		return doc;
	} 
	
	@Override
	public String toString() {
		String mensaje;
		String estado;
		if(this.stockStatus) {
			estado="Disponible";
		}else {
			estado="Agotado";
		}
		mensaje= doc.toString() + "\n"+
				"Estado inventario " + estado;		
		return mensaje;
	}
	
}
