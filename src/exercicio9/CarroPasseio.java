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
public class CarroPasseio extends Veiculo {
    private String Cor ;
    private String Modelo;

    public CarroPasseio() {
        this.Cor = "";
        this.Modelo = "";
        
    }

    public CarroPasseio(String Cor, String Modelo) {
        this.Cor = Cor;
        this.Modelo = Modelo;
    }

    public String getCor() {
        return Cor;
    }

    public void setCor(String Cor) {
        this.Cor = Cor;
    }

    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String Modelo) {
        this.Modelo = Modelo;
    }
    
    
    public String print() {

        String s = "";

        s += "\n Modelo: " + getModelo();
        s += "\n Cor: " + getCor();
        s += "\n Peso: " + getPeso();
        s += "\n Velocidade Maxima: " + getVeloMax();
        return s;
    }
}
