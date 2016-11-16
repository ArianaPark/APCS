
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
        name = name.trim();
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
            stu.setFirst(name.substring(0,name.indexOf(" ")));//saying theres no space
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

    public int findStudent(String str){
        int index = -1;
        for(int i=0; i<students.size();i++){
            if(students.get(i).getName() == str){
                index = i;
            } 
        }
        return index;
    }
    
    public int findStudent(int n){
        int index = -1;
        for(int i=0; i<students.size();i++){
            if(students.get(i).getID() == n){
                index = i;
            } 
        }
        return index;
    }
    
    public void printStudent(String str){
        int index = findStudent(str);
        if(index>=0){
            System.out.println("Name: " + students.get(index).getName());
            System.out.println("ID #: " + students.get(index).getID());
            System.out.println("GPA: " + students.get(index).getGPA());
        } else{
            System.out.println("This student doesn't exist.");
        }
    }
    
    public void printStudent(int n){
        int index = findStudent(n);
        if(index>=0){
            System.out.println("Name: " + students.get(index).getName());
            System.out.println("ID #: " + students.get(index).getID());
            System.out.println("GPA: " + students.get(index).getGPA());
        } else{
            System.out.println("This student doesn't exist.");
        }
    }

    //have to check that index!=-1********
    public void editStuID(String stu, int n){
        int index = findStudent(stu);
        students.get(index).setID(n);
    }
    
    public void editStuID(int id, int newID){
        int index = findStudent(id);
        students.get(index).setID(newID);
    }

    public void editStuGPA(String stu, double str){
        int index = findStudent(stu);
        students.get(index).setGPA(str);
    }
    
    public void editStuGPA(int id, double gpa){
        int index = findStudent(id);
        students.get(index).setGPA(gpa);
    }

    public void deleteStudent(String str){
        int index = findStudent(str);
        if(index!=-1){
            students.remove(index);
        }
    }
    
    public void deleteStudent(int id){
        int index = findStudent(id);
        if(index!=-1){
            students.remove(index);
        }
    }

    public void clearList(){
        students.clear();
    }
}
