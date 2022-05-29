package roteiro9.parte4;

import roteiro9.parte3.legado.SistemaContabil;

public class SistemaContabilAdapterIBM implements ISistemaContabilAdapter
{
	private SistemaContabil sistemaContabil;
	
	public SistemaContabilAdapterIBM()
	{
		this.sistemaContabil = new SistemaContabil("IBM");
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
