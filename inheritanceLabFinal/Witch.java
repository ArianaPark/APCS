class Witch extends Monster
{
	public Witch( String name )
	{
		super(name);
	}

	//this will not compile
	/*
	public void overRide( )
	{
		System.out.println("overRide in Witch\n");
	}
	*/
	

	public String toString()
	{
		return "Witches are the best!!!!!\n";
	}
}