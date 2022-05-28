package roteiro7.parte1;

public class TesteComFacede
{
	public static void main(String[] args)
	{
		Facede facede = Facede.getInstance();
				
		facede.registrarCliente(222, "Jose");
		
		facede.comprar(1, 222);
		facede.comprar(2, 222);
		facede.finalizarCompra(222);
	}
}
