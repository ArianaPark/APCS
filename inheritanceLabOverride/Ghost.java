class Ghost extends Monster
{
   public Ghost( String name )
   {
      super(name);
   }

   
   //java:57: overRide() in Ghost cannot override overRide() in Monster;
   public void overRide( )
   {
      System.out.println("overRide in Ghost");
      //return 0;		///attempting to use incompatible return type
   }


   public String toString()
   {
      return "Ghosts are the best!!!!!\n";
   }
}