
package autopark;
import autopark.ConectaBanco;
import autopark.ModeloVeiculo;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ControleVeiculo {
    
    ConectaBanco conectaVeiculos =  new ConectaBanco();
    
    public void InserirVeiculos(ModeloVeiculo mod){
        conectaVeiculos.conexao();
        
        try{
            PreparedStatement pst = 
                    conectaVeiculos.conn.prepareStatement("insert into Veiculo(Nome,Placa,Marca,TipoVeiculo) values(?,?,?)");
            pst.setString(1, mod.getNome().toUpperCase());
            pst.setString(2, mod.getPlaca().toUpperCase());
            pst.setString(3, mod.getMarca().toUpperCase());
            pst.setString(4, mod.getTipoVeiculo().toUpperCase());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Dados inseridos com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro na inserção dos dados! Erro:"+ ex);
        }
        conectaVeiculos.desconectata();
    }
            
       public void ExcluirVeiculo(ModeloVeiculo mod){
           conectaVeiculos.conexao();
           
           try{
               PreparedStatement pst = conectaVeiculos.conn.prepareStatement("delete from Veiculo where id = ?");
            pst.setInt(1, mod.getID());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Dados excluido com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro na exclusão dos dados!\n Erro:"+ ex);
        }
        conectaVeiculos.desconectata();
    }
         public void AlterarVeiculo(ModeloVeiculo mod){
        conectaVeiculos.conexao();
        try {
            PreparedStatement pst = conectaVeiculos.conn.prepareStatement("update Veiculo set Placa = ? , Marca = ?, TipoVeiculo = ?, where id = ?");
            pst.setString(1, mod.getPlaca().toUpperCase());
            pst.setString(2, mod.getMarca().toUpperCase());
            pst.setString(3, mod.getTipoVeiculo());
            pst.setInt(5, mod.getID());
            pst.execute();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro na alteração dos dados!\n Erro:"+ ex);
        }
    }
    public void PesquisarVeiculo(ModeloVeiculo mod){
        conectaVeiculos.conexao();
        try{
               PreparedStatement pst = conectaVeiculos.conn.prepareStatement("select from Veiculo where placa = ?");
            pst.setString(1, mod.getPlaca());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Veiculo Encontrado");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Veiculo não encontrado!\n Erro:"+ ex);
        }
        conectaVeiculos.desconectata();
    }
        
}  
     
       
        
    
    

    
    
    
    
    
    
    

