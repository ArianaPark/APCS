/**
 * Ariana Park
 * 10/28/16
 */
import java.util.Scanner;
public class ScannerClass
{
    
    public ScannerClass(){
    }
    
    //method
    public static void partOne(){
        Scanner input = new Scanner(System.in);
        System.out.println("Please input something or \"quit\". ");
        String ans = input.next();
        while(!ans.equals("quit")){
            System.out.println("You said: " + ans + "\nPlease input something or \"quit\". ");
            ans = input.next();
        }
    }
    
    public static void partTwo(){
        Scanner input = new Scanner(System.in);
        System.out.println("Please input something or \"quit\". ");
        String ans = input.nextLine();
        while(!ans.equals("quit")){
            if(ans.indexOf("awesome") != -1){                 
                System.out.println("This is an awesome string: " + ans.indexOf("awesome"));
            }else{
                System.out.println("This is not an awesome string.");
            }
            System.out.println("\nPlease input something or \"quit\". ");
            ans = input.nextLine();
        }
    }
    
    public static void main(String[] args){
        //partOne();
        partTwo();
    }
}