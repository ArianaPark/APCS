class Static
{
  public static void main ( String[] args )
  {
     System.out.println("\nMonster count == " + Monster.getCount() + "\n\n");

     Ghost casper = new Ghost("Casper");
     System.out.println(casper);
     System.out.println("Monster count == " + casper.getCount() + "\n");

     Witch witch= new Witch("Harriet");
     System.out.println(witch);
     System.out.println("Monster count == " + witch.getCount() + "\n");

     Ghost gone = new Ghost();
     Ghost gtwo = new Ghost();
     Ghost gthree = new Ghost();
     Witch west = new Witch("Wicked Witch Of the West");
     System.out.println(west);
     System.out.println("Monster count == " + west.getCount() + "\n");
  }
}