package roteiro1.parte3;

//import roteiro1.parte3.Connection;
import databases.Connection;

public class RelatorioReserva {
	private Connection connection;

	public RelatorioReserva(Connection connection) {
		this.connection = connection;
	}
	
	public void gerarRelatorio() {
		this.connection.connect();
		System.out.println("Lógica de negócio para geração do relatório");
	}
	
}
