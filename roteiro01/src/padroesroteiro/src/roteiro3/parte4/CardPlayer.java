package roteiro3.parte4;

public class CardPlayer extends Player
{
	public CardPlayer(String nome, RunBehavior habilidadeCorrer)
	{
		super(nome, habilidadeCorrer);
	}
	
	public void definirTatica()
	{
		System.out.println(super.nome + " É um jogador muito calmo");
	}
}
