package roteiro9.parte6;

import roteiro9.parte5.legado.SistemaEstoque;

public abstract class SistemaEstoqueAdapter
{
	protected SistemaEstoque sistemaEstoque;
	
	public void diminuirQuantidadeItem()
	{
		this.sistemaEstoque.removerItemEstoque();
	}

	public void aumentarQuantidadeItem()
	{
		this.sistemaEstoque.adicionarItemEstoque();
	}
}
