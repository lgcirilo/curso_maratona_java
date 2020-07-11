package com.lgcirilo.javacore.colecoes.classes;

public class Cellphone {
    private String nome;
    private String IMEI;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Cellphone cellphone = (Cellphone) o;

        return IMEI.equals(cellphone.IMEI);
    }

    @Override
    public int hashCode() {
        return IMEI.hashCode();
    }

    /**
     * Equals method properties
     * ------------------------
     * Reflexiveness - x.equals(x) must be true if x != null
     * Symmetry - for x != null and y != null, if x.equals(y) == true then y.equals(x) == true
     * Transitiveness - for x !== null, y != null and z != null, if x.equals(y) == true and y.equals(z) == true then x.equals(z) == true
     * Consistency - if x.equals(y) == true it must always return true for the same x and y
     */


    public Cellphone(String nome, String IMEI) {
        this.nome = nome;
        this.IMEI = IMEI;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIMEI() {
        return IMEI;
    }

    public void setIMEI(String IMEI) {
        this.IMEI = IMEI;
    }
}
