package roteiro9.parte2;

import roteiro9.parte1.legado.SistemaContabil;

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
