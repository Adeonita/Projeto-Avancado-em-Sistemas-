package roteiro1.parte1;
import roteiro1.parte1.MysqlConnection;

public class RelatorioReserva {
	private MysqlConnection connection;

	public RelatorioReserva() {
		this.connection = new MysqlConnection();
	}
	
	public void gerarRelatorio() {
		this.connection.connect();
		System.out.println("Lógica de negócio para geração do relatório");
	}
	
}
