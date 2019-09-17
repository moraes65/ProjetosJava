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
public class Vendedor extends Funcionario{

    private double comissao;

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }
    
    
    @Override
    public double calculaSalario() {
        return this.salarioBase + this.comissao;
    }
    
}
