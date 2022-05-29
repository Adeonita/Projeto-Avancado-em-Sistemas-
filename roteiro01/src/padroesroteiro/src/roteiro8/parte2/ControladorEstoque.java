package roteiro8.parte2;

public class ControladorEstoque
{
	private ISistemaEstoqueAdapter sistemaEstoqueAdapter;
	
	public ControladorEstoque()
	{
		System.out.println("Controlador de Sistema Estoque Criado \n");
		System.out.println("************************************************** \n");
	}
	
	public void criarSistemaEstoqueAdapter(String nome)
	{
		if(nome.equals("IBM"))
			this.sistemaEstoqueAdapter = new SistemaEstoqueAdapterIBM();
		else
			if (nome.equals("DELL"))
				this.sistemaEstoqueAdapter = new SistemaEstoqueAdapterDELL();
	}
	
	public void aumentarQuantidadeItem()
	{
		this.sistemaEstoqueAdapter.aumentarQuantidadeItem();
	}
}
