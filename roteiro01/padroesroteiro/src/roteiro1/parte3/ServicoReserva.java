package roteiro1.parte3;

//import roteiro1.parte3.Connection;
import databases.Connection;


public class ServicoReserva {
	private Connection connection;
	
	public ServicoReserva(Connection connection) {
		this.connection = connection;
	}
	
	public void criarReserva() {
		this.connection.connect();
		System.out.println("Lógica de negócio para Reserva do Quarto");
	}
}
