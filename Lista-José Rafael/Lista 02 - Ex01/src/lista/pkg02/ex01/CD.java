package lista.pkg02.ex01;

public class CD extends Produtos{
    String titulo;
    double preco;
    int ndefaixas;
    
    public CD(Integer codBarras){
        super(codBarras);
    }
    
    public String toString(String titulo, double preco, int ndefaixas){
        return titulo + preco + ndefaixas;
    }
}
