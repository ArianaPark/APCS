/**
 *Ariana Park
 */
import java.util.Scanner;
import java.util.Arrays;
public class ListRunner
{
    public ListRunner(){
    }
    
    public static void main(String[] args){
        StudentList sl = new StudentList(3);
        Scanner input = new Scanner(System.in);
        String ansStr;
        int ansInt;
        double ansDub;
        Student student;
        while(true){
            System.out.println("What would you like to do?");
            System.out.println("-Add Student to List (1)");
            ansStr = input.next();
            if(ansStr.equals("1")){
                System.out.println("What is the student's ID?");
                ansInt = input.nextInt();
                System.out.println("What is the student's GPA?");
                ansDub = input.nextDouble();
                System.out.println("What is the student's name?");
                ansStr = input.next();
                Student stu = new Student(ansInt,ansDub,ansStr);
            }
        }
    }
}