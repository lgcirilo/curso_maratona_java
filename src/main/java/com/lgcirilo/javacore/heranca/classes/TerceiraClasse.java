package com.lgcirilo.javacore.heranca.classes;

public class TerceiraClasse extends Funcionario {
    private String text;
    
    public void setText(String text) {
        this.text = text;    
    }

    public String getText() {
        return this.text;
    }
    
    @Override
    public String toString() {
        return super.toString() + " text: " + this.text;
    }
}
