package atv.polimorfismo.ex02;

public class Mouse extends Produto {

    String tipo;

    Mouse(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public void getDescricao() {
        System.out.println(this.tipo);
    }
}
