package roteiro4.parte1;

public class Atirador {
	private String nome;
	private Arma arma;
	
	public Atirador(String nome, Arma arma)
	{
		this.nome = nome;
		this.arma = arma;
	}
	
	public String getNome()
	{
		return this.nome;
	}
	
	public Arma getArma()
	{
		return this.arma;
	}
	
	public void setNome(String nome)
	{
		this.nome = nome;
	}
	
	public void setArma(Arma arma)
	{
		this.arma = arma;
	}
	
	
	public void carregarArma()
	{
		System.out.println("Ação - " + this.nome + " : "); 
		this.arma.carregar();
	}
	
	public void fazerMira()
	{
		System.out.println("Ação - " + this.nome + " : "); 
		this.arma.mirar();
	}
	
	public void usarArma()
	{
		System.out.println("Ação - " + this.nome + " : ");
		this.arma.atirar();
	}
}
