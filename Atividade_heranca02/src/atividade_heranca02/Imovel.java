package atividade_heranca02;

public class Imovel {
    String endereco;
    double preco;
    
    Imovel(double preco_Imovel){
        set_preco(preco_Imovel);
    
    }
    public void set_preco(double preco_Imovel){
        preco = preco_Imovel;
    }

}
