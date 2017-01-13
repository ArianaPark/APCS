class Witch extends Monster
{
	public Witch( String name )
	{
		super(name);
	}

	public Witch( String name, int age )
	{
		//what code should be here
		super(name,age);
	}

	public void showPrivate()
	{
		System.out.println("\n\nshowPrivate() - accessing myName");
		  
		//uncomment the following line
		System.out.println(getName());  	//name has private access in Monster
	}

	public void showProtected()
	{
		System.out.println("\n\nshowProtected() - accessing myAge");
		myAge = 90876;
		System.out.println(myAge);
	}
}