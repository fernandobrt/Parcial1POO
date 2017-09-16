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
public class Caminhao extends Veiculo {
    private double cargMax;
    private double alturaMax;
    private int comprimento;

    public Caminhao(double cargMax, double alturaMax, int comprimento) {
        this.cargMax = 0;
        this.alturaMax = 0;
        this.comprimento = 0;
    }

    public double getCargMax() {
        return cargMax;
    }

    public void setCargMax(double cargMax) {
        this.cargMax = cargMax;
    }

    public double getAlturaMax() {
        return alturaMax;
    }

    public void setAlturaMax(double alturaMax) {
        this.alturaMax = alturaMax;
    }

    public int getComprimento() {
        return comprimento;
    }

    public void setComprimento(int comprimento) {
        this.comprimento = comprimento;
    }
    
    public String print() {

        String s = "";

        s += "\n Carga Maxima: " + getCargMax();
        s += "\n Altura Maxima: " + getAlturaMax();
        s += "\n Comprimento: " + getComprimento();
        
        return s;
    }
}
