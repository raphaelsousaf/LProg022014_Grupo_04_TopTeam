
package autopark;
import autopark.ConectaBanco;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import autopark.ModeloFinanceiro;
import javax.swing.JOptionPane;

public class ControleFinanceiro {
    
    ConectaBanco conectafinanceiro = new ConectaBanco();
    
    public void CadastrarFinanceiro(ModeloFinanceiro mod){
    conectafinanceiro.conexao();
    
    try{
        
        PreparedStatement pst =
                conectafinanceiro.conn.prepareStatement("insert into table Financeiro(Horarioe,Horarios,Dia,TipoVeiculo,Pernoite)values (?,?,?,?,?)");
        
        pst.setString(1,mod.getHorarioe().toUpperCase());
        pst.setString(2,mod.getHorarios().toUpperCase());
        pst.setString(3,mod.getDia().toUpperCase());
        pst.setString(4,mod.getTipoVeiculo().toUpperCase());
        pst.setString(5,mod.getPernoite().toUpperCase());
        pst.execute();
          JOptionPane.showMessageDialog(null, "Dados inseridos com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro na inserção dos dados! Erro:"+ ex);
        }
        conectafinanceiro.desconectata();
    }      
                 
         public void ExcluirFinanceiro(ModeloFinanceiro mod){
           conectafinanceiro.conexao();
           
           try{
               PreparedStatement pst = conectafinanceiro.conn.prepareStatement("delete from Financeiro where id = ?");
            
            pst.execute();
            JOptionPane.showMessageDialog(null, "Dados excluído com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro na exclusão dos dados!\n Erro:"+ ex);
        }
        conectafinanceiro.desconectata();
    }
         public void AlterarFinanceiro(ModeloFinanceiro mod){
        conectafinanceiro.conexao();
        try {
            PreparedStatement pst = conectafinanceiro.conn.prepareStatement("update Veiculo set Horarioe = ? , Horarios = ?, Dia = ?,TipoVeiculo = ?,Pernoite = ?, where id = ?");
            pst.setString(1, mod.getHorarioe().toUpperCase());
            pst.setString(2, mod.getHorarios().toUpperCase());
            pst.setString(3, mod.getDia());
            pst.setString(4, mod.getTipoVeiculo().toUpperCase());
            pst.setString(5, mod.getPernoite().toUpperCase());
            pst.execute();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro na alteração dos dados!\n Erro:"+ ex);
        }
    }
    
}  
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
 
