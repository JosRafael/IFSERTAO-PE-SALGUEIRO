package atv.polimorfismo.ex01;

public class Retangulo implements AreaCalculavel {
    public double calcularRetangulo(double base, double altura){
        double area = base * altura;
        return area;
    }

    @Override
    public double calculaArea() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
