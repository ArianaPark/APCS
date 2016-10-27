
/**
 * Ariana Park
 */
import java.util.Scanner;
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
        while(!ans.equals("quit")){
            System.out.println("Please input something or \"quit\". ");
            System.out.println("You said: " + ans); //?? not printing anything
        }
    }
}
