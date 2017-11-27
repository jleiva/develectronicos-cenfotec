package com.cenfotec.develectronicos.entities.tramite;

import com.cenfotec.develectronicos.entities.Departamento;
import com.cenfotec.develectronicos.entities.Documento;

// Recomendacion usar herencia
// Tipos de Tramite:
// VentaProducto
// ConsultaInventario
// EntregaProducto
// Facturacion

// Incluir los pasos de cada tramite como metodos. 
// Recomendacion, usar patron estado

public abstract class Tramite {
	Departamento dept;
	Documento doc = null;
	
	public Tramite() {
		this.doc = new Documento();
	}
	
	public Tramite(Documento doc) {
		this.doc = doc;
	}
	
	public abstract void encryptMessage();
	
	public abstract void decryptMessage();
	
	public abstract void save();
	
}
