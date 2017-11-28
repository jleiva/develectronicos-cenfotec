package com.cenfotec.develectronicos.data;

import com.cenfotec.develectronicos.entities.Documento;

public abstract class DocumentoDAO {
	public abstract Documento find(String documentoId);
	public abstract boolean insert(Documento document);
	public abstract boolean update(Documento document);
	public abstract boolean delete(String documentoId);
}
