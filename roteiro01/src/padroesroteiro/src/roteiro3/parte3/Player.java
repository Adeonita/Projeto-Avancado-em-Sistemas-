package roteiro3.parte3;

public abstract class Player 
{
	protected String nome;
	
	public Player(String nome)
	{
		this.nome = nome;
	}
	
	public void treinar()
	{
		System.out.println(this.nome + " Executando treino!");
	}
	
	public void estiloCompetidor()
	{
		System.out.println(this.nome + " Muito competitivo!");
	}
	
	public abstract void definirTatica();
}
