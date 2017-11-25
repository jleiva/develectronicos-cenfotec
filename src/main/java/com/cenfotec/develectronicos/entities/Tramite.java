package com.cenfotec.develectronicos.entities;

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
	
	// OrdenVenta
	// 1 iniciarTramiteVentaProducto(prodId) { new Documento() }
	// 2 encriptarMens(mens, idDeF)
	// 3 save - send
	// 3 consultarInventario(prodId)
	// 4
	// 5 
	
	
	////////////////
	// Manager 
	// pubK = getKeysPub(Daniel)
	// encryp(pubK, mes)
	// pubK = getKeysPub(Daniel)
	// descryp(pubK, mes)
	
	
	//////////
	// Listado Invent
	// 1 desencri(idDept)
}
