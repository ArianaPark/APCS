/**
 * A program to allow students to try out different 
 * String methods. 
 * @author Laurie White
 * @version April 2012
 */
public class StringExplorer
{

    public static void main(String[] args)
    {
//      String sample = "The quick brown fox jumped over the lazy dog.";
//      
//      //  Demonstrate the indexOf method.
//      int position = sample.indexOf("quick");
//      System.out.println ("sample.indexOf(\"quick\") = " + position);
//      
//      //  Demonstrate the toLowerCase method.
//      String lowerCase = sample.toLowerCase();
//      System.out.println ("sample.toLowerCase() = " + lowerCase);
//      System.out.println ("After toLowerCase(), sample = " + sample);
        
        //  Try other methods here:
        String s1 = "I Like Puppies";
        String s2 = "Cats are useless"  ;
        if(s1.indexOf("Puppies")>=0 && s2.indexOf("Cats")>=0)
            System.out.println("I like cats");
        else
            System.out.println("I like puppies");

    }

}
