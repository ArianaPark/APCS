public class WhatsOnTheInside
{
	public static void main ( String[] args )
	{
		GoodWitch bad = new GoodWitch();		//why does this not compile
		System.out.println(bad);
		
		GoodWitch witch = new GoodWitch("Harriet");
		System.out.println(witch);
	}
}