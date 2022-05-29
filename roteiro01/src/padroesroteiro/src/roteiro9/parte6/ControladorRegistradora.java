package roteiro9.parte6;

import roteiro9.parte3.ISistemaEstoqueAdapter;

public class ControladorRegistradora
{
	private AdapterFactory factory;
	private SistemaContabilAdapter sistemaContabil;
	private SistemaEstoqueAdapter sistemaEstoqueAdapter;

	
	public void criarSistemaContabilAdapter(String nome)
	{
		this.factory.criarSistemaContabilAdapter(nome);
	}
	
	public void criarSistemaEstoqueAdapter(String nome)
	{
		this.factory.criarsistemaEstoqueAdapter(nome);
	}
	
	public void registrarVendaSistemaContabil()
	{
		this.sistemaContabil.finalizarVenda();
	}
	
	public void diminuirQuantidadeItem()
	{
		this.sistemaEstoqueAdapter.diminuirQuantidadeItem();
	}
}
