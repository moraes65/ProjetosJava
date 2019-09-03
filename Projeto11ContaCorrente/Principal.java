/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

/**
 *
 * @author aluno
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Conta dono01 = new Conta("JOAO", 1111, 1000);
        dono01.depositar(100);
        Conta dono02 = new Conta("MARIA", 1111, 2000);
        dono02.depositar(200);
        
        dono01.sacar(100);
        dono02.sacar(200);
        
        dono01.transferir(250, dono02);
        
    }
    
}
