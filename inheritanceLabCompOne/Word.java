import static java.lang.System.*;

//Word is not a String, but it has a String 
class Word implements Comparable
{
   private String word;  		//Word has a String

   public Word(String w) 
   { 
      word = w; 
   }

   public int compareTo(Object obj) 
   {
      Word other = (Word)obj;    
      if(word.length()>other.word.length())
         return 1;
      else if(word.length()<other.word.length())
         return -1;
      return 0;
   }

   public String toString() { 
   	return word; 
   }
}