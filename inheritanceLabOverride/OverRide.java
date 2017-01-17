public class OverRide
{
  public static void main ( String[] args )
  {
     Monster ghost = new Ghost("Casper");
     System.out.println(ghost);
     ghost.overRide();

     Monster witch = new Witch("Harriet");
     System.out.println(witch);
     witch.overRide();
  }
}