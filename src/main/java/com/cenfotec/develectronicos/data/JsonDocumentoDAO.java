package com.cenfotec.develectronicos.data;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Base64;
import java.util.Base64.Decoder;

public class JsonDocumentoDAO implements DocumentoDAO {
	private final String FILE_EXTENSION = ".json";
	private final String PATH = "/Users/jdleiva/develectronicos/tramites/";
	
	private void writeBytesFile(String name, byte[] content) throws FileNotFoundException, IOException {
		FileOutputStream fos = new FileOutputStream(PATH + name + FILE_EXTENSION);
		fos.write(content);
		fos.close();
	}
	
	private byte[] readBytesFile(String messageName) throws Exception{
		File file = new File(PATH + messageName + FILE_EXTENSION);
		int length = (int) file.length();
		BufferedInputStream reader = new BufferedInputStream(new FileInputStream(file));
		byte[] bytes = new byte[length];
		reader.read(bytes, 0, length);
		reader.close();
		Decoder oneDecoder = Base64.getDecoder();
		return oneDecoder.decode(bytes);
	}

	@Override
	public byte[] find(String documentoId) {
		try {
			return readBytesFile(documentoId);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	@Override	
	public boolean insert(String fileName, byte[] encryptedData) {
		try {
			writeBytesFile(fileName, encryptedData);
			return true;
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			return false;
		} catch (IOException e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean update(String document) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(String documentoId) {
		File file = new File(PATH + documentoId + FILE_EXTENSION);
		return file.delete();
	}


}
