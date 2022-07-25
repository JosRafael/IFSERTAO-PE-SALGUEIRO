package atv.polimorfismo.ex01;

import java.util.Scanner;

public class AtvPolimorfismoEx01 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Circulo crl = new Circulo();
        Retangulo retan = new Retangulo();

        System.out.println("1 - Círculo\n2 - Retangulo\t3 - Fim");
        System.out.print("Digite a opção: ");

        int opcao = teclado.nextInt();

        if (opcao == 1) {
            System.out.print("Digite um valor do raio: ");
            double valor = teclado.nextDouble();
            System.out.println(crl.calcularCirculo(valor));
        }
        if (opcao == 2) {
            System.out.print("Digite um valor para a base: ");
            double base = teclado.nextDouble();
            System.out.print("Digite um valor para a altura: ");
            double altura = teclado.nextDouble();
            System.out.println(retan.calcularRetangulo(base, altura));
        }
        if (opcao == 3) {
            System.out.println("Obrigado!");
        }
    }

}
