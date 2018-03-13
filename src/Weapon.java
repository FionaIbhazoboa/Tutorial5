
public abstract class Weapon 
{
	String Name;
	int damage;
	public Weapon(){}
	public Weapon(String Name)
	{
		this.Name = Name;
	}
	public abstract void attackType();
    public abstract void range();
    
    public void calculateDamage(String attackType, int range)
    {
    	if(attackType.compareTo("melleeAttack") == 0)
    	{
    		range = 0;
    		damage = 10;
    	}
    	else 
    	{
    		switch (range)
    		{
    			case 10: damage = 5;
    				break;
    			case 20: damage = 4;
    				break;
    			case 30: damage = 3;
    				break;
    			case 40: damage = 2;
    				break;
    			default: damage = 1; 
    				break;
    		}
    		
    	}
    	System.out.println("The damage is: " + damage);
    }

}
