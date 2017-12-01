package com.cenfotec.develectronicos.entities;

public class ContadorDoc {
	
	private int cont;
	
	public ContadorDoc() {
		this.cont=1;
	}
	
	public void aumentarCont(){
		setCont(this.cont+1);
	}

	public int getCont() {
		return cont;
	}

	private void setCont(int cont) {
		this.cont = cont;
	}

}
