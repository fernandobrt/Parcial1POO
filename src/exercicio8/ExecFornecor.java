/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio8;

import exercicio7.ContaEspecial;
import javax.swing.JOptionPane;

/**
 *
 * @author estagiario
 */
public class ExecFornecor {

    public static void main(String[] args) {
        //contaEspecial

        Fornecedor f = new Fornecedor();

       
       

        String nome = JOptionPane.showInputDialog("Nome:");

        f.setNome(nome);

        String idadeStr = JOptionPane.showInputDialog("idade:");

        f.setIdade(Integer.parseInt(idadeStr));
        
        String sexo = JOptionPane.showInputDialog("Sexo:");

        f.setSexo(sexo);
        
        String creditoStr = JOptionPane.showInputDialog("Valor de Credito:");

        f.setValorCredito(Double.parseDouble(creditoStr) );
        
        String dividaStr = JOptionPane.showInputDialog("Valor de Divida:");

        f.setValorDivida(Double.parseDouble(dividaStr) );
    
        JOptionPane.showMessageDialog(null, f.toString());
    
    }
    
    
    
}
