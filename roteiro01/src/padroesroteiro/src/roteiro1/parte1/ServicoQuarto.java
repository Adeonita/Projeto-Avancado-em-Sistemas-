package roteiro1.parte1;
import roteiro1.parte1.MysqlConnection;


public class ServicoQuarto {
	private MysqlConnection connection;
	
	public ServicoQuarto() {
		this.connection = new MysqlConnection();
	}
	
	public void verificarQuarto() {
		this.connection.connect();
		System.out.println("Lógica de negócio para o Serviço de Quarto");
	}
	
}
