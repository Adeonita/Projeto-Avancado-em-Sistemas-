package roteiro9.parte6;

public class ControladorContabil
{
	private SistemaContabilAdapter sistemaContabilAdapter;
	private AdapterFactory factory;
	
	public ControladorContabil()
	{
		System.out.println("Controlador de Sistema Contabil Criado \n");
		System.out.println("************************************************** \n");
		
		this.factory = AdapterFactory.getInstance();
	}
	
	public void criarSistemaContabilAdapter(String nome)
	{
		this.factory.criarSistemaContabilAdapter(nome);
	}
	
	public void calcularImposto()
	{
		this.sistemaContabilAdapter.registrarImposto();
	}
	
}
