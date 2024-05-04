package dao;

import java.sql.*;

public class Conexao {
    private String url;
    private String usuario;
    private String senha;
    private Connection con;
    
    public Conexao(String url, String usuario, String senha) {
        this.url = url;
        this.usuario = usuario;
        this.senha = senha;
        
        try {
            
            Class.forName("org.postgresql.Driver");
            con = DriverManager.getConnection(url,usuario,senha);
            
            System.out.println("Conexao SUCESSO");
        }
        catch(Exception e){
            System.out.println("Error: " + e.getMessage());
            e.printStackTrace();
        }
        
        
    }
    
    public int executaSQL(String sql) {
        try {
            Statement stm = con.createStatement();
            int res = stm.executeUpdate(sql);
            return res;
        } catch (SQLException e) {
            e.printStackTrace();
            return 0;
        } finally {
            if (con != null) {
                try {
                    con.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    
    
    public static Connection conectar(String url, String usuario, String senha) throws SQLException {
        return DriverManager.getConnection(url, usuario, senha);
    }
    
    
}