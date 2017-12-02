package com.cenfotec.develectronicos.entities.extras;

import com.cenfotec.develectronicos.entities.Orden;

public class OrdenInventario extends DecoradorDocumento {

	private Orden doc;
	private boolean stockStatus;
	
	public OrdenInventario(Orden doc, boolean stockStatus) {
		this.doc = doc;
		this.stockStatus = stockStatus;
	}	
	
	public boolean isStockStatus() {
		return stockStatus;
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
				"Estado inventario" + estado;		
		return mensaje;
	}

	public void setStockStatus(boolean stockStatus) {
		this.stockStatus = stockStatus;
	}
	
	public Orden getDoc() {
		return doc;
	} 
	
	
}
