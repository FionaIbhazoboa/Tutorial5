
public class ShootingGame 
{
	public static void main(String[] arg)
	{
		MeleeWeapon  meleeWeapon = new MeleeWeapon ("Weapon");
		meleeWeapon.canHolster();
		meleeWeapon.calculateDamage("melleeAttack", 10);
		
		RayGun rayGun = new RayGun();
		rayGun.fire();
		rayGun.canHolster();
		rayGun.calculateDamage("TY", 10);
	}
	

}
