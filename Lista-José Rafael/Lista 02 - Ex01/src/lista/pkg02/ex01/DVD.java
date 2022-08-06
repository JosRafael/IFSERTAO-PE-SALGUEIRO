package lista.pkg02.ex01;

public class DVD extends Produtos{
    String titulo;
    double preco;
    double duracao;
    
    public DVD(int codBarras){
        super(codBarras);
    }
    
    public String toString(String titulo, double preco, double duracao){
        return titulo + preco + duracao;
    }
}
