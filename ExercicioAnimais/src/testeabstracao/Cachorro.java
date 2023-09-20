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
public class Cachorro extends Animal {

    public Cachorro() {
    }

    public Cachorro(String nome, String raca) {
        super(nome, raca);
    }
    
    @Override
    public void Falar() {
        System.out.println("Au Au");
    }
    
}
