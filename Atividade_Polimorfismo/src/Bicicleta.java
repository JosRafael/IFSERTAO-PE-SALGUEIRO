public abstract class Bicicleta extends Veiculo{
public Bicicleta()
{
System.out.println("Bicicleta");
}
public void listarVerificacoes()
{
System.out.println("Bicicleta.listarVerificacoes ");
}
@Override
public void ajustar()
{
System.out.println("Bicicleta.ajustar");
}
@Override
public void limpar()
{
System.out.println("Bicicleta.limpar");
}

}