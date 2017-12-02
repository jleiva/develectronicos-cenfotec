package com.cenfotec.develectronicos.controllers;

import java.util.ArrayList;
import java.util.List;

import com.cenfotec.develectronicos.entities.Documento;
import com.cenfotec.develectronicos.entities.Orden;

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
	
	public void crearOrden(Documento doc) {
		
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
	
	public boolean procesarConsultarInventario(String productoId) {
		return true;
	}
	
	public void procesarAprobarCompra() {
		
	}
	
	public void procesarProcesarPago() {
		
	}
	
	public void procesarEntregarProducto() {
		
	}

	public void actualizarOrden(Documento doc) {
		// TODO Auto-generated method stub
		
	}


}
