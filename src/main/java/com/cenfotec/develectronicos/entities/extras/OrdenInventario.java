package com.cenfotec.develectronicos.entities.extras;

import com.cenfotec.develectronicos.entities.Documento;

public class OrdenInventario extends DecoradorDocumento {

	private Documento doc;
	private boolean stockStatus;
	
	public OrdenInventario(Documento doc, boolean stockStatus) {
		this.doc = doc;
		this.stockStatus = stockStatus;
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
		mensaje= super.toString() + "\n"+
				"Estado inventario" + estado;		
		return mensaje;
	} 
}
