package roteiro9.parte4;

public class ControladorContabil
{
	private ISistemaContabilAdapter sistemaContabilAdapter;
	
	public ControladorContabil()
	{
		System.out.println("Controlador de Sistema Contabil Criado \n");
		System.out.println("************************************************** \n");
	}
	
	public void criarSistemaContabilAdapter(String nome)
	{
		if(nome.equals("IBM"))
			this.sistemaContabilAdapter = new SistemaContabilAdapterIBM();
		else if (nome.equals("DELL"))
			this.sistemaContabilAdapter = new SistemaContabilAdapterDELL();
		else if (nome.equals("SAP"))
			this.sistemaContabilAdapter = new SistemaContabilAdapterSAP();
	}
	
	public void calcularImposto()
	{
		this.sistemaContabilAdapter.registrarImposto();
	}
}
