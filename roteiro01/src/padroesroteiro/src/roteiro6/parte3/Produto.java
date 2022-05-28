package roteiro6.parte3;

public class Produto
{
	private int id;
	private String nome;
	private double preco;
	
	public Produto (int id, String nome, double preco)
	{
		this.id = id;
		this.nome = nome;
		this.preco = preco;
	}
	
	@Override 
	public String toString()
	{
		return 	"Id: " + this.id + "\n" +
				"Nome: " + this.nome + "\n" +
				"Preco:  " + this.preco + "\n";
	}
	
	public int getId()
	{
		return this.id;
	}
	
	public String getNome()
	{
		return this.nome;
	}
	
	public double getPreco()
	{
		return this.preco;
	}
	
	public void setId(int id)
	{
		this.id = id;
	}
	
	public void setNome(String nome)
	{
		this.nome = nome;
	}
	
	public void setPreco(double preco)
	{
		this.preco = preco;
	}
}
