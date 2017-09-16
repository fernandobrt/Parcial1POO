/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio8;

/**
 *
 * @author estagiario
 */
public class Cachorro extends Animal {

    private String raca;

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    
    public String toString() {

        String s = "";

        s += "\nNome: " + getNome();
        s += "\nPeso: " + getPeso();
        s += "\nRaça: " + getRaca();

        return s;
    }

}
