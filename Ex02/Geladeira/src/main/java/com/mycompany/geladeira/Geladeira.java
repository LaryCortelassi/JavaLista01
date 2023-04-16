package com.mycompany.geladeira;

/*Escreva um código em Java que apresente a classe Geladeira, com os atributos 
  ligado e portaFechada e imprimir.*/

public class Geladeira {

    public boolean ligado;
    public boolean portaFechada;
    
    public void imprimir(){
        
        if (ligado == true){
            System.out.println("A geladeira está ligada"); 
            }else{
            System.out.println("A geladeira está desligada");
        }
        
        if (portaFechada == true){
            System.out.println("A porta está fechada");
        }else{
            System.out.println("A porta está aberta");
        }
    }
}
