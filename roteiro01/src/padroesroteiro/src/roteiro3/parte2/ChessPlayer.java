package roteiro3.parte2;

public class ChessPlayer extends Player
{
	public ChessPlayer(String nome)
	{
		super(nome);
	}
	
	public void definirTatica()
	{
		System.out.println(super.nome + "Domina o centro do tabuleiro");
	}
	
	@Override
	public void correr()
	{
		System.out.println(super.nome + " Ele não corre! Ele pensa");
	}
}
