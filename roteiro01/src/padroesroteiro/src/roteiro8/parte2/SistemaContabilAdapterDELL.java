package roteiro8.parte2;

import roteiro8.parte2.legado.SistemaContabil;

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
