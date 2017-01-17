public class This
{
  public static void main( String[] args )
  {
     Monster thisOne = new Monster();
     System.out.println(thisOne);
     thisOne=new Monster("Sammy");
     System.out.println(thisOne);
     thisOne=new Monster("Benny");
     System.out.println(thisOne);     
  }
}