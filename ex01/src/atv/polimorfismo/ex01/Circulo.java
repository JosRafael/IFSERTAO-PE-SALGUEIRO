package atv.polimorfismo.ex01;

public class Circulo implements AreaCalculavel {

    final double pi = 3.1416;

    public double calcularCirculo(double raio) {
        double area = pi * (raio * raio);
        return area;
    }

    @Override
    public double calculaArea() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
