package roteiro3.parte2;

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
	
	@Override
	public void correr()
	{
		System.out.println(super.nome + " Ele não corre! Ele pensa");
	}
}
