/**
 *Ariana Park
 *10/28/16
 */
import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;

public class ListRunner
{
    public ListRunner(){
    }
    
    public static void main(String[] args){
        StudentList sl = new StudentList();
        Scanner input = new Scanner(System.in);
        String ansStr;
        int ansInt;
        double ansDub;
        Student student;
        int quit = 0;
        while(quit==0){
            System.out.println("\nPlease select one of the following, or quit(q): ");
            System.out.println("1) Add Student\n" + 
            "2) Print Student List\n" + 
            "3) Print A Student\n" + 
            "4) Edit A Student\n" +
            "5) Delete A Student\n" + 
            "6) Clear List");
            ansStr = input.next();
            if(ansStr.equals("1")){ //BM1
                System.out.println("What is the student's ID?");
                ansInt = input.nextInt();
                System.out.println("What is the student's GPA?");
                ansDub = input.nextDouble();
                System.out.println("What is the student's name?");
                ansStr = input.next();
                Student stu = new Student(ansInt,ansDub,ansStr);
                sl.addStudent(stu);
            }
            else if(ansStr.equals("2")){ //BM1
                sl.printStuList();
            }
            else if(ansStr.equals("3")){
                System.out.println("What student would you like to print? (name)");
                ansStr = input.next();
                sl.printStudent(ansStr);
            }
            else if(ansStr.equals("4")){
                boolean a = true;
                while(a==true){
                    
                }
            }
            else if(ansStr.equals("5")){ //BM3
                System.out.println("What student do you want to delete? (name)");
                ansStr = input.next();
                sl.deleteStudent(ansStr);
            }
            else if(ansStr.equals("6")){
                System.out.println("Are you sure you want to clear the student list? (y/n)");
                ansStr = input.next();
                if(ansStr=="y"){
                    sl.clearList();
                }
            }
            else if(ansStr.equals("q")){
                quit = -1;
            }
        }
    }
}