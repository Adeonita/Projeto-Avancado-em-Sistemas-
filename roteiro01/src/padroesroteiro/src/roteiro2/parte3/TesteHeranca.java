package roteiro2.parte3;

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
		gridContainer.addComponent(textBox);
		gridContainer.addComponent(checkBox);
		gridContainer.doLayout();


		Container flowContainer = new FlowContainer();
		flowContainer.addComponent(comboBox);
		flowContainer.addComponent(radioButton);
		flowContainer.addComponent(textField);
		flowContainer.doLayout();	
		
		Container flowContainerBordaPontilhada = new FlowContainerBordaPontilhada();
		flowContainerBordaPontilhada.addComponent(radioButton);
		flowContainerBordaPontilhada.addComponent(comboBox);
		flowContainerBordaPontilhada.addComponent(label);
		flowContainerBordaPontilhada.doLayout();
		
		Container flowContainerBordaSolida = new FlowContainerBordaSolida();
		flowContainerBordaSolida.addComponent(radioButton);
		flowContainerBordaSolida.addComponent(comboBox);
		flowContainerBordaSolida.addComponent(label);
		flowContainerBordaSolida.doLayout();
		
		Container girdContainerBordaSolida = new GridContainerBordaSolida(2,2);
		girdContainerBordaSolida.addComponent(textBox);
		girdContainerBordaSolida.addComponent(checkBox);
		girdContainerBordaSolida.addComponent(label);
		girdContainerBordaSolida.addComponent(button);

		girdContainerBordaSolida.doLayout();
		
		Container girdContainerBordaPontilhada = new GridContainerBordaPontilhada(2,2);
		girdContainerBordaPontilhada.addComponent(textBox);
		girdContainerBordaPontilhada.addComponent(checkBox);
		girdContainerBordaPontilhada.addComponent(label);
		girdContainerBordaPontilhada.addComponent(button);
		girdContainerBordaPontilhada.doLayout();
	}
}
