/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio9;

/**
 *
 * @author estagiario
 */
public class Motor {
    private int numCilindro;
    private int potenci;

    public Motor() {
        this.numCilindro=0;
        this.potenci=0;
        
    }

    public Motor(int numCilindro, int potenci) {
        this.numCilindro = numCilindro;
        this.potenci = potenci;
    }

    public int getNumCilindro() {
        return numCilindro;
    }

    public void setNumCilindro(int numCilindro) {
        this.numCilindro = numCilindro;
    }

    public int getPotenci() {
        return potenci;
    }

    public void setPotenci(int potenci) {
        this.potenci = potenci;
    }
    
    
    public String print() {

        String s = "";

        s += "\n numero de cilindro: " + getNumCilindro();
        s += "\n Potencia: " + getPotenci();
      
        return s;
    }
}
