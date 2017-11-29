package com.cenfotec.develectronicos.utils;

import com.google.gson.Gson;
import com.cenfotec.develectronicos.entities.Documento;

public class SerializeDocument {
	private static Gson gson = new Gson();
	
	public static String toJSON(Documento doc) {
		return gson.toJson(doc);
	}
	
	public static Documento fromJSON(String jsonFile) {
		return gson.fromJson(jsonFile, Documento.class);
	}
}
