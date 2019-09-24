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

//CLASSE É ABSTRATA QUANDO QUEREMOS IMPEDIR QUE 
//UM OBJETO SEJA INSTANCIADO DESSA CLASSE
//PARA ISSO USAREI A PALAVRA RESERVADA abstract NA
//DECLARACAO DA CLASSE
public abstract class Animal {
    protected String comida;
    protected String habitat;
    
    //metodo makeNoise() passou a ser um método
    //abstrato e portanto nao tenho mais a implementação
    //(corpo) do metodo
    //Todo metodo abstrato obrigatoriamente deve ser
    //implementado nas classes filho (CONCRETAS)
    //Para definir um metodo ABSTRATO deveremos colocar 
    //a palavra reservada 'abstract' na ASSINATURA do
    //metodo e colocar um ponto e virgula em vez de abre e fecha 
    //as chaves do corpo do metodo
    public abstract void makenoise();
    
    public abstract void movimentar();
  
}
