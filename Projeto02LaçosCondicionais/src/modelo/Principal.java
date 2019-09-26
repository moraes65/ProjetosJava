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
        int idade = 15;
        while (idade < 18 ) {
            System.out.println("Idade: " + idade + " anos.");
            idade = idade + 1;
        }
        System.out.println("Valor de IDADE? " + idade);
        
        int j = 10;
        while (j >= 0){
            System.out.println("Valor de j: " + j);
            j--;
        }
        System.out.println("Valor de J? " + j);
        
        // for(inicialiazação; condicao; incremento)
        for(int i = 0; i < 10; i++){
            System.out.println("Valor de i: " + i);
        }
        // ERROR System.out.println("Valor de i? " + i);
        int k = 100;
        for(k = 0; k < 10; k++){
            System.out.println("Valor de k: " + k);
        }
        System.out.println("Valor de k? " + k);
        
        int m = 2;
        m = ++m;
        System.out.println("Valor de M1? " + m);
        m = m++;
        //m = m + 1;
        System.out.println("Valor de M2? " + m);
        
        k = ++k + --m;
        System.out.println("Valor de K? " + k);
    }
    
}
