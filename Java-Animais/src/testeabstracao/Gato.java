/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testeabstracao;

/**
 *
 * @author mborges
 */
public class Gato extends Animal{
    
    public Gato () {
        
    }

    public Gato(String nome, String raca) {
        super(nome, raca);
    }
    
    @Override
    public void Falar() {
        System.out.println("Miau Miau");
    }
    
}
