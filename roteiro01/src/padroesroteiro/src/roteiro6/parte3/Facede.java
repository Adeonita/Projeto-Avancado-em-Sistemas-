package roteiro6.parte3;

public class Facede
{
	private Database db;
	private Cliente cliente;
	private Produto produto;
	
	public Facede()
	{
		this.db = new Database();
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
