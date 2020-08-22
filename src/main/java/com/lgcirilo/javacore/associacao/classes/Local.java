package com.lgcirilo.javacore.associacao.classes;


public class Local {
    private String rua;
    private String bairro;
	
	public Local() { }

	public Local(String rua, String bairro) {
        this.rua = rua;
		this.bairro = bairro;
	}

	@Override
	public String toString() {
        return "rua: " + this.rua + " bairro: " + this.bairro;
	}

	public void setRua(String rua) {
        this.rua = rua;
	}

	public String getRua() {
        return this.rua;
	}
	
	public void setBairro(String bairro) {
        this.bairro = bairro;
	}

	public String getBairro() {
        return this.bairro;
	}
}

