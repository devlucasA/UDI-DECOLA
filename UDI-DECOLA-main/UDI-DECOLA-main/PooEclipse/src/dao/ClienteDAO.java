package dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import model.Cliente;


public class ClienteDAO {
    
    private static final String URL = "jdbc:postgresql://localhost:5432/postgres";
    private static final String USER = "postgres";
    private static final String PASSWORD = "123";
    
    
    public static void criarTabelaCliente() {
        try (Connection conn = Conexao.conectar(URL, USER, PASSWORD);
             Statement stmt = conn.createStatement()) {
            String sql = "CREATE TABLE IF NOT EXISTS cliente (" +
                         "cpf VARCHAR(20) PRIMARY KEY," +
                         "nome VARCHAR(100)," +
                         "email VARCHAR(100)," +
                         "endereco VARCHAR(200)," +
                         "nascimento DATE" +
                         ")";
            stmt.executeUpdate(sql);
            System.out.println("Tabela cliente criada com sucesso.");
        } catch (SQLException e) {
            System.err.println("Erro ao criar tabela cliente: " + e.getMessage());
        }
    }
    
    public static void inserirCliente(Cliente cliente) {
        Conexao conex = new Conexao(URL, USER, PASSWORD);
        String sql = "INSERT into cliente (cpf, nome, email, endereco, nascimento)" + 
                     " values ('" + cliente.getCpf() + "','" + cliente.getNome() + "','" +
                     cliente.getEmail() + "','" + cliente.getEndereco() + "','" + cliente.getData_nasc().dataEmString() + "')";
        int res = conex.executaSQL(sql);
        if (res > 0) {
            System.out.println("Cadastrado com sucesso!!");
        } else {
            System.out.println("Erro no cadastro");
        }
    }

}