package roteiro2.parte4;

import java.util.Arrays;

public class GridContainer extends Container {
	protected Component[][] elements;
	private int columnCounter = 0;
	private int lineCounter = 0;
	private int columnMax; 
	private int lineMax;
	
	public GridContainer(int lineMax, int columnMax) {
		this.lineMax = lineMax;
		this.columnMax = columnMax;
		
		this.elements = new Component[lineMax][columnMax];
	}
	
	public GridContainer(int lineMax, int columnMax, Borda borda) {
		this.lineMax = lineMax;
		this.columnMax = columnMax;
		super.borda = borda;
		
		this.elements = new Component[lineMax][columnMax];
	}
	
	@Override
	public void addComponent(Component component) {
		if (this.lineCounter == this.lineMax && this.columnCounter == this.columnMax) { 
			System.out.println("Não é possivel adicionar novos elementos"); 
		} else {
			this.elements[this.lineCounter][this.columnCounter] = component; 
			this.columnCounter++; 
			if (columnCounter == this.columnMax) { 
				this.lineCounter++; 
				if (this.lineCounter < this.lineMax) { 
					this.columnCounter = 0; 
				} 
			} 
		}
	}
	
	@Override
	public void removeComponent(Component component) {
		for (int i = 0; i < this.lineMax; i++) {
			for (int j = 0; j < this.columnMax; j++) {
				if (this.elements[i][j] == component) {
					this.elements[i][i] = null; 
				} 
			} 
		}
		
	};
	
	@Override
	public void doLayout() {
		System.out.println("O Container utilizado é o GridContainer");
		
		if(this.borda != null) {
			this.borda.gerarBorda();
		}
		
		System.out.println("Estes são os elementos presentes no container"); 
		System.out.println(Arrays.deepToString(elements)); 
		System.out.println("Usando o método dispose como herança para fechar o container");
		this.dispose(); 
		System.out.println("--------------------------------");
	};
	
}
