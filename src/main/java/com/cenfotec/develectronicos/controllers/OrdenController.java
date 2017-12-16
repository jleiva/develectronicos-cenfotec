package com.cenfotec.develectronicos.controllers;

import java.util.ArrayList;
import java.util.List;

import com.cenfotec.develectronicos.data.DocumentoDAO;
import com.cenfotec.develectronicos.entities.Documento;
import com.cenfotec.develectronicos.entities.Empleado;
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
	
	private ArrayList <String> ordenesCompra;
	private ArrayList <String> ordenesInventario;
	private ArrayList <String> ordenesFacturacion;
	private ArrayList <String> ordenesEntrega;
	private DepartamentoController departamento;
	
	
	public OrdenController() {
		this.ordenesCompra =  new ArrayList<>();
		this.ordenesInventario = new ArrayList<>();
		this.ordenesFacturacion = new ArrayList<>();
		this.ordenesEntrega = new ArrayList<>();
		this.departamento = new DepartamentoController();
		this.cargarOrdenes();
	}
	
	public List<String> listarOrdenesCompra(){
		return this.ordenesCompra;
		
	}
	
	public List<String> listarOrdenesInventario(){
		return this.ordenesInventario;
		
	}
	
	public List<String> listarOrdenesFacturacion(){
		return this.ordenesFacturacion;
		
	}
	
	public List<String> listarOrdenesEntrega(){
		return this.ordenesEntrega;
		
	}
		
	public Documento crearOrden(TipoOrden tipo, String idDep, String tipoTramite, String responsable, String idProd) {
	
		OrdenFactory ordFactory = new OrdenFactory();
		Orden ord = new Orden(idDep,tipoTramite,responsable,idProd);
		Documento newOrd = ordFactory.crearOrden(tipo,ord);
//		guardarOrden(newOrd);
		return newOrd;
	}
	

	public void crearOrden(TipoOrden tipo, Documento ord) {
		String idDoc = "-1";
		String idDept = "-1";
		String jsonDoc = "";
		
		switch (tipo){
			case OrdenCompra:
			
				OrdenCompra compra = (OrdenCompra) ord;
				idDoc = compra.getDoc().getIdDoc();
				idDept = compra.getDoc().getIdDep();
				
				jsonDoc = SerializeDocument.toJSON(compra);
				break;
				
			case OrdenEntrega:
			
				OrdenEntrega entrega = (OrdenEntrega) ord;
				idDoc = entrega.getDoc().getIdDoc();
				idDept = entrega.getDoc().getIdDep();
				
				jsonDoc = SerializeDocument.toJSON(entrega);
				break;
				
			case OrdenFacturacion:
			
				OrdenFacturacion facturacion = (OrdenFacturacion) ord;
				idDept = facturacion.getDoc().getIdDep();
				idDoc = facturacion.getDoc().getIdDoc();
				
				jsonDoc = SerializeDocument.toJSON(facturacion);
				break;
			
			case OrdenInventario:
			
				OrdenInventario inventario = (OrdenInventario) ord;
				idDept = inventario.getDoc().getIdDep();
				idDoc = inventario.getDoc().getIdDoc();
				
				jsonDoc = SerializeDocument.toJSON(inventario);
				break;
        }		
		
		guardarOrden(idDoc, idDept, jsonDoc);
	}
	
	private void guardarOrden(String idDoc, String idDept, String jsonDoc) {
		
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
		return null;
		
	}
	
	//cambiar por este... y borrar el dummy
	public Orden seleccionarOrden(List<String> Ordenes, String idDoc, boolean dummy) {
		
		for(int i = 0; i<Ordenes.size(); i++) {
			if(Ordenes.get(i) == idDoc) {
				return obtenerDocumento(Ordenes.get(i));
			}
		}
		//Orden no existe.
		return null;
	}
	
	public boolean procesarConsultarInventario(String productoId) {
		return true;
	}
	
	public boolean procesarConsultarInventario(OrdenInventario ord, Empleado emp) {
		
		return this.departamento.procesarOrden(ord, emp);	
		
	}
	
	public boolean procesarAprobarCompra(OrdenCompra ord, Empleado emp) {
		
		return this.departamento.procesarOrden(ord, emp);	
		
	}
	
	public boolean procesarProcesarPago(OrdenFacturacion ord, Empleado emp) {
		
		return this.departamento.procesarOrden(ord, emp);	
		
	}
	
	public boolean procesarEntregarProducto(OrdenEntrega ord, Empleado emp) {
		
		return this.departamento.procesarOrden(ord, emp);	
		
	}

	public void actualizarOrden(Documento ord) {

		guardarOrden(ord);

		
	}
	
	public void cargarOrdenes() {
		
		ordenesCompra = (ArrayList<String>) dao.findAll("venta");
		ordenesInventario = (ArrayList<String>) dao.findAll("inventario");
		ordenesFacturacion = (ArrayList<String>) dao.findAll("facturacion");
		ordenesEntrega = (ArrayList<String>) dao.findAll("entrega");
		
	}
	
	public Orden obtenerDocumento(String pIdDoc) {
		
		return null; 
    //	hasta desencripta la wea
		//valida empleado
		
	}
	
	boolean procesarOrden(Orden ord, Empleado emp) {
		
			return this.departamento.procesarOrden(ord, emp);	
		
	}

}
