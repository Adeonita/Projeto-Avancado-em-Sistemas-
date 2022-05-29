package roteiro8.parte1;


public class SistemaContabilAdapterDELL implements ISistemaContabilAdapter
{
	private SistemaContabilLegado sistemaContabil;
	
	public SistemaContabilAdapterDELL()
	{
		this.sistemaContabil = new SistemaContabilLegado("Dell");
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
