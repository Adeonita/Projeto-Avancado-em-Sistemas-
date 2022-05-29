package roteiro9.parte2;

public class TesteControlador
{
	public static void main(String[] args)
	{
		testeControladorContabil();
		testeControladorEstoque();
	}
	
	public static void testeControladorContabil()
	{
		System.out.println("\nCriando o Controlador Contabil... \n");
		
		ControladorContabil controladorContabil = new ControladorContabil();
		
		System.out.println("Teste de Integração do Controlador Contabil - Sistema Contabil DELL");
		
		controladorContabil.criarSistemaContabilAdapter("DELL");
		controladorContabil.calcularImposto();
		
		System.out.println("Teste de Integração do Controlador Contabil - Sistema Contabil IBM");
		
		controladorContabil.criarSistemaContabilAdapter("IBM");
		controladorContabil.calcularImposto();
		
		System.out.println("================================================== \n");
	}
	
	public static void testeControladorEstoque()
	{

		System.out.println("Criando o Controlador de Estoque...");
		
		ControladorEstoque controladorEstoque = new ControladorEstoque();
		
		System.out.println("Teste de Integração do Controlador de Estoque - Sistema de Estoque DELL");
		
		controladorEstoque.criarSistemaEstoqueAdapter("DELL");
		controladorEstoque.aumentarQuantidadeItem();
		
		System.out.println("Teste de Integração do Controlador de Estoque - Sistema de Estoque IBM");
		
		controladorEstoque.criarSistemaEstoqueAdapter("IBM");
		controladorEstoque.aumentarQuantidadeItem();
	}
}