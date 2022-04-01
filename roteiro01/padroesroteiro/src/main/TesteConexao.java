package main;
import roteiro1.parte3.RelatorioReserva;

import roteiro1.parte3.ServicoQuarto;
import roteiro1.parte3.ServicoReserva;
import databases.MysqlConnection;
import databases.OracleConnection;
import databases.SqlServer;


public class TesteConexao {

	public static void main(String[] args) {
		//OracleConnection connection = new OracleConnection();
		//MysqlConnection connection = new MysqlConnection();
		SqlServer connection = new SqlServer();

		ServicoQuarto quarto = new ServicoQuarto(connection);
		quarto.verificarQuarto();
		
		ServicoReserva reserva = new ServicoReserva(connection);
		reserva.criarReserva();
		
		RelatorioReserva relatorio = new RelatorioReserva(connection);
		relatorio.gerarRelatorio();
	}
	
}
