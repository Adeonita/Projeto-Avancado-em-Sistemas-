package roteiro3.parte2;

public class GolfPlayer extends Player
{
	public GolfPlayer(String nome)
	{
		super(nome);
	}
	
	public void definirTatica()
	{
		System.out.println(super.nome + " Pontua com nº de tacadas previstas");
	}
	
	@Override
	public void correr()
	{
		System.out.println(super.nome + " Ele não corre! Ele pensa");
	}
}
