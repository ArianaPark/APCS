import static java.lang.System.*;

class Monster
{
	private String myName;   	// inherited, but not accessible in sub class

	public Monster() { }

	public Monster( String name )
	{
		myName = name;
	}

	public final void overRide( )
	{
		System.out.println("overRide in Monster\n");
	}

	public String toString()
	{
		return "Monster name :: " + myName + "\n";
	}
}