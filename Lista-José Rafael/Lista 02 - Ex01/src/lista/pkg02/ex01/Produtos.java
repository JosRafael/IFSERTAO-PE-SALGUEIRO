package lista.pkg02.ex01;

public class Produtos { 
    Integer codBarras;
    int codsame;
    public Produtos(Integer codBarras){
        super();
        this.codBarras = codBarras;
    }
    
    public boolean equals(Integer codBarras){
        
        return codBarras.equals(codBarras);        
    }
    public void procurarProd(String produto, String[] produtos){
        
        for(int i = 0; i <= produtos.length - 1; i++){
            if(produtos[i].equalsIgnoreCase(produto)){
                System.out.println("Produto no index: " + i);
            }
        }
    }
}
