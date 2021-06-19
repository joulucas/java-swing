package com.poo.dao;

import java.sql.*;

public class Conexao {

    private final String SERVIDOR = "localhost";
    private final String PORTA = "3306";
    private final String BANCO_DE_DADOS = "dbsistemavenda";
    private final String USUARIO = "root";
    private final String SENHA = "root";
    private final String URL = "jdbc:mysql://" + SERVIDOR + ":" + PORTA + "/" + BANCO_DE_DADOS;

    private Connection conexao;

    @SuppressWarnings("deprecation")
	public Conexao() throws ClassNotFoundException, SQLException {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
            conexao = DriverManager.getConnection(URL, USUARIO, SENHA);
            conexao.setAutoCommit(false);
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e) {
            throw new ClassNotFoundException("O driver de conexao nao foi adicionado ao projeto.\n" + e.getMessage());
        } catch (SQLException e) {
            throw new SQLException("Problemas nos parametros de conexao.\n" + e.getMessage());
        }
    }

    public Connection getConexao() {
        return conexao;
    }

    public void confirmar() throws SQLException {
        try {
            conexao.commit();
        } catch (SQLException e) {
            throw new SQLException("Problemas na instrucao SQL.\n" + e.getMessage());
        } finally {
            conexao.close();
        }
    }
}
