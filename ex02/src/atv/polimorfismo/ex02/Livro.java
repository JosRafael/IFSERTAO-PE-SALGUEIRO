package atv.polimorfismo.ex02;

public class Livro extends Produto {

    String autor;

    Livro(String autor) {
        this.autor = autor;
    }

    @Override
    public void getDescricao() {
        System.out.println(this.autor);
    }
}
