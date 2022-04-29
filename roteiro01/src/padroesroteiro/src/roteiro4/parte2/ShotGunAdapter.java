package roteiro4.parte2;

import armas.artilharia.ShotGun;

public class ShotGunAdapter extends ShotGun implements Arma
{
	@Override
	public void carregar() 
	{
		this.loadGun();
	}
	
	@Override
	public void mirar() 
	{
		this.shootKill();
	}
	
	@Override
	public void atirar() 
	{
		this.targetEnemy();
	}
}
