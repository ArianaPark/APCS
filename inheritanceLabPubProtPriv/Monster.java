import static java.lang.System.*;

class Monster
{
	private String myName;   	// inherited, but not accessible in sub class
	protected int myAge;    	// inherited and accessible in sub class

	public Monster()
	{
		this("noname",0);
	}

	public Monster(String name)
	{
		this("noname",45);
	}

	public Monster(String name, int age)
	{
		myName = name;
		myAge = age;
	}
	
	public String getName(){
	    return myName;
	   }

	public String toString()
	{
		return "Monster info :: " + myName + " - " + myAge;
	}
}