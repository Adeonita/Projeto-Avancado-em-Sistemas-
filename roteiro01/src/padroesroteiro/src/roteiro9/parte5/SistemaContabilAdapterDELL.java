package roteiro9.parte5;

import roteiro9.parte5.legado.SistemaContabil;

public class SistemaContabilAdapterDELL extends SistemaContabilAdapter
{	
	public SistemaContabilAdapterDELL()
	{
		this.sistemaContabil = new SistemaContabil("DELL");
	}	
}
