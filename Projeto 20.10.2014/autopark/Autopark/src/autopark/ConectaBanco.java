
package autopark;

import java.sql.*;
import javax.swing.JOptionPane;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.PreparedStatement;


/**
 *
 * @author Yasser
 */
public class ConectaBanco {
    
 {
     
 }
    public Statement stm;
    public ResultSet rs;
    private String  drive = "com.mysql.jdbc.Driver";
    private String caminho = "jdbc:mysql://db4free.net:3306/chariotsoffire";
    private String usuario = "dqbert";
    private String senha = "1155****";
    //*/
    /* String para conexão NAS NUVENS
    private String caminho = "jdbc:mysql://db4free.net/banco";
    private String usuario = "ferekelu"; 
    private String senha = "FRkl159";
    String para conexão localhost
     private String caminho = "jdbc:mysql://localhost:3306/AutoPark";
    private String usuario = "root";
    private String senha = "";
    */
    public Connection conn;
    
    public void  conexao()
    {
        try {
            System.setProperty("jdbc.Driver", drive);
            conn = DriverManager.getConnection(caminho, usuario, senha);
            //JOptionPane.showMessageDialog(null, "Conectado com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro de conexão!\n Erro: "+ex.getMessage());
        }
    }
    public void desconectata()
    {
        try {
            conn.close();
            //JOptionPane.showMessageDialog(null, "Desconectado com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro dao fechar a conexão!\n Erro: "+ex.getMessage());
        }
    }
    public void executaSql(String sql){
    
        try {
            stm = conn.createStatement(rs.TYPE_SCROLL_INSENSITIVE, rs.CONCUR_READ_ONLY);
            rs = stm.executeQuery(sql);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro de ExecutaSQL!\n Erro: "+ex.getMessage());
        }
    }
}
   
    
    

