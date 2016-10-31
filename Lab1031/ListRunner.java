/**
 *Ariana Park
 *10/28/16
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
        int quit = 0;
        while(quit==0){
            System.out.println("\nPlease select one of the following, or quit(q): ");
            System.out.println("1) Add Student\n2) Print Student List\n3) Delete Student");
            ansStr = input.next();
            if(ansStr.equals("1")){
                System.out.println("What is the student's ID?");
                ansInt = input.nextInt();
                System.out.println("What is the student's GPA?");
                ansDub = input.nextDouble();
                System.out.println("What is the student's name?");
                ansStr = input.next();
                Student stu = new Student(ansInt,ansDub,ansStr);
                sl.addStudent(stu);
            }
            else if(ansStr.equals("2")){
                sl.printStuList();
            }
            else if(ansStr.equals("3")){
                System.out.println("What student do you want to delete? (name)");
                ansStr = input.next();
                sl.deleteStudent(ansStr);
            }
            else if(ansStr.equals("q")){
                quit = -1;
            }
        }
    }
}