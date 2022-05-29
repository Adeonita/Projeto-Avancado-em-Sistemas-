package roteiro9.parte1;

public class TesteControlador
{
	public static void main(String[] args)
	{
		testeControladorContabil();
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
	}
}
