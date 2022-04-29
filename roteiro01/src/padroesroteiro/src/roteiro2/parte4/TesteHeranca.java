package roteiro2.parte4;

public class TesteHeranca {
	
	public static void main(String[] args) {
		
		Component label = new Component("Label");
		Component button = new Component("Button");
		Component textBox = new Component("TextBox");
		Component comboBox = new Component("ComboBox");
		Component checkBox = new Component("CheckBox");
		Component textField = new Component("TextField");
		Component radioButton = new Component("RadioButton");
		BordaSolida bordaSolida = new BordaSolida();
		BordaPontilhada bordaPontilhada = new BordaPontilhada();
		
		Container gridContainer = new GridContainer(2,2, bordaPontilhada);
		gridContainer.addComponent(label);
		gridContainer.addComponent(button);
		gridContainer.addComponent(textBox);
		gridContainer.addComponent(checkBox);
		gridContainer.doLayout();

		Container flowContainer = new FlowContainer(bordaSolida);
		flowContainer.addComponent(comboBox);
		flowContainer.addComponent(radioButton);
		flowContainer.addComponent(textField);
		flowContainer.doLayout();	
		
	}
}
