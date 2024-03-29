package roteiro2.parte2;

import java.util.ArrayList;
import java.util.List;

public class FlowContainerBordaPontilhada extends Container {
	private List<Component> elements;
	
	public FlowContainerBordaPontilhada() {
		this.elements = new ArrayList<Component>();
	}
	
	@Override
	public void addComponent(Component component) {
		this.elements.add(component);
	}
	
	@Override
	public void removeComponent(Component component) {
		this.elements.remove(component);
	}
	
	@Override
	public void doLayout() {
		System.out.println("O container utilizado é o FlowContainerBordaPontilhada");
		System.out.println("Estes são os elementos presentes no container");
		System.out.println(this.elements);
		System.out.println("Usando o método dispose como heranca para fechar o container");
		this.dispose();
		System.out.println("--------------------------------");
	}
}
