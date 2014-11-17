

package estacionamentocar;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import estacionamentocar.Conexao;


/**
 *
 * @author Yasser
 */
public class testebanco{
  public static void main(String[] args) {
      Conexao teste = new Conexao();
      teste.Conectar();
      
      
      
        
    }
}