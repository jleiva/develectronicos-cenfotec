package com.cenfotec.develectronicos.entities.extras;

import com.cenfotec.develectronicos.entities.Archivo;
import com.cenfotec.develectronicos.entities.Documento;

public abstract class DecoradorDocumento extends Archivo {

	private Documento doc;

	public Documento getDoc() {
		return doc;
	}

	public void setDoc(Documento doc) {
		this.doc = doc;
	}
	
	@Override
	public String toString() {
		String mensaje;
		
		mensaje="Id del documento:" + this.doc.getIdDoc() + "\n"+
		        "Tipo del tramite:" + this.doc.getTipoTramite() + "\n"+
		        "Responsable:" + this.doc.getResponsable()+ "\n"+
		        "Id del producto:" + this.doc.getProductoId();
		return mensaje;
	}
}
