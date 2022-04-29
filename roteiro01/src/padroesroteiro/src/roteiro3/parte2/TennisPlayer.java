package roteiro3.parte2;

public class TennisPlayer extends Player
{
	public TennisPlayer(String nome)
	{
		super(nome);
	}
	
	public void definirTatica()
	{
		System.out.println(super.nome + " Rebate a bola por cima do oponente");
	}
}
