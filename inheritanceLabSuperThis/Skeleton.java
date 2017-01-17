class Skeleton extends Monster
{
   private double speed;

   public Skeleton(  )
   {
   	super(); //super() call happens automatically
      speed=100;
   }

   public Skeleton( String name, double speed )
   {
      super(name);       //super refers to the parent object
      this.speed=speed;   //this seperates instance var from parameter
   }

   public void fun( )
   {
      System.out.println("Skeleton fun");
   }

   public void funtest( )
   {
      super.fun();  //calls Monster.fun( )

      this.fun();   //calls Skeleton.fun()
   }

   public String toString()
   {
      return super.toString() + " " + speed;   //super refers to the parent object
   }
}