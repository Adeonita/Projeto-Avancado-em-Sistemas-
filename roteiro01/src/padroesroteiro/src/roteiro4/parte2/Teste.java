package roteiro4.parte2;

public class Teste 
{
	public static void main(String[] args)
	{
		Arma pistola = new Pistola();
		Arma fuzil = new Fuzil();
		Arma rifle = new Rifle();
		Arma shotGun = new ShotGunAdapter();
		
		Atirador atirador01 = new Atirador("Sniper Joaquim", pistola);
		System.out.println("\n" + atirador01.getNome() + " brincando com a Pistola");
		atirador01.carregarArma();
		atirador01.fazerMira();
		atirador01.usarArma();
		
		atirador01.setArma(fuzil);
		System.out.println("\n" + atirador01.getNome() + " brincando com a Fuzil");
		atirador01.carregarArma();
		atirador01.fazerMira();
		atirador01.usarArma();
		
		atirador01.setArma(rifle);
		System.out.println("\n" + atirador01.getNome() + " brincando com a Rifle");
		atirador01.carregarArma();
		atirador01.fazerMira();
		atirador01.usarArma();
		
		atirador01.setArma(shotGun);
		System.out.println("\n" + atirador01.getNome() + " brincando com a ShotGun");
		atirador01.carregarArma();
		atirador01.fazerMira();
		atirador01.usarArma();
		
	}
}
