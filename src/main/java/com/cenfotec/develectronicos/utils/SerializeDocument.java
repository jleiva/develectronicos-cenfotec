package com.cenfotec.develectronicos.utils;

import com.google.gson.Gson;
import com.cenfotec.develectronicos.entities.Documento;
import com.cenfotec.develectronicos.entities.Orden;

public class SerializeDocument {
	private static Gson gson = new Gson();
	
	public static String toJSON(Documento documento) {
		return gson.toJson(documento);
	}
	
	public static Orden fromJSON(String jsonString) {
		return gson.fromJson(jsonString, Orden.class);
	}
}
