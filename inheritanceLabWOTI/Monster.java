import static java.lang.System.*;

class Monster
{
	private String myName = "long way to go for a toString()";

	public Monster()
	{
		myName = "Monster";    //uncomment and recompile and run
	}

	public Monster( String name )
	{
		myName = name;
	}

	public String toString( )
	{
		return myName;
	}
}