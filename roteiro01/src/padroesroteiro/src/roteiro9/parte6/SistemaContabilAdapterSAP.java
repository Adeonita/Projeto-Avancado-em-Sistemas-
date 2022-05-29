package roteiro9.parte6;

import roteiro9.parte5.legado.SistemaContabil;

public class SistemaContabilAdapterSAP extends SistemaContabilAdapter
{	
	public SistemaContabilAdapterSAP()
	{
		this.sistemaContabil = new SistemaContabil("SAP");
	}	
}
