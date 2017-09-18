package exercicio7;

import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author estagiario
 */
public class Contas {

    public static void main(String[] args) {
        //contaEspecial

        ContaEspecial especial = new ContaEspecial();

        especial.setCliente("Fernando Brito");
        especial.setNumConta(2424);

        String limteStr = JOptionPane.showInputDialog("valor limite da conta:");

        especial.setLimite(Float.parseFloat(limteStr));

        String depositoStr = JOptionPane.showInputDialog("valor para depositar:");

        especial.depositar(Double.parseDouble(depositoStr));

        String saqueStr = JOptionPane.showInputDialog("valor para saque:");

        especial.sacar(Double.parseDouble(saqueStr));

        String msg = "Cliente: " + especial.getCliente() + "\nConta: " + especial.getNumConta() + "\nSaldo: " + especial.getSaldo();

        JOptionPane.showMessageDialog(null, msg);

        //Conta poupança
        ContaPoupanca poupanca = new ContaPoupanca();
        poupanca.setCliente("Marcos Freire");
        poupanca.setNumConta(111);

        String depositoStr2 = JOptionPane.showInputDialog("valor para depositar:");

        poupanca.depositar(Double.parseDouble(depositoStr2));

        String saqueStr2 = JOptionPane.showInputDialog("valor para saque:");

        poupanca.sacar(Double.parseDouble(saqueStr2));

        
        
        String rendStr = JOptionPane.showInputDialog("valor para rendimento:");
        
        
        poupanca.calcularNovoSaldo(Integer.parseInt(rendStr));

        

        String msg2 = "Cliente: " + poupanca.getCliente() + "\nConta: " + poupanca.getNumConta() + "\nSaldo: " + poupanca.getSaldo();

        JOptionPane.showMessageDialog(null, msg2);

    }
}
