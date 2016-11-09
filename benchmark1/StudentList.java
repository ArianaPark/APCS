
/**
 *Ariana Park
 *10/28/16
 */

import java.util.ArrayList;

public class StudentList
{
    private ArrayList<Student> students;

    public StudentList(int n){
        students = new ArrayList<Student>();
    }

    public void addStudent(Student stu){
        students.add(stu);
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
        System.out.println("Name: " + students.get(index).getName());
        System.out.println("ID #: " + students.get(index).getID());
        System.out.println("GPA: " + students.get(index).getGPA());
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

    public ArrayList getSL(){
        return students;
    }
}
