public class CompOne
{
	public static void main ( String[] args )
	{
		Word one = new Word("hello");
		Word two = new Word("high");
		System.out.println(one.compareTo(two));
		System.out.println(two.compareTo(one));
		System.out.println(new Word("high").compareTo(two));					
	}
}