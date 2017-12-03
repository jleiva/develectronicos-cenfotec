package com.cenfotec.develectronicos.controllers;

import java.util.ArrayList;
import java.util.List;

import com.cenfotec.develectronicos.entities.Documento;
import com.cenfotec.develectronicos.entities.Orden;
import com.cenfotec.develectronicos.entities.extras.OrdenCompra;
import com.cenfotec.develectronicos.entities.extras.OrdenEntrega;
import com.cenfotec.develectronicos.entities.extras.OrdenFacturacion;
import com.cenfotec.develectronicos.entities.extras.OrdenInventario;

public class OrdenController {
	
	private ArrayList <Orden> ordenesCompra;
	private ArrayList <Orden> ordenesInventario;
	private ArrayList <Orden> ordenesFacturacion;
	private ArrayList <Orden> ordenesEntrega;
	
	
	public OrdenController() {
		this.ordenesCompra =  new ArrayList<>();
		this.ordenesInventario = new ArrayList<>();
		this.ordenesFacturacion = new ArrayList<>();
		this.ordenesEntrega = new ArrayList<>();
	}
	
	public List<Orden> listarOrdenesCompra(){
		return this.ordenesCompra;
		
	}
	
	public List<Orden> listarOrdenesInventario(){
		return this.ordenesInventario;
		
	}
	
	public List<Orden> listarOrdenesFacturacion(){
		return this.ordenesFacturacion;
		
	}
	
	public List<Orden> listarOrdenesEntrega(){
		return this.ordenesEntrega;
		
	}
		
	public Documento CrearOrden(int tipo, String idDep, String tipoTramite, String responsable, String idProd) {
	
		Orden ord = new Orden(idDep,tipoTramite,responsable,idProd);		
		Documento newOrd = crearTipoOrden(tipo,ord);
		guardarOrden();
		return newOrd;
		
	}
	
	private void guardarOrden() {
		// codigo necesario para guardar la orden
		
	}

	public Documento crearTipoOrden(int tipo, Orden ord) {
				
		switch (tipo){
			case 1:
				return new OrdenCompra(ord);
			case 2:
				return new OrdenEntrega(ord);
			case 3:
				return new OrdenFacturacion(ord);
			case 4:
				return new OrdenInventario(ord);
			default:
				return ord;
		}
	}
	
	public Orden seleccionarOrden(List<Orden> Ordenes, String idDoc) {
		
		for(int i = 0; i<Ordenes.size(); i++) {
			if(Ordenes.get(i).getIdDoc() == idDoc) {
				return Ordenes.get(i);
			}
		}
		//Orden no existe.
		return null;
		
	}
	
	public void procesarConsultarInventario() {
		
	}
	
	public void procesarAprobarCompra() {
		
	}
	
	public void procesarProcesarPago() {
		
	}
	
	public void procesarEntregarProducto() {
		
	}

}
