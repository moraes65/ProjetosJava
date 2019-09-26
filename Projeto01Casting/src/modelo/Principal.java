/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Alunos
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // sout + tab
        System.out.println("Alo Mundo Java!");
        
        //CASTING
        int i = 10;
        double pi = 3.14;
        pi = 3;
        i = (int) 3.14; //casting = 'se molde a alguma coisa'
        
        int numInt = 1000;
        long numLong = 1000;
        numLong = numInt;
        numInt = (int) numLong;
        
        float numFloat = 3.14f;
        pi = numFloat;
        numFloat = (float) pi;
        
        System.out.println("Valor de Pi: " + pi);
        
    }
    
}
