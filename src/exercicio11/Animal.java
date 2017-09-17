/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio11;

/**
 *
 * @author estagiario
 */
public class Animal {

    private String nome;
    private String raça;

    public Animal(String nome) {
        this.nome = nome;
    }

    public Animal() {
    }
    
    public void  caminha (){
        
       System.out.println("Caminhando..");
    }
}
