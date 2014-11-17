package estacionamentocar;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
    
   public static Connection con = null; 
   
   public static Connection Conectar(){
        try {
            con = (Connection) DriverManager.getConnection("jdbc:mysql://db4free.net/parkauto", "oliveira", "517390");
        } catch (SQLException ex) {
            System.out.println("Não conectou porra nenhuma");
        }
   
   return con;
   
   }
}