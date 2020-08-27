package com.lgcirilo.javacore.jdbc.db;

import com.lgcirilo.javacore.jdbc.classes.Comprador;
import com.lgcirilo.javacore.jdbc.conn.ConexaoFactory;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class CompradorDB implements ICompradorDB{
    @Override
    public void save(Comprador comprador) {
        String sql = "INSERT INTO `agencia`.`comprador` (`cpf`, `nome`) VALUES ('" +
                comprador.getCpf() + "','" + comprador.getNome() + "');";
        Connection connection = ConexaoFactory.getConexao();
        try {
            Statement statement = connection.createStatement();
            System.out.println(statement.executeUpdate(sql));
            ConexaoFactory.close(connection, statement);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void update(Comprador comprador) {
        if (comprador == null || comprador.getId() == null) {
            System.out.println("nao foi possivel alterar o registro");
            return;
        }
        String sql = "UPDATE `agencia`.`comprador` SET `cpf` = '" + comprador.getCpf() +
                "', `nome` = '" + comprador.getNome() +
                "' WHERE (`id` = '" + comprador.getId()+"');";
        Connection connection = ConexaoFactory.getConexao();
        try {
            Statement statement = connection.createStatement();
            statement.executeUpdate(sql);
            ConexaoFactory.close(connection, statement);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void delete(Comprador comprador) {
        if (comprador == null || comprador.getId() == null) {
            System.out.println("nao foi possivel deletar o registro");
            return;
        }
        String sql = "DELETE FROM `agencia`.`comprador` WHERE (`id` = '"+ comprador.getId() +"');";
        Connection connection = ConexaoFactory.getConexao();
        try {
            Statement statement = connection.createStatement();
            System.out.println(statement.executeUpdate(sql));
            ConexaoFactory.close(connection, statement);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
