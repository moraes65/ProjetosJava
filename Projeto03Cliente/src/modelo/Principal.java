/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;

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
        //Instanciando um OBJETO da classe Cliente
        Cliente objCliente01 = new Cliente();
        objCliente01.setNome("JOAO");
        objCliente01.setEndereco("RUA UNIAO 100");
        objCliente01.setCidade("LINS");
        System.out.println("Cliente01: " + objCliente01.getNome());
        
        Cliente objCliente02 = new Cliente("ANA", "RUA ZERO 101", "LINS");
        System.out.println("Cliente02: " + objCliente02.getNome());
        Cliente objCliente03 = new Cliente("MARIA", "RUA TREZE 101", "LINS");
        Cliente objCliente04 = new Cliente("MARIA", "RUA TREZE 101", "LINS");
        
        //LISTA TIPADA <>
        ArrayList<Cliente> listaClientes = new ArrayList<Cliente>();
        listaClientes.add(objCliente01);
        listaClientes.add(objCliente02);
        listaClientes.add(objCliente03);
        //ERROR listaClientes.add("Novo objeto");
        
        //leitura de uma lista usando FOR
        //tamanho da lista metodo size()
        for (int i = 0; i < listaClientes.size(); i++){
            Cliente objCliente = listaClientes.get(i);
            System.out.println("Nome do Cliente: " + 
                    objCliente.getNome());
        }
        
        
        System.out.println("Total: " + 
                objCliente03.getTotalClientes());
        
        
        
    }
    
    
}
