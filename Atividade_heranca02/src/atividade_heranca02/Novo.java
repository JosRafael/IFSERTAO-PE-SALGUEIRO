package atividade_heranca02;

public class Novo extends Imovel{
    double preco_final;
    
    Novo(double preco_Imovel){
        super(preco_Imovel);
        preco_final = preco_Imovel + (preco_Imovel * 0.10);
        System.out.println(preco_final);
    }
}
    
