/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio1a6;

/**
 *
 * @author fbrito
 */

///
public class Exercicio3 {
     public static void main(String[] args) {
         
         Empregado e = new Empregado("peesso2","ender","8579885");
         
         e.setCodigoSetor(65);
         e.setSalarioBase(4000);
         e.setImposto(7);
         
         
         System.out.println(e.calcularSalario() );
     }
}
