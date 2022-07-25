package atv.polimorfismo.ex02;

public class Produto {

    double preco;
    String descricao;

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double getPreco(double preco) {
        return preco;
    }

    public void getDescricao() {
        System.out.println("Produto Genérico");
    }
}
