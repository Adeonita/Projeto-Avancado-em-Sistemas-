package roteiro9.parte5;

import roteiro9.parte5.legado.SistemaContabil;

public abstract class SistemaContabilAdapter
{
	protected SistemaContabil sistemaContabil;
	
	public void finalizarVenda()
	{
		this.sistemaContabil.registrarVenda();
	}
	
	public void registrarImposto()
	{
		this.sistemaContabil.calcularImposto();
	}
}
