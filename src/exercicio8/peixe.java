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
public class peixe extends Animal {
    private String tipoHabitat;

    public String getTipoHabitat() {
        return tipoHabitat;
    }

    public void setTipoHabitat(String tipoHabitat) {
        this.tipoHabitat = tipoHabitat;
    }
    public String toString() {

        String s = "";

        s += "\nNome: " + getNome();
        s += "\nPeso: " + getPeso();
        s += "\nTipo de Habtat: " + getTipoHabitat();

        return s;
    }
}
