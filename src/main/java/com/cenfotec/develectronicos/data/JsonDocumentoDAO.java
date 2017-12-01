package com.cenfotec.develectronicos.data;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Base64;
import java.util.Base64.Decoder;
import java.util.List;

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

	@Override
	public List<String> findAll(String tipoDocumento) {
		List<String> results = new ArrayList<String>();
		File[] files = new File(PATH + tipoDocumento).listFiles();
		String fileName;
		int lastPeriodPos;
		
		for (File file : files) {
			if (file.isFile() && file.getName().endsWith((".json"))) {
                fileName = file.getName();
                lastPeriodPos = fileName.lastIndexOf('.');
                		
                if (lastPeriodPos > 0) {
                		fileName = fileName.substring(0, lastPeriodPos);
                		results.add(fileName);
                	}
            }
		}
		
		return results;
	}

}
