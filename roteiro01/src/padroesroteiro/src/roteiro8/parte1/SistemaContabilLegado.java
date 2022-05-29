package roteiro8.parte1;

public class SistemaContabilLegado {
	 private String nome;
	
	    public SistemaContabilLegado(String nome) {
	        this.nome = nome;
	    }
	
	    public void registrarVenda(){
	        System.out.println("Venda Registrada no "+this.nome + " - Sistema Contabil \n");
	    }
	
	    public void calcularImposto(){
	        System.out.println("Imposto calculado no "+this.nome + " - Sistema Contabil \n");
	        
	    }
	    
}

