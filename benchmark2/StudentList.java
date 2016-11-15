
/**
 *Ariana Park
 *10/28/16
 */

import java.util.ArrayList;

public class StudentList
{
    private ArrayList<Student> students;
    //1-First Middle Last
    //2-First Last
    //3-Last, First Middle
    //4-Last, First
    public void parseName(String name, Student stu){ //BM2
        if(name.indexOf(",")>=0){//if theres a comma 3/4
            stu.setLast(name.substring(0,name.indexOf(",")));
            if(name.indexOf(" ")!= name.lastIndexOf(" ")){ //if theres a second space 3
                stu.setFirst(name.substring(name.indexOf(" ")+1,name.lastIndexOf(" ")));
                stu.setMiddle(name.substring(name.lastIndexOf(" ")+1));
            } else{ //4
                stu.setFirst(name.substring(name.indexOf(" ")+1));
            }
        }
        else{ //1/2
            stu.setFirst(name.substring(0,name.indexOf(" ")));
            if(name.indexOf(" ")!= name.lastIndexOf(" ")){ //if theres a second space 1
                stu.setMiddle(name.substring(name.indexOf(" ")+1,name.lastIndexOf(" ")));
                stu.setLast(name.substring(name.lastIndexOf(" ")+1));
            } else{ //2
                stu.setLast(name.substring(name.indexOf(" ")+1));
            }
        }
    }

    public StudentList(){
        students = new ArrayList<Student>();
    }

    public void addStudent(Student stu){
        students.add(stu);
        parseName(stu.getName(),stu);
    }

    public void printStuList(){
        for(int i=0; i<students.size(); i++){
            System.out.println("Name: "+students.get(i).getName());
            System.out.println("ID #: "+students.get(i).getID());
            System.out.println("GPA: "+students.get(i).getGPA());
        }
    }

    public void printStudent(String str){
        int index = -1;
        for(int i=0; i<students.size();i++){
            if(students.get(i).getName() == str){
                index = i;
            } 
        }
        if(index>=0){
            System.out.println("Name: " + students.get(index).getName());
            System.out.println("ID #: " + students.get(index).getID());
            System.out.println("GPA: " + students.get(index).getGPA());
        } else{
            System.out.println("This student doesn't exist.");
        }
    }

    public void editStuFirst(String stu, String str){
        int index = -1;
        for(int i=0; i<students.size();i++){
            if(students.get(i).getFirst() == stu){
                index = i;
            } 
        }
        students.get(index).setFirst(str);
    }

    public void editStuMiddle(String stu, String str){
        int index = -1;
        for(int i=0; i<students.size();i++){
            if(students.get(i).getMiddle() == stu){
                index = i;
            } 
        }
        students.get(index).setMiddle(str);
    }

    public void editStuLast(String stu, String str){
        int index = -1;
        for(int i=0; i<students.size();i++){
            if(students.get(i).getLast() == stu){
                index = i;
            } 
        }
        students.get(index).setLast(str);
    }

    public void editStuID(int stu, int str){
        int index = -1;
        for(int i=0; i<students.size();i++){
            if(students.get(i).getID() == stu){
                index = i;
            } 
        }
        students.get(index).setID(str);
    }

    public void editStuGPA(double stu, double str){
        int index = -1;
        for(int i=0; i<students.size();i++){
            if(students.get(i).getGPA() == stu){
                index = i;
            } 
        }
        students.get(index).setGPA(str);
    }

    public void deleteStudent(String str){
        int index = -1;
        for(int i=0; i<students.size();i++){
            if(students.get(i).getName() == str){
                index = i;
            } 
        }
        if(index!=-1){
            students.remove(index);
        }
    }

    public void clearList(){
        students.clear();
    }
}
