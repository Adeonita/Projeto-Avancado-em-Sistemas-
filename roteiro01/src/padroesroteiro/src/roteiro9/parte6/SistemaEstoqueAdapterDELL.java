package roteiro9.parte6;

import roteiro9.parte5.legado.SistemaEstoque;

public class SistemaEstoqueAdapterDELL extends SistemaEstoqueAdapter
{
	public SistemaEstoqueAdapterDELL()
	{
		this.sistemaEstoque = new SistemaEstoque("DELL");
	}
}
