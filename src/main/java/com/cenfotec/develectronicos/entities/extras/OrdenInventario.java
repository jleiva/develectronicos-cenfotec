package com.cenfotec.develectronicos.entities.extras;

import com.cenfotec.develectronicos.entities.Orden;

public class OrdenInventario extends DecoradorDocumento {

	private Orden doc;
	private boolean stockStatus;
	
	public OrdenInventario() {
		this.doc = new Orden("OI-","Inventario","Responsable", "Idproducto");
	}
	
	public OrdenInventario(Orden doc, boolean stockStatus) {
		this.doc = doc;
		this.stockStatus = stockStatus;
	}	
	
<<<<<<< HEAD
=======
	public boolean isStockStatus() {
		return stockStatus;
	}

	@Override
>>>>>>> 19a26b29cad9d2bb480e9847ee0640bd1b92f69b
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
