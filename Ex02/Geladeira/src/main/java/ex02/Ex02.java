package ex02;

import com.mycompany.geladeira.Geladeira;

public class Ex02 {
    
    public static void main(String[] args){
        
        Geladeira geladeira = new Geladeira();
        geladeira.ligado = true;
        geladeira.portaFechada = false;
        geladeira.imprimir();
        System.out.println("---------------------------------");
        geladeira.ligado = true;
        geladeira.portaFechada = true;
        geladeira.imprimir();
    }
}
