package roteiro8.parte2;

import roteiro8.parte2.legado.SistemaEstoque;

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
