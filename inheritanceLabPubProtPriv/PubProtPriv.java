class PubProtPriv
{
	public static void main ( String[] args )
	{
		Witch witch = new Witch("Harriet",21);
		System.out.println(witch);  	//why does this not show Harriet and 21??

		witch.showProtected();
		
		witch.showPrivate();
	}
}
