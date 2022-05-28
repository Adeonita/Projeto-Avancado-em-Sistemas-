package roteiro7.parte1;

import roteiro5.parte3.LazySingleton;

public class Facede
{
	private Database db;
	private Cliente cliente;
	private Produto produto;
	private static Facede instance;
	
	private Facede()
	{
		this.db = new Database();
	}
	
	public static Facede getInstance()
	{
		if (instance == null) {
			instance = new Facede();
		}
		
		return instance;
	}
	
	public void registrarCliente(int id, String nome)
	{
		this.cliente = new Cliente(id, nome);
			
		this.db.addCliente(this.cliente);
	}
	
	public void comprar(int productId, int clientId)
	{
		this.cliente = db.selectCliente(clientId);
		this.produto = db.selectProduto(productId);
		
		this.cliente.getCarrinho().addProduto(this.produto);
	}
	
	public void finalizarCompra(int clientId)
	{
		this.cliente = db.selectCliente(clientId);
		
		double total = this.cliente.calcularTotal();
		
		db.processarPagamento(cliente, total);
	}
}
