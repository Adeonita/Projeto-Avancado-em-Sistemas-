package roteiro3.parte4;

public class TennisPlayer extends Player
{
	public TennisPlayer(String nome, RunBehavior habilidadeCorrer)
	{
		super(nome, habilidadeCorrer);
	}
	
	public void definirTatica()
	{
		System.out.println(super.nome + " Rebate a bola por cima do oponente");
	}
}
