import static java.lang.System.*;

class Monster
{
	private String myName;

	public Monster()
	{
		myName = "Monster";
	}

	public Monster( String name )
	{
		myName = name;
	}

	public String toString()
	{
		return "Monster name :: " + myName + "\n";
	}
}