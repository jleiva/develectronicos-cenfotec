package com.cenfotec.develectronicos.controllers;

import java.util.ArrayList;
import java.util.List;

import com.cenfotec.develectronicos.entities.Tramite;

public class TramiteController {
	private ArrayList <Tramite> tramitesConsultaInventario;
	private ArrayList <Tramite> tramitesEntregaProducto;
	private ArrayList <Tramite> tramitesFacturacion;
	private ArrayList <Tramite> tramitesVentaProducto;
	
	public TramiteController() {
        this.tramitesConsultaInventario = new ArrayList<Tramite>();
        this.tramitesEntregaProducto = new ArrayList<Tramite>();
        this.tramitesFacturacion = new ArrayList<Tramite>();
        this.tramitesVentaProducto = new ArrayList<Tramite>();
    }
	
	public void crearTramite(String tipoTramite) {
		
	}
	
	public List<Tramite> listarTramitesConsultaInventario(){
        return this.tramitesConsultaInventario;
    }
	
	public List<Tramite> listarTramitesEntregaProducto(){
        return this.tramitesEntregaProducto;
    }
	
	public List<Tramite> listarTramitesFacturacion(){
        return this.tramitesFacturacion;
    }
	
	public List<Tramite> listarVentaProducto(){
        return this.tramitesVentaProducto;
    }
}
