package lista.pkg02.ex01;

import java.util.Arrays;
import java.util.Scanner;

public class Lista02Ex01 {

    public static void main(String[] args) {
        String[] produtos = {"Forrest Gump", "A Arte da Guerra", "AC/DC Live At River Plate", "Superando Seus Limites Internos", "Zumbilândia"};
        System.out.println(Arrays.toString(produtos));
        
        Produtos produto1 = new Produtos(55100);
        Produtos produto2 = new Produtos(55900);
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        produto1.procurarProd(produtos[0], produtos);
        produto1.procurarProd(produtos[2], produtos);
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        
        if(produto1.codBarras.equals(produto2.codBarras)){
            System.out.println("Código de Barras: igual");
        }
        else{
            System.out.println("Código de Barras: não igual");
            System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        }
        
    }

}
