package com.cenfotec.develectronicos.data;

import java.util.List;

public interface DocumentoDAO {
	public abstract byte[] find(String documentoId);
	public abstract boolean insert(String id, byte[] encryptedData);
	public abstract boolean update(String document);
	public abstract boolean delete(String documentoId);
	public abstract List<String> findAll(String Tipodocumento);
}
