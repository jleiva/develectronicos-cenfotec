package com.cenfotec.develectronicos.entities.extras;

import com.cenfotec.develectronicos.entities.Documento;

public class OrdenInventario extends DecoradorDocumento {

	private Documento doc;
	private boolean stockStatus;
	
	public OrdenInventario(Documento doc, boolean stockStatus) {
		this.doc = doc;
		this.stockStatus = stockStatus;
	}
	
	public boolean getStockStatus() {
		return stockStatus;
	}
	
	public void setStockStatus(boolean stockStatus) {
		this.stockStatus = stockStatus;
	}
	
	public Documento getDoc() {
		return doc;
	}
	
	public void setDoc(Documento doc) {
		this.doc = doc;
	}
	
	@Override
	public String toString() {
		String mensaje;
		String estado;
		if(this.getStockStatus()) {
			estado="Disponible";
		}else {
			estado="Agotado";
		}
		mensaje= super.toString() + "\n"+
				"Estado inventario" + estado;		
		return mensaje;
	} 
}
