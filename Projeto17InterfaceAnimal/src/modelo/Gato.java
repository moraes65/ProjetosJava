/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author aluno
 */
public class Gato extends Felino implements IDomestico{
    private String raça;
    public void makenoise(){
        System.out.println("Mia");
    }

    @Override
    public void movimentar(){
        System.out.println("Caminhar Gato!");
    }

    @Override
    public void alimentar() {
        System.out.println("Alimentar 5x ao dia");
        super.comida = "Ração Whiska";
    }
}
