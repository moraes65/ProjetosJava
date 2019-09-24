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
public class Cao extends Canino implements IDomestico{
    private double tamanho;
    @Override
    public void makenoise(){
        System.out.println("Late");
    }
    
    @Override
    public void movimentar(){
        System.out.println("Caminhar Cao!");
    }

    @Override
    public void alimentar() {
        System.out.println("Alimentar 3x ao dia");
        super.comida = "Ração Pedegree"; 
    }

}
