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
public class Lobo extends Canino{
    private double peso;
    @Override
    public void makenoise(){
        System.out.println("Uiva");
    }
    
    @Override
    public void movimentar(){
        System.out.println("Caminhar Lobo!");
    }
}
