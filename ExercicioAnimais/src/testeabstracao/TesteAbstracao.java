/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testeabstracao;

import java.util.ArrayList;

/**
 *
 * @author mborges
 */
public class TesteAbstracao {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Animal> animais = new ArrayList<>();
        
        Cachorro cachorro = new Cachorro("Iggy", "Bulldog Francês");
        cachorro.Falar();
        
        Gato gato = new Gato("Garfield", "Laranja");
        gato.Falar();
        
        animais.add(cachorro); animais.add(gato);
        
        //animais.forEach((animal) -> System.out.println(animal.getNome()));
        animais.forEach((i) -> {
            if (i instanceof Cachorro) {
                i.Falar();
            } else {
                System.err.println("Não é um cachorro");
            }
        });
        // Ou
        /*for (Animal i : animais) {
            if (i instanceof Cachorro) {
                i.Falar();
            } else {
                System.err.println("Não é um cachorro");
            }
        }*/
    }

}
