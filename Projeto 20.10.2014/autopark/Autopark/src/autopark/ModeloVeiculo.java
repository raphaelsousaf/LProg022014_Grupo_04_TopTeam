/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package autopark;

/**
 *
 * @author Yasser
 */
public class ModeloVeiculo {
    
    private int ID;
    private String Placa;
    private String Marca;
    private String TipoVeiculo;
    private String Nome;

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public String getPlaca() {
        return Placa;
    }

    public void setPlaca(String Placa) {
        this.Placa = Placa;
    }

    public String getTipoVeiculo() {
        return TipoVeiculo;
    }

    public void setTipoVeiculo(String TipoVeiculo) {
        this.TipoVeiculo = TipoVeiculo;
    }
    
    
    
    
}
