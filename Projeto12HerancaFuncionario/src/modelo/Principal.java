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
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Funcionario objFunc01 = new Funcionario();
        objFunc01.setNome("Joao");
        objFunc01.setSalario(500);
        objFunc01.setCpf("111222333");
        System.out.println("Func01: "+objFunc01.getNome());
        System.out.println("Info: " + objFunc01.getInformacao());
        
        Gerente objGer01 = new Gerente();
        objGer01.setNome("Maria");
        objGer01.setSalario(600);
        objGer01.setCpf("222111444");
        objGer01.setSetor("ADM");
        objGer01.setSenha("112233");
        System.out.println("Ger01: "+objGer01.getNome());
        System.out.println(objGer01.getInformacao());
        objGer01.getAutenticacao("112244");
        
        
        Funcionario objFunc02 = new Gerente();
        //casting entre objetos (CLASSES)
        //da mesma forma que vimos em tipos PRIMITIVOS
        //Gerente objGer02 = (Gerente) new Funcionario();
        
        //atribuicao entre objetos
        //usando casting
        //objFunc02 = objGer02;
        //objGer02 = (Gerente) objFunc02;
        
        
    }
    
}
