
public class RayGun extends Weapon 
{
	
	public RayGun(String Name)
	{
		super(Name);
	}
	public RayGun()
	{
	}

	@Override
	public void attackType() 
	{
		
	}

	@Override
	public void range() 
	{
		
	}
	public void fire()
	{
		System.out.println("TuT TuT");
	}
	
	public void canHolster()
	{
		System.out.println("Can't holster");
	}

}
