
package autopark;

import java.util.Scanner;


public class AutoPark {
    
    
    public static void main(String[] args) {
        String modelo, placa;
        Scanner leitor  = new Scanner(System.in); 
        System.out.print( "Digite o modelo do veiculo:" );
        modelo = leitor.next();
        System.out.print( "Digite a placa do veiculo:" );
        placa = leitor.next();
        
        Veiculo veiculo = new Veiculo(modelo, placa);
        
        System.out.println("O modelo do seu veiculo e:");
        System.out.println(modelo);
        System.out.println("A placa do seu veiculo e:");
        System.out.println(placa);
         
        
        
    }
}
