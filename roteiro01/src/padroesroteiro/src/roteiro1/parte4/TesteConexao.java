package roteiro1.parte4;

//import databases.MysqlConnection;
//import databases.OracleConnection;
import roteiro1.parte4.databases.*;

public class TesteConexao {

	public static void main(String[] args) {
//		MysqlConnection connection = new MysqlConnection();
//		OracleConnection connection = new OracleConnection();
		SqlServer connection = new SqlServer();

		ServicoQuarto quarto = new ServicoQuarto(connection);
		quarto.verificarQuarto();
		
		ServicoReserva reserva = new ServicoReserva(connection);
		reserva.criarReserva();
		
		RelatorioReserva relatorio = new RelatorioReserva(connection);
		relatorio.gerarRelatorio();
	}
	
}
