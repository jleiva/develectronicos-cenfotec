package com.cenfotec.develectronicos.utils;

import com.google.gson.Gson;
import com.cenfotec.develectronicos.entities.Documento;

public class SerializeDocument {
	private static Gson gson = new Gson();
	
	public static String toJSON(Documento documento) {
		return gson.toJson(documento);
	}
	
	public static Documento fromJSON(String jsonString) {
		return gson.fromJson(jsonString, Documento.class);
	}
}
