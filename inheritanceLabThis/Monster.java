import static java.lang.System.*;

class Monster
{
	private String myName;

	public Monster()
	{
		this("Monster");  //calls method Monster(name)
	}

	public Monster( String name )
	{
		myName = name;
	}

	public String toString()
	{
		return myName + " ";
	}
}