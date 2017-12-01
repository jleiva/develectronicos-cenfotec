package com.cenfotec.develectronicos.data;

public interface DocumentoDAO {
	public abstract byte[] find(String documentoId);
	public abstract boolean insert(String id, byte[] encryptedData);
	public abstract boolean update(String document);
	public abstract boolean delete(String documentoId);
}
