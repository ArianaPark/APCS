
/**
 * Write a description of class ListRunner here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class ListRunner
{
    public ListRunner(){
    }
    
    public static void main(String[] args){
        StudentList sl = new StudentList();
        Scanner input = new Scanner(System.in);
        String ans;
        while(true){
            System.out.println("What would you like to do?");
            System.out.println("-Add Student to List (1)");
            ans = input.next();
            if(ans.equals("1")){
                System.out.println("What is the student's ID?");
                //ans = input.nextInt();
                //VV fix
                System.out.println("What is the student's GPA?");
                Scanner gpa = new Scanner(System.in);
                System.out.println("What is the student's name?");
                Scanner name = new Scanner(System.in);
            }
        }
    }
}
