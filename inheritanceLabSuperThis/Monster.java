import static java.lang.System.*;

class Monster
{
	private String myName;

	public Monster()
	{
		this("Monster");
	}

	public Monster( String name )
	{
		myName = name;
	}

	public void fun( )
	{
		out.println("Monster fun");
	}

	public String toString()
	{
		return myName + " ";
	}
}