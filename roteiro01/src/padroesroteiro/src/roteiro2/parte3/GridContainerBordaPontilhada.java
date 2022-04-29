package roteiro2.parte3;

import java.util.Arrays;

public class GridContainerBordaPontilhada extends GridContainer {
	
	public GridContainerBordaPontilhada(int lineMax, int columnMax) {
		super(lineMax, columnMax);
	}
	
	@Override
	public void doLayout() {
		System.out.println("O Container utilizado é o GridContainer");
		System.out.println("Esse container contem bordas pontilhadas");
		System.out.println("Estes são os elementos presentes no container"); 
		System.out.println(Arrays.deepToString(super.elements)); 
		System.out.println("Usando o método dispose como herança para fechar o container"); 
		this.dispose(); 
		System.out.println("--------------------------------");
	};
}
