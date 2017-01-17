public class SuperThis
{
  public static void main ( String[] args )
  {
     Skeleton skelly = new Skeleton();
     System.out.println(skelly);
     skelly = new Skeleton("Bones",1002);
     System.out.println(skelly);
     skelly.fun();
     skelly.funtest();
  }
}