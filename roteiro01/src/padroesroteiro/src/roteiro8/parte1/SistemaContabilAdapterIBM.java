package roteiro8.parte1;

public class SistemaContabilAdapterIBM implements ISistemaContabilAdapter
{
	private SistemaContabilLegado sistemaContabil;
	
	public SistemaContabilAdapterIBM()
	{
		this.sistemaContabil = new SistemaContabilLegado("IBM");
	}
	
	@Override
	public void finalizarVenda()
	{
		this.sistemaContabil.registrarVenda();
	}
	
	@Override
	public void registrarImposto()
	{
		this.sistemaContabil.calcularImposto();
	}
}
