class Ghost extends Monster
{
	public Ghost(  )
	{
		super();  //happens automatically
	}

	public Ghost(String name)
	{
		super(name);
	}

	public void whoot()
	{
		System.out.println("Ghost says whoot!");
	}
}