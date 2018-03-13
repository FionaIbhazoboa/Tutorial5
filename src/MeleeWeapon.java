
public class MeleeWeapon extends Weapon implements ICanHolster 
{
	public MeleeWeapon(String Name)
	{
		super(Name);
	}
	public MeleeWeapon()
	{	
	}
	
	public void strike(){}
	
	@Override
	public void canHolster()
	{
		System.out.println("Can holster");
	}
	
	@Override
	public void attackType() 
	{
		
		
	}
	@Override
	public void range() 
	{
		
	}
	
}
