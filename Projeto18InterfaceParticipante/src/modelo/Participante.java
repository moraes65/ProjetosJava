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
public class Participante implements ILeitor, IProgramador {

    @Override
    public void lendo() {
        System.out.println("Lendo...");//To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void programando() {
        System.out.println("Programando..."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
