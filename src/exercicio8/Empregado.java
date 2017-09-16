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
public class Empregado extends Pessoa {

 
    private double inss;
    private int codigoSetor;
    private double salarioBase;
    private double imposto;

    public String toString() {

        String s = "";

        s += "\n Nome: " + getNome();
        s += "\n Idade: " + getIdade();
        s += "\n Codigo de Setor: " + getCodigoSetor();
        s += "\n Salario Base: " + getSalarioBase();
        s += "\n Imposto: " + getImposto();
        s += "\n Salario: " + calcularSalario();

        return s;
    }

    public double calcularSalario() {

        return salarioBase - (salarioBase * (imposto / 100));
    }

    public int getCodigoSetor() {
        return codigoSetor;
    }

    public void setCodigoSetor(int codigoSetor) {
        this.codigoSetor = codigoSetor;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public double getImposto() {
        return imposto;
    }

    public void setImposto(double imposto) {
        this.imposto = imposto;
    }

    private String matricula;

  

    public double getInss() {
        return inss;
    }

    public void setInss(double inss) {
        this.inss = inss;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

}
