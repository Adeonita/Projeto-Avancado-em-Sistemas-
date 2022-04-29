package roteiro3.parte3;

public class SoccerPlayer extends Player implements Runnable
{
	public SoccerPlayer (String nome)
	{
		super(nome);
	}
	
	public void definirTatica()
	{
		System.out.println(super.nome + " Trabalha em equipe!");
	}
	
	@Override
	public void correr()
	{
		System.out.println(super.nome + " Corre muito durante o jogo!");
	}
}
