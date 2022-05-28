package roteiro6.parte1;

public class TesteSemFacede
{
	public static void main(String args[])
	{
		Database db = new Database();
		
		Cliente cliente01 = new Cliente(1, "Jose");
		db.addCliente(cliente01);

		CarrinhoCompra carrinho = new CarrinhoCompra();
		cliente01.setCarrinho(carrinho);
		
		Produto p01 = db.selectProduto(1);
		Produto p02 = db.selectProduto(2);
		
		cliente01.getCarrinho().addProduto(p01);
		cliente01.getCarrinho().addProduto(p02);
		
		double total = cliente01.getCarrinho().getTotalCompra();
		db.processarPagamento(cliente01, total);
	}
}
