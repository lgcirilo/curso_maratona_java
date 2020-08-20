package com.lgcirilo.javacore.collections.classes;

public class CellPhone implements Comparable<CellPhone> {
    private String nome;
    private String IMEI;

    /**
     * Equals method properties
     * ------------------------
     * Reflexiveness - x.equals(x) must be true if x != null
     * Symmetry - for x != null and y != null, if x.equals(y) == true then y.equals(x) == true
     * Transitiveness - for x !== null, y != null and z != null, if x.equals(y) == true and y.equals(z) == true then x.equals(z) == true
     * Consistency - if x.equals(y) == true it must always return true for the same x and y
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CellPhone cellphone = (CellPhone) o;

        return IMEI.equals(cellphone.IMEI);
    }

    @Override
    public int hashCode() {
        return IMEI.hashCode();
    }



    public CellPhone(String nome, String IMEI) {
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

    @Override
    public String toString() {
        return "Cellphone{" +
                "nome='" + nome + '\'' +
                ", IMEI='" + IMEI + '\'' +
                '}';
    }

    public void setIMEI(String IMEI) {
        this.IMEI = IMEI;
    }

    @Override
    public int compareTo(CellPhone otherCell) {
        return this.IMEI.compareTo(otherCell.IMEI);
    }
}
