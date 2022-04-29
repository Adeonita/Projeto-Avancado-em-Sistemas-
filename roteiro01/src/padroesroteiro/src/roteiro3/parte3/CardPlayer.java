package roteiro3.parte3;

public class CardPlayer extends Player 
{
	public CardPlayer(String nome)
	{
		super(nome);
	}
	
	public void definirTatica()
	{
		System.out.println(super.nome + " É um jogador muito calmo");
	}
	
}
