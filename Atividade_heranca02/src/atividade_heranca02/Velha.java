package atividade_heranca02;

public class Velha extends Imovel{
    double preco_final;
    
    Velha(double preco_Imovel){
        super(preco_Imovel);
        preco_final = preco_Imovel - (preco_Imovel * 0.15);
        System.out.println(preco_final);
    }
}
    
