package com.cenfotec.develectronicos.controllers;

import java.util.ArrayList;
import java.util.List;

import com.cenfotec.develectronicos.data.DocumentoDAO;
import com.cenfotec.develectronicos.entities.Documento;
import com.cenfotec.develectronicos.entities.Orden;
import com.cenfotec.develectronicos.entities.extras.OrdenCompra;
import com.cenfotec.develectronicos.entities.extras.OrdenEntrega;
import com.cenfotec.develectronicos.entities.extras.OrdenFacturacion;
import com.cenfotec.develectronicos.entities.extras.OrdenInventario;
import com.cenfotec.develectronicos.utils.EncryptManager;
import com.cenfotec.develectronicos.utils.SerializeDocument;
import com.cenfotec.develectronicos.utils.enums.DAOType;
import com.cenfotec.develectronicos.utils.enums.TipoOrden;
import com.cenfotec.develectronicos.utils.factory.DAOFactory;
import com.cenfotec.develectronicos.utils.factory.OrdenFactory;

public class OrdenController {
	DocumentoDAO dao = DAOFactory.crearDAO(DAOType.JSON_FILE);
	private static EncryptManager encryptManager = new EncryptManager();
	
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
		
	public Documento crearOrden(TipoOrden tipo, String idDep, String tipoTramite, String responsable, String idProd) {
	
		OrdenFactory ordFactory = new OrdenFactory();
		Orden ord = new Orden(idDep,tipoTramite,responsable,idProd);
		Documento newOrd = ordFactory.crearOrden(tipo,ord);
		guardarOrden(newOrd);
		return newOrd;
		
	}
	
	public Documento crearOrden(TipoOrden tipo, Documento ord) {
	
		OrdenFactory ordFactory = new OrdenFactory();
		Documento newOrd = ordFactory.crearOrden(tipo,(Orden)ord);
		guardarOrden(newOrd);
		return newOrd;
		
	}

	private void guardarOrden(Documento ord) {
		String idDoc = ord.getIdDoc();
		String idDept = ord.getIdDep();
		String jsonDoc = SerializeDocument.toJSON(ord);
		
		try {
			byte[] encryptedData = encryptManager.encryptMessage(jsonDoc, idDept+"-");
			dao.insert(idDoc, encryptedData);
		} catch (Exception e) {
			e.printStackTrace();
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
