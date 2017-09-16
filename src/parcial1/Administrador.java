/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial1;

/**
 *
 * @author fbrito
 */
public class Administrador extends Empregado {

    private double ajudaDeCusto;

    public Administrador(String nome, String endereço, String telefone) {
        super(nome, endereço, telefone);
    }

    public double calcularSalario() {
        
       return super.calcularSalario()+ajudaDeCusto;
        
       
    }
}
