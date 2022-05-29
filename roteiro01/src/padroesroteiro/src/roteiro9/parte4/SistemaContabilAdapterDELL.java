package roteiro9.parte4;

import roteiro9.parte3.legado.SistemaContabil;

public class SistemaContabilAdapterDELL implements ISistemaContabilAdapter
{
	private SistemaContabil sistemaContabil;
	
	public SistemaContabilAdapterDELL()
	{
		this.sistemaContabil = new SistemaContabil("Dell");
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
