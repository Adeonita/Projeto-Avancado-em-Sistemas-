package roteiro9.parte5;

import roteiro9.parte5.legado.SistemaContabil;

public class SistemaContabilAdapterIBM extends SistemaContabilAdapter
{	
	public SistemaContabilAdapterIBM()
	{
		this.sistemaContabil = new SistemaContabil("IBM");
	}	
}
