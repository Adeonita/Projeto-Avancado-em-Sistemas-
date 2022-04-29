package roteiro3.parte3;

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
	
}
