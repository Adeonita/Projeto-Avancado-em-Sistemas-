package roteiro1.parte3;


public class TesteConexao {

	public static void main(String[] args) {
		OracleConnection connection = new OracleConnection();
		//MysqlConnection connection = new MysqlConnection();

		ServicoQuarto quarto = new ServicoQuarto(connection);
		quarto.verificarQuarto();
		
		ServicoReserva reserva = new ServicoReserva(connection);
		reserva.criarReserva();
		
		RelatorioReserva relatorio = new RelatorioReserva(connection);
		relatorio.gerarRelatorio();
	}
	
}
