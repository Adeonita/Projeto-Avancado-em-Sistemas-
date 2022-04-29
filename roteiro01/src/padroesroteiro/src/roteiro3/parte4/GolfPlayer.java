package roteiro3.parte4;

public class GolfPlayer extends Player
{
	public GolfPlayer(String nome, RunBehavior habilidadeCorrer)
	{
		super(nome, habilidadeCorrer);
	}
	
	public void definirTatica()
	{
		System.out.println(super.nome + " Pontua com nº de tacadas previstas");
	}
}
