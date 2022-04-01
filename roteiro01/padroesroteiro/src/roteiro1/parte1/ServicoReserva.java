package roteiro1.parte1;
import roteiro1.parte1.MysqlConnection;


public class ServicoReserva {
	private MysqlConnection connection;
	
	public ServicoReserva() {
		this.connection = new MysqlConnection();
	}
	
	public void criarReserva() {
		this.connection.connect();
		System.out.println("Lógica de negócio para Reserva do Quarto");
	}
}
