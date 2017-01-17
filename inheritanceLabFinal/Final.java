public class Final
{
  public static void main ( String[] args )
  {
     Monster monster = new Monster("Monster");
     System.out.println(monster);
     monster.overRide();
       	
     Monster witch = new Witch("Harriet");
     System.out.println(witch);
     witch.overRide();
  }
}