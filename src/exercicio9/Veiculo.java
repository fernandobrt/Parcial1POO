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
public class Veiculo {

    private int peso;
    private int veloMax;
    private Motor motor;

    public String print() {

        String s = "";

        s += "\n numero de cilindro: " + motor.getNumCilindro();
        s += "\n Potencia: " + motor.getPotenci();
        s += "\n Peso: " + getPeso();
        s += "\n Velocidade Maxima: " + getVeloMax();
        return s;
    }


    public Veiculo() {
        this.peso = 0;
        this.veloMax = 0;
        this.motor = null;
    }
    public Veiculo(int peso, int veloMax, Motor motor) {
        this.peso = peso;
        this.veloMax = veloMax;
        this.motor = motor;
    }

    
    

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public int getVeloMax() {
        return veloMax;
    }

    public void setVeloMax(int veloMax) {
        this.veloMax = veloMax;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

}
