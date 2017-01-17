import static java.lang.System.*;

class Monster
{
   private String myName;
   private static int count = 0;   //all Monsters share this var

   public Monster()
   {
     myName="";
     count++;
   }
   public Monster( String name )
   {
     myName = name;
     count++;
   }

   public static int getCount( )
   {
     return count;
   }

   public String toString()
   {
      return myName + " " + count;
   }
}