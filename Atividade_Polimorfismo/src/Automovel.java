public abstract class Automovel extends Veiculo{

public Automovel()
{
System.out.println("Automovel");
}
public void listarVerificacoes()
{
System.out.println("Automovel.listarVerificacoes ");
}
@Override
public void ajustar()
{
System.out.println("Automovel.ajustar ");
}
@Override
public void limpar()
{
System.out.println("Automovel.limpar ");
}
public void mudarOleo()
{
System.out.println("Automovel.mudouOleo");
}

} 
