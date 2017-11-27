package com.cenfotec.develectronicos.entities.extras;

import com.cenfotec.develectronicos.entities.Documento;

public class OrdenInventario extends DecoradorDocumento {

	private Documento doc;
	private String stockStatus;
	
	public String getStockStatus() {
		return stockStatus;
	}
	public void setStockStatus(String stockStatus) {
		this.stockStatus = stockStatus;
	}
	public Documento getDoc() {
		return doc;
	}
	public void setDoc(Documento doc) {
		this.doc = doc;
	} 
}
