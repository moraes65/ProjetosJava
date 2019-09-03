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
public class Conta {
    private String nomeDono;
    private int numConta;
    private double saldo;

    public Conta(String nomeDono, int numConta, double saldo) {
        this.nomeDono = nomeDono;
        this.numConta = numConta;
        this.saldo = saldo;
    }

    public Conta() {
    }

    public String getNomeDono() {
        return nomeDono;
    }

    public void setNomeDono(String nomeDono) {
        this.nomeDono = nomeDono;
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    public void sacar(double valor){
        if (valor > this.saldo){
            System.out.println("Limite ultrapassado!");
        } else {
            this.saldo = this.saldo - valor;
            System.out.println("Novo Saldo: " + this.saldo 
                    + " - " + this.nomeDono);
        }
        
        
    }
    
    public void depositar(double valor){
        this.saldo = this.saldo + valor;
        System.out.println("Novo Saldo: " + this.saldo
        + " - " + this.nomeDono);
    }
    
    public void transferir(double valor, Conta destino){
        if (valor < this.saldo){
            this.saldo = this.saldo - valor;
            destino.depositar(valor);
            System.out.println("Novo Saldo: " + this.saldo
            + " - " + this.nomeDono);
        } else {
            System.out.println("Limite ultrapassado!");
        }
                
        
    }
}
