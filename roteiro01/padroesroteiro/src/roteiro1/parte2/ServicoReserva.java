package roteiro1.parte2;
import roteiro1.parte2.OracleConnection;


public class ServicoReserva {
	private OracleConnection connection;
	
	public ServicoReserva() {
		this.connection = new OracleConnection();
	}
	
	public void criarReserva() {
		this.connection.connect();
		System.out.println("Lógica de negócio para Reserva do Quarto");
	}
}
