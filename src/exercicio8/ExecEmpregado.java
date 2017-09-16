/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio8;

import javax.swing.JOptionPane;

/**
 *
 * @author estagiario
 */
public class ExecEmpregado {

    public static void main(String[] args) {
        //contaEspecial

        Empregado e = new Empregado();

        String nome = JOptionPane.showInputDialog("Nome:");

        e.setNome(nome);

        String idadeStr = JOptionPane.showInputDialog("idade:");

        e.setIdade(Integer.parseInt(idadeStr));

        String sexo = JOptionPane.showInputDialog("Sexo:");

        e.setSexo(sexo);

        String codsetorStr = JOptionPane.showInputDialog("Codigo de Setor:");

        e.setCodigoSetor(Integer.parseInt(codsetorStr));

        String salbaseStr = JOptionPane.showInputDialog("salario base:");

        e.setSalarioBase(Double.parseDouble(salbaseStr));

        String impostoStr = JOptionPane.showInputDialog("Imposto:");

        e.setImposto(Double.parseDouble(impostoStr));

        JOptionPane.showMessageDialog(null, e.toString());

    }
}
