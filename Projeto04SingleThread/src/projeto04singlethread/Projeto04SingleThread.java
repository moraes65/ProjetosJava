/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto04singlethread;

/**
 *
 * @author Alunos
 */
public class Projeto04SingleThread {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        // TODO code application logic here
        
        //BOLINHAS VERMELHAS
        for (int i = 0; i < 10; i++){
            System.out.println("VERMELHA");
            Thread.sleep(1000);
        }
        
        //BOLINHAS PRETAS
        for (int i = 0; i < 10; i++){
            System.out.println("PRETA");
            Thread.sleep(1000);
        }
    }
    
}
