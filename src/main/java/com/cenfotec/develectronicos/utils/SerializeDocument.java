package com.cenfotec.develectronicos.utils;

import java.io.FileReader;
import com.google.gson.Gson;
import com.cenfotec.develectronicos.entities.Documento;

public class SerializeDocument {
	private static Gson gson = new Gson();
	
	public static String toJSON(Documento doc) {
		return gson.toJson(doc);
	}
	
	public static Documento fromJSON(FileReader jsonFile) {
		return gson.fromJson(jsonFile, Documento.class);
	}
}
