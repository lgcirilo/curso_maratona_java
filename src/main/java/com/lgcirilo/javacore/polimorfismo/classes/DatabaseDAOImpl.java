package com.lgcirilo.javacore.polimorfismo.classes;

public class DatabaseDAOImpl implements InterfaceDAO {
    @Override
    public void save() {
        System.out.println("Salvando no banco de dados");
    }
}
