package com.mycompany.retangulo;

 /*Escreva um código em Java que apresente a classe Retângulo, com atributos 
   comprimento, largura, área e perímetro e, os métodos calcularArea, 
   calcularPerimetro e imprimir.*/

public class Retangulo {
        
        int comprimento = 10;
        int largura = 5;
        int area;
        int perimetro;
        
        public void calcularArea(){
            area = comprimento * largura;
        }
        
        public void calcularPerimetro(){
            perimetro = 2 * (comprimento + largura);
        }
        
        public void imprimir(){
            System.out.println("Comprimento "+comprimento+"\nLargura "+largura+"\nArea "+area+"\nPerimetro "+perimetro);            
        }
}
