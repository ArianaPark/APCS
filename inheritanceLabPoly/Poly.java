public class Poly
{
	public static void main ( String[] args )
	{
	   Monster x = new Ghost("Casper");
	   System.out.println(x);

	   x=new Witch("Harriet");
	   System.out.println(x);

	   x=new Ghost("Johny Cash");
	   System.out.println(x);

	   x=new Ghost("Chucky");
	   System.out.println(x);
	   ((Ghost)x).whoot();  //what is the problem?
   }
}