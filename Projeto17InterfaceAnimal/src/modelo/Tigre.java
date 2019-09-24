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
public class Tigre extends Felino {
    private String cor;
    @Override
    public void makenoise(){
        System.out.println("Rosna");
    }
    
    @Override
    public void movimentar(){
        System.out.println("Caminhar Tigre!");
    }
}
