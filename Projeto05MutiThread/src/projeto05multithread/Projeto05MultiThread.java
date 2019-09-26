/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto05multithread;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Alunos
 */
public class Projeto05MultiThread {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Duas maneiras de criar um Thread em Java
        //1 - Criar uma classe que herde da classe Thread
        //2 - Utilizar o conceito de INTERFACES em Java
        //No caso a classe Thread implementa a Interface
        //Runnable que disponiliza métodos para serem
        //sobrescritos nas classes.

        Runnable maquinaVermelha = new Runnable() {
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println("VERMELHA");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException ex) {
                        System.out.println("A Thread sofre uma interrupção!");
                    }
                }
            }

        };
        
        Runnable maquinaPreta = new Runnable() {
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println("PRETA");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException ex) {
                        System.out.println("A Thread sofre uma interrupção!");
                    }
                }
            }

        };
        
        //PRÓXIMO PASSO INSTANCIAR AS THREADS PARA
        //RODAR (run()) DAS INTERFACES RUNNABLES
        
        Thread objThreadVermelha = new Thread(maquinaVermelha);
        Thread objThreadPreta = new Thread(maquinaPreta);
        
        //ULTIMO PASS SERÁ INICIAR AS THREADS
        
        objThreadVermelha.start();
        objThreadPreta.start();
        
        
    }

}
