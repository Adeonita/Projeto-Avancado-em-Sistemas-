package roteiro9.parte6;

import roteiro9.parte5.legado.SistemaEstoque;

public class SistemaEstoqueAdapterSAP extends SistemaEstoqueAdapter
{
	public SistemaEstoqueAdapterSAP()
	{
		this.sistemaEstoque = new SistemaEstoque("SAP");
	}
}
