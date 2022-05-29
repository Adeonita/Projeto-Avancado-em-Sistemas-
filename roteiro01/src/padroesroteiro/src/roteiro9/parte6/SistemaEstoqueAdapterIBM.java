package roteiro9.parte6;

import roteiro9.parte5.legado.SistemaEstoque;

public class SistemaEstoqueAdapterIBM extends SistemaEstoqueAdapter
{
	public SistemaEstoqueAdapterIBM()
	{
		this.sistemaEstoque = new SistemaEstoque("IBM");
	}
}
