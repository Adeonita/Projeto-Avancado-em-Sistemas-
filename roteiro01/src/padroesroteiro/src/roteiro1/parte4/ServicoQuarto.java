package roteiro1.parte4;
import roteiro1.parte4.databases.Connection;


public class ServicoQuarto {
	private Connection connection;
	
	public ServicoQuarto(Connection connection) {
		this.connection = connection;
	}
	
	public void verificarQuarto() {
		this.connection.connect();
		System.out.println("Lógica de negócio para o Serviço de Quarto");
	}
	
}
