package com.cenfotec.develectronicos.entities;

import com.cenfotec.develectronicos.entities.extras.OrdenCompra;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Documento doc= new Orden();
		
		System.out.println(doc.toString());
		
		Documento doc2= new OrdenCompra();
		
		System.out.println(doc2.toString());

	}

}
