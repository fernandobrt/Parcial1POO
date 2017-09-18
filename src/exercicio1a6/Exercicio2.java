/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio1a6;

import javax.swing.JFrame;

/**
 *
 * @author fbrito
 */
public class Exercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Fornecerdor f = new Fornecerdor("sd", "sdf", "sdf");

        f.setValorCredito(500);
        f.setValorDivida(600);

        System.out.println(f.obterSaldo());

    }

}
