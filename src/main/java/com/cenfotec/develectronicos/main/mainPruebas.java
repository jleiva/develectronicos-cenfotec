package com.cenfotec.develectronicos.main;

import com.cenfotec.develectronicos.entities.Documento;
import com.cenfotec.develectronicos.entities.Orden;
import com.cenfotec.develectronicos.entities.extras.OrdenInventario;
import com.cenfotec.develectronicos.entities.procedure.TramiteConsultaInventario;

public class mainPruebas {

	public static void main(String[] args) {
		
		Orden orden = new Orden();
		Documento doc = new OrdenInventario(orden, false);
				
		TramiteConsultaInventario tramite = new TramiteConsultaInventario(doc);
		tramite.getEstadoActual();
		tramite.ejecutarPasoActual();
		
		tramite.getEstadoActual();
		tramite.ejecutarPasoActual();
		
		tramite.getEstadoActual();
		tramite.ejecutarPasoActual();
	}

}
