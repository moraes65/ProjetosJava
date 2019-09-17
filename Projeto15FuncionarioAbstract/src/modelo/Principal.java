/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author morae
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Vendedor v1 = new Vendedor();
        v1.setSalarioBase(1000);
        v1.setComissao(100);
        System.out.println(v1.calculaSalario());
        
        Funcionario objeto = new Funcionario(){
            @Override
            public double calculaSalario() {
                return this.salarioBase * 5; //To change body of generated methods, choose Tools | Templates.
            }
           
        };
        objeto.setSalarioBase(500);
        System.out.println(objeto.calculaSalario());
    }
    
}
