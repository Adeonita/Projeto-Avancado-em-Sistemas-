package roteiro2.parte1;

public abstract class Container {
	public abstract void addComponent(Component component);
	public abstract void removeComponent(Component component);
	public abstract void doLayout();
	
	public void dispose() {
		System.out.println("Fechando o Container");
	}
}
