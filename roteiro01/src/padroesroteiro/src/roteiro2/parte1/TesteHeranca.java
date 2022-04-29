package roteiro2.parte1;

public class TesteHeranca {
	
	public static void main(String[] args) {
		
		Component label = new Component("Label");
		Component button = new Component("Button");
		Component textBox = new Component("TextBox");
		Component comboBox = new Component("ComboBox");
		Component checkBox = new Component("CheckBox");
		Component textField = new Component("TextField");
		Component radioButton = new Component("RadioButton");
		
		Container gridContainer = new GridContainer(2,2);
		gridContainer.addComponent(button);
		gridContainer.addComponent(textBox);
		gridContainer.addComponent(textField);
		gridContainer.addComponent(checkBox);
		
		gridContainer.doLayout();


		Container flowContainer = new FlowContainer();
		flowContainer.addComponent(comboBox);
		flowContainer.addComponent(label);
		flowContainer.addComponent(radioButton);

		flowContainer.doLayout();		
	}
}
