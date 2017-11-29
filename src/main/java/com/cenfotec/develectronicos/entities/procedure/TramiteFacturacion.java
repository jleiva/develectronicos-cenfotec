package com.cenfotec.develectronicos.entities.procedure;

import com.cenfotec.develectronicos.entities.Documento;
import com.cenfotec.develectronicos.entities.Tramite;

public class TramiteFacturacion extends Tramite {
	
	public TramiteFacturacion() {
		super();
		// TODO Auto-generated constructor stub
	}

	public TramiteFacturacion(Documento doc) {
		super(doc);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	protected void setPasoActual() {
//		switch(doc.pasoActual) {
//		case 1:
//			state = inicioTramiteConsultaInventario;
//			break;
//		case 2:
//			state = consultaInventarioState;
//			break;
//		case 3:
//			state = finalizarTramiteConsultaInventario;
//			break;
//		}
	}

	@Override
	public void encryptMessage() {
		// TODO Auto-generated method stub

	}

	@Override
	public void decryptMessage() {
		// TODO Auto-generated method stub

	}

	@Override
	public void save() {
		// TODO Auto-generated method stub

	}

	@Override
	public void iniciar() {
		// TODO Auto-generated method stub
		
	}

}
