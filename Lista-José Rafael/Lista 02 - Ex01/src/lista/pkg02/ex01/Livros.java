package lista.pkg02.ex01;

public class Livros extends Produtos{
    String titulo;
    double preco;
    String autor;
    
    public Livros(int codBarras){
        super(codBarras);
    }
    
    public String toString(String titulo, double preco, String autor){
        return titulo + preco + autor;
    }
}
