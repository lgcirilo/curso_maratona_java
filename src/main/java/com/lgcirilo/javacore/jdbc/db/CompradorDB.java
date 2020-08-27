package com.lgcirilo.javacore.jdbc.db;

import com.lgcirilo.javacore.jdbc.classes.Comprador;
import com.lgcirilo.javacore.jdbc.conn.ConexaoFactory;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

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

    // TODO - methods selectaAll and findByName share most of their code. Create a method to encapsulate shared code
    public List<Comprador> selectAll() {
        String sql = "SELECT id, nome, cpf FROM agencia.comprador;";
        Connection connection = ConexaoFactory.getConexao();
        List<Comprador> compradorList = new ArrayList<>();
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {
                compradorList.add(new Comprador(resultSet.getInt("id"),
                        resultSet.getString("nome"),
                        resultSet.getString("cpf")));
            }
//           ResultSet.get* can use the column index as a parameter. The above while loop can be written as follows:
//            while (resultSet.next()) {
//                System.out.println(resultSet.getInt(1));
//                System.out.println(resultSet.getString(2));
//                System.out.println(resultSet.getString(3));
//            }
//            Note that column indexes start at 1, not 0.
            ConexaoFactory.close(connection, statement, resultSet);
            return compradorList;
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }

    public List<Comprador> findByName(String name) {
        String sql = "SELECT id, nome, cpf FROM agencia.comprador WHERE nome like '%" + name +"%';";
        Connection connection = ConexaoFactory.getConexao();
        List<Comprador> compradorList = new ArrayList<>();
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {
                compradorList.add(new Comprador(resultSet.getInt("id"),
                        resultSet.getString("nome"),
                        resultSet.getString("cpf")));
            }
            ConexaoFactory.close(connection, statement, resultSet);
            return compradorList;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}











