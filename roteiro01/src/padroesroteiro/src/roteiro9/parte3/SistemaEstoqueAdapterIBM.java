package roteiro9.parte3;

import roteiro9.parte3.legado.SistemaEstoque;

public class SistemaEstoqueAdapterIBM implements ISistemaEstoqueAdapter
{
	private SistemaEstoque sistemaEstoque;
	
	public SistemaEstoqueAdapterIBM()
	{
		this.sistemaEstoque = new SistemaEstoque("IBM");
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
