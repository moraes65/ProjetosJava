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
public class Cao extends Canino {
    private double tamanho;
    @Override
    public void makenoise(){
        System.out.println("Late");
    }
    
    @Override
    public void movimentar(){
        System.out.println("Caminhar Cao!");
    }

}
