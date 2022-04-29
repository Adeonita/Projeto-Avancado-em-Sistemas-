package roteiro3.parte4;

public class SoccerPlayer extends Player
{
	public SoccerPlayer (String nome, RunBehavior habilidadeCorrer)
	{
		super(nome, habilidadeCorrer);
	}
	
	public void definirTatica()
	{
		System.out.println(super.nome + " Trabalha em equipe!");
	}
}
