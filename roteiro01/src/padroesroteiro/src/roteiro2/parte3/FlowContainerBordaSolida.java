package roteiro2.parte3;


public class FlowContainerBordaSolida extends FlowContainer {

	public FlowContainerBordaSolida() {
		super();
	}
	
	@Override
	public void doLayout() {
		System.out.println("O container utilizado é o FlowContainer");
		System.out.println("Esse container contem bordas solidas");
		System.out.println("Estes são os elementos presentes no container");
		System.out.println(super.elements);
		System.out.println("Usando o método dispose como heranca para fechar o container");
		this.dispose();
		System.out.println("--------------------------------");
	}
}
