public class InheritOneRunner
{
  public static void main ( String[] args )
  {
		//test code in the main method
		A one = new A();
		System.out.println(one);
		one.setX(11);
		System.out.println(one.getX());
		one = new B();
		System.out.println(one);    
		one.setX(24);
		System.out.println(one.getX());		
  }
}