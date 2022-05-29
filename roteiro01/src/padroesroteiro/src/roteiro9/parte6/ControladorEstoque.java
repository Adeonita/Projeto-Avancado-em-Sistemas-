package roteiro9.parte6;

public class ControladorEstoque
{
	private AdapterFactory factory;
	
	public ControladorEstoque()
	{
		System.out.println("Controlador de Sistema Contabil Criado \n");
		System.out.println("************************************************** \n");
		
		this.factory = AdapterFactory.getInstance();
	}
	
	public void criarSistemaEstoqueAdapter(String nome)
	{
		this.factory.criarsistemaEstoqueAdapter(nome);
	}
}
