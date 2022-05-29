package roteiro8.parte3;

public class TesteControlador
{
	public static void main(String[] args)
	{
		testeControladorContabil();
		testeControladorEstoque();
	}
	
	public static void testeControladorContabil()
	{
		System.out.println("Criando o Controlador Contabil");
		
		ControladorContabil controladorContabil = new ControladorContabil();
		
		System.out.println("Teste de Integração do Controlador Contabil - Sistema Contabil DELL");
		
		controladorContabil.criarSistemaContabilAdapter("DELL");
		controladorContabil.calcularImposto();
		
		System.out.println("Teste de Integração do Controlador Contabil - Sistema Contabil IBM");
		
		controladorContabil.criarSistemaContabilAdapter("IBM");
		controladorContabil.calcularImposto();
	}
	
	public static void testeControladorEstoque()
	{
		System.out.println("Criando o Controlador de Estoque");
		
		ControladorEstoque controladorEstoque = new ControladorEstoque();
		
		System.out.println("Teste de Integração do Controlador de Estoque - Sistema de Estoque DELL");
		
		controladorEstoque.criarSistemaEstoqueAdapter("DELL");
		controladorEstoque.aumentarQuantidadeItem();
		
		System.out.println("Teste de Integração do Controlador de Estoque - Sistema de Estoque IBM");
		
		controladorEstoque.criarSistemaEstoqueAdapter("IBM");
		controladorEstoque.aumentarQuantidadeItem();
	}
	
	public static void testeControladorRegistradora()
	{
		System.out.println("Criando o Controlador da Registradora");
		
		ControladorRegistradora controladorRegistradora = new ControladorRegistradora();

		System.out.println("Teste de Integração do Controlador Regitradora - Sistema de Estoque DELL");

		controladorRegistradora.criarSistemaContabilAdapter("DELL");
		controladorRegistradora.diminuirQuantidadeItem();
		
		System.out.println("Teste de Integração do Controlador Regitradora - Sistema de Estoque IBM");
		
		controladorRegistradora.criarSistemaContabilAdapter("IBM");
		controladorRegistradora.diminuirQuantidadeItem();
		
		System.out.println("Teste de Integração do Controlador Regitradora - Sistema Contabil DELL");
		
		controladorRegistradora.criarSistemaContabilAdapter("DELL");
		controladorRegistradora.registrarVendaSistemaContabil();
		
		
		System.out.println("Teste de Integração do Controlador Regitradora - Sistema Contabil IBM");

		controladorRegistradora.criarSistemaContabilAdapter("IBM");
		controladorRegistradora.registrarVendaSistemaContabil();
	}
}
