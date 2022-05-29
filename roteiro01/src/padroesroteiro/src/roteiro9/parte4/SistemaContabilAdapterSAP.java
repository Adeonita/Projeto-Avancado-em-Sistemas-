package roteiro9.parte4;

import roteiro9.parte4.legado.SistemaContabil;

public class SistemaContabilAdapterSAP implements ISistemaContabilAdapter
{
	private SistemaContabil sistemaContabil;
	
	public SistemaContabilAdapterSAP()
	{
		this.sistemaContabil = new SistemaContabil("SAP");
	}

	@Override
	public void finalizarVenda() {
		this.sistemaContabil.registrarVenda();
	}

	@Override
	public void registrarImposto() {
		this.sistemaContabil.calcularImposto();
	}
}
