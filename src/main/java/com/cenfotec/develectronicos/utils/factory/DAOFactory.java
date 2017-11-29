package com.cenfotec.develectronicos.utils.factory;

import com.cenfotec.develectronicos.data.DocumentoDAO;
import com.cenfotec.develectronicos.data.JsonDocumentoDAO;
import com.cenfotec.develectronicos.data.MongoDocumentoDAO;
import com.cenfotec.develectronicos.utils.enums.DAOType;

public abstract class DAOFactory {
	public static DocumentoDAO crearDAO(DAOType type) {
		switch(type) {
			case JSON_FILE:
				return new JsonDocumentoDAO();
			case MONGO:
				return new MongoDocumentoDAO();
			default: return null;
		}
	}
}
