package com.lgcirilo.javacore.polimorfismo.test;

import com.lgcirilo.javacore.polimorfismo.classes.InterfaceDAO;
import com.lgcirilo.javacore.polimorfismo.classes.ArquivoDAOImpl;
import com.lgcirilo.javacore.polimorfismo.classes.DatabaseDAOImpl;

public class DAOTest {
    public static void main(String[] args) {
        InterfaceDAO arquivoDAO = new ArquivoDAOImpl();
        InterfaceDAO arquivoDAO2 = new DatabaseDAOImpl();
        arquivoDAO.save();
        arquivoDAO2.save();
    }
}
