package com.cenfotec.develectronicos.main;

import java.util.Date;

import com.cenfotec.develectronicos.Enums.EnumEstado;
import com.cenfotec.develectronicos.entities.Documento;
import com.cenfotec.develectronicos.entities.procedure.TramiteConsultaInventario;

public class mainPruebas {

	public static void main(String[] args) {
		Documento doc = new Documento();
		doc.setEstado(EnumEstado.EnProceso);
		doc.setIdDoc("123123");
		doc.setProductId("vcvc");
		doc.setResponsable("dasda");
		doc.setStockStatus("No");
		doc.setTipoTramite("1");
		doc.setPasoActual(1);
		
		TramiteConsultaInventario tramite = new TramiteConsultaInventario(doc);
		tramite.ejecutarPasoActual();
		tramite.ejecutarPasoActual();
		tramite.ejecutarPasoActual();

	}

}
