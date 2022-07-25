package atividade_heranca02;
import java.util.Scanner;

public class Atividade_heranca02 {

  
    public static void main(String[] args) {
        Scanner novo = new Scanner(System.in);
        System.out.print("Insira um valor para o Imóvel: ");
        double imovel = novo.nextDouble();
        System.out.print("Preco ajustado: ");
        Novo atual = new Novo(imovel);
        System.out.print("Preço com desconto: ");
        Velha antiga = new Velha(imovel);
        
       
    }
    
}
