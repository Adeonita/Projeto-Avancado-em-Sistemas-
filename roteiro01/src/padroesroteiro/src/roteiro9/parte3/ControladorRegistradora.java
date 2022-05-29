package roteiro9.parte3;

public class ControladorRegistradora
{
	private ISistemaContabilAdapter sistemaContabilAdapter;
	private ISistemaEstoqueAdapter sistemaEstoqueAdapter;
	
	public ControladorRegistradora()
	{
		System.out.println("Controlador de Sistema Registradora Criado");
		System.out.println("************************************************** \n");
	}
	
	public void criarSistemaContabilAdapter(String nome)
	{
		if(nome.equals("IBM"))
			this.sistemaContabilAdapter = new SistemaContabilAdapterIBM();
		else
			if (nome.equals("DELL"))
				this.sistemaContabilAdapter = new SistemaContabilAdapterDELL();	
	}
	
	public void criarSistemaEstoqueAdapter(String nome)
	{
		if(nome.equals("IBM"))
			this.sistemaEstoqueAdapter = new SistemaEstoqueAdapterIBM();
		else
			if (nome.equals("DELL"))
				this.sistemaEstoqueAdapter = new SistemaEstoqueAdapterDELL();
	}
	
	public void diminuirQuantidadeItem()
	{
		this.sistemaEstoqueAdapter.diminuirQuantidadeItem();
	}
	
	public void registrarVendaSistemaContabil()
	{
		this.sistemaContabilAdapter.finalizarVenda();
	}
}