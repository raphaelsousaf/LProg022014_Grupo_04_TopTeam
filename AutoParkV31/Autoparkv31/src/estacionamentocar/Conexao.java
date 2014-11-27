package estacionamentocar;

import com.mysql.jdbc.*;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
    
   public static Connection con = null; 
   
   public static Connection Conectar(){
        try {
            con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/stopcar", "root", "");
        } catch (SQLException ex) {
            System.out.println("Não conectou porra nenhuma");
        }
   
   return con;
   }
}