package com.lgcirilo.javacore.jdbc.db;

import com.lgcirilo.javacore.jdbc.classes.Comprador;

import java.util.List;

public interface ICompradorDB {
    void save(Comprador comprador);

    void update(Comprador comprador);

    void delete(Comprador comprador);

    List<Comprador> selectAll();
}
