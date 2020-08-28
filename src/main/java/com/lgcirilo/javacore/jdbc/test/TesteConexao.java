package com.lgcirilo.javacore.jdbc.test;

import com.lgcirilo.javacore.jdbc.classes.Comprador;
import com.lgcirilo.javacore.jdbc.db.CompradorDB;

import java.util.Iterator;
import java.util.List;

public class TesteConexao {
    public static void main(String[] args) {
//        inserir();
//        deletar();
//        atualizar();
//        List<Comprador> compradorList = buscarPorNome("john");
//        System.out.println(compradorList);
//        selecionaMetaDados();
//        checarStatusDoDriver();
        testeTypeScroll();
    }

    private static void inserir() {
        Comprador comprador = new Comprador("000.000.000-00", "deletar");
        CompradorDB compradorDB = new CompradorDB();
        compradorDB.save(comprador);
    }

    private static void deletar() {
        Comprador comprador = new Comprador();
        comprador.setId(7);
        CompradorDB compradorDB = new CompradorDB();
        compradorDB.delete(comprador);
    }

    private static void atualizar() {
        Comprador comprador = new Comprador(25, "987.654.321-10", "john");
        CompradorDB compradorDB = new CompradorDB();
        compradorDB.update(comprador);
    }

    private static List<Comprador> selecionarTudo() {
        return new CompradorDB().selectAll();
    }

    private static List<Comprador> buscarPorNome(String nome) {
        return new CompradorDB().findByName(nome);
    }

    private static void selecionaMetaDados() {
        new CompradorDB().selectMetaData();
    }

    private static void checarStatusDoDriver() {
        new CompradorDB().checkDriverStatus();
    }

    private static void testeTypeScroll() {
        new CompradorDB().testTypeScroll();
    }
}
