
/**
 * Write a description of class ScannerClass here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
import java.util.regex.MatchResult;
public class ScannerClass
{
    //no fields
    
    //constructor
    public ScannerClass(){
    }
    
    //method
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String ans = input.next();
        MatchResult mr = input.match();
        while(!ans.equals("quit")){
            System.out.println("Please input something or \"quit\". ");
            System.out.println("You said: ");
            for(int i=0; i<mr.groupCount();i++){
                System.out.println(mr.group(i));
            }
        }
    }
}
