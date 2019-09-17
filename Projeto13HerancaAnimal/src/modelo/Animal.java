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
public class Animal {
    protected String comida;
    protected String habitat;
    
    public void makenoise()
    {
        System.out.println("Fazer Barulho!");
    }
    public void movimentar(){
        System.out.println("Caminhar!");
    }
  
}
