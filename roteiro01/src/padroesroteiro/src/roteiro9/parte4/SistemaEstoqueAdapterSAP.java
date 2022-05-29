package roteiro9.parte4;

import roteiro9.parte4.legado.SistemaEstoque;

public class SistemaEstoqueAdapterSAP implements ISistemaEstoqueAdapter
{
	private SistemaEstoque sistemaEstoque;

	public SistemaEstoqueAdapterSAP()
	{
		this.sistemaEstoque = new SistemaEstoque("SAP");
	}

	@Override
	public void diminuirQuantidadeItem() {
		this.sistemaEstoque.removerItemEstoque();
	}

	@Override
	public void aumentarQuantidadeItem() {
		this.sistemaEstoque.adicionarItemEstoque();
	}
}
