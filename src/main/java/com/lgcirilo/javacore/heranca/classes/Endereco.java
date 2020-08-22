package com.lgcirilo.javacore.heranca.classes;

public class Endereco {
    private String rua;
    private String bairro;

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

    @Override
    public String toString() {
        return "rua: " + this.rua + " bairro: " + this.bairro;
    }
}
