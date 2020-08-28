package com.lgcirilo.javacore.jdbc.db;

import com.lgcirilo.javacore.jdbc.classes.Comprador;
import com.lgcirilo.javacore.jdbc.conn.ConexaoFactory;

import java.sql.*;
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

    public void selectMetaData() {
        String sql = "SELECT * from agencia.comprador;";
        Connection connection = ConexaoFactory.getConexao();
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
            ResultSetMetaData resultSetMetaData = resultSet.getMetaData();
            resultSet.next();
            int quantidadeColunas = resultSetMetaData.getColumnCount();
            for (int i = 1; i <= quantidadeColunas; i++) { // index i starts from 1 (one) because column indexes start from 1 (one)
                System.out.println("tabela: " + resultSetMetaData.getTableName(i));
                System.out.println("nome da coluna: " + resultSetMetaData.getColumnName(i));
                System.out.println("tamanho da coluna: " + resultSetMetaData.getColumnDisplaySize(i));
            }
            ConexaoFactory.close(connection, statement, resultSet);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void checkDriverStatus() {
        Connection connection = ConexaoFactory.getConexao();
        try {
            DatabaseMetaData metaData = connection.getMetaData();
            if (metaData.supportsResultSetType(ResultSet.TYPE_FORWARD_ONLY)) {
                System.out.println("Suporta TYPE_FORWARD_ONLY");
                if (metaData.supportsResultSetConcurrency(ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_UPDATABLE)) {
                    System.out.println(" e tambem suporta CONCUR_UPDATABLE");
                }
            }
            if (metaData.supportsResultSetType(ResultSet.TYPE_SCROLL_INSENSITIVE)) {
                System.out.println("Suporta TYPE_SCROLL_INSENSITIVE");
                if (metaData.supportsResultSetConcurrency(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE)) {
                    System.out.println(" e tambem suporta CONCUR_UPDATABLE");
                }
            }
            if (metaData.supportsResultSetType(ResultSet.TYPE_SCROLL_SENSITIVE)) {
                System.out.println("Suporta TYPE_SCROLL_SENSITIVE");
                if (metaData.supportsResultSetConcurrency(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE)) {
                    System.out.println(" e tambem suporta CONCUR_UPDATABLE");
                }
            }
            ConexaoFactory.close(connection);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void testTypeScroll() {
        String sql = "SELECT id, nome, cpf FROM agencia.comprador;";
        Connection connection = ConexaoFactory.getConexao();
        List<Comprador> compradorList = new ArrayList<>();
        try {
            Statement statement = connection.createStatement(java.sql.ResultSet.TYPE_SCROLL_INSENSITIVE,
                    java.sql.ResultSet.CONCUR_READ_ONLY);
            ResultSet resultSet = statement.executeQuery(sql);
            if (resultSet.last()) {
                System.out.println("Ultima linha: " + new Comprador(resultSet.getInt("id"),
                        resultSet.getString("nome"),
                        resultSet.getString("cpf")));
                System.out.println("Numero da ultima linha: " + resultSet.getRow());
            }
            // interesting ResultSet methods for java.sql.ResultSet.TYPE_SCROLL_INSENSITIVE
            System.out.println("Retornou para a primeira linha: " + resultSet.first());
            System.out.println("Primeira linha: " + resultSet.getRow());
            resultSet.absolute(4); // goes to line passed as a parameter
            System.out.println("linha 4: " + new Comprador(resultSet.getInt("id"),
                    resultSet.getString("nome"),
                    resultSet.getString("cpf")));
            resultSet.relative(-1); // steps back one line
            System.out.println("linha 3: " + new Comprador(resultSet.getInt("id"),
                    resultSet.getString("nome"),
                    resultSet.getString("cpf")));
            System.out.println(resultSet.isLast());
            System.out.println(resultSet.isFirst());
            resultSet.last(); // goes to last line
            System.out.println("ultima linha: " + resultSet.getRow());
            System.out.println("iterating in reverse order. Last row not shown because we use ResultSet.previous()" +
                    "starting from last line");
            while (resultSet.previous()) {
                System.out.println(new Comprador(resultSet.getInt("id"),
                        resultSet.getString("nome"),
                        resultSet.getString("cpf")));
            }
            System.out.println("in order to iterate in reverse order showing the last row we use ResultSet.afterLast()");
            resultSet.afterLast();
            while (resultSet.previous()) {
                System.out.println(new Comprador(resultSet.getInt("id"),
                        resultSet.getString("nome"),
                        resultSet.getString("cpf")));
            }
            ConexaoFactory.close(connection, statement, resultSet);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}











