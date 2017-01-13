import static java.lang.System.*;

class A
{
   private int x;
   
   public A() { 
      x =8;
   }
   
   public void setX(int val)
   {
   	x=val;
   }
   
   public int getX()
   {
   	return x;
   }
   
   public String toString() 
   { 
      return ""+getX();
   }
}