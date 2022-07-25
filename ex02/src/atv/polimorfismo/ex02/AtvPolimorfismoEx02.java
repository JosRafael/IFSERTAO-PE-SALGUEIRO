package atv.polimorfismo.ex02;

public class AtvPolimorfismoEx02 {

    public static void main(String[] args) {
        String carrinho[] = {"Mouse Redgraon", "Livro Alcapia", "Mouse Limms", "Livro Arte", "Mouse Okl"};

        for (int x = 0; x < carrinho.length; x++) {
            Mouse ms = new Mouse(carrinho[x]);
            ms.getDescricao();
        }
    }
}
