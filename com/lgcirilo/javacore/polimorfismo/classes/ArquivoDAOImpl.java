package com.lgcirilo.javacore.polimorfismo.classes;

public class ArquivoDAOImpl implements InterfaceDAO {
    @Override
    public void save() {
        System.out.println("Salvando dados nos arquivos");
    }
}
