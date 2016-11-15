
/**
 *Ariana Park
 *10/28/16
 */

import java.util.ArrayList;

public class Student
{
    private int stuID;
    private double stuGPA;
    private String name;
    private String first;
    private String middle;
    private String last;
    
    public Student(int id, double gpa, String name){
        stuID = id;
        stuGPA = gpa;
        this.name = name;
        first = "";
        middle = "";
        last = "";
    }
    
    //getters
    public int getID(){
        return stuID;
    }
    public double getGPA(){
        return stuGPA;
    }
    public String getName(){
        return name;
    }
    public String getFirst(){
        return first;
    }
    public String getMiddle(){
        return middle;
    }
    public String getLast(){
        return last;
    }
    
    //setters
    public void setID(int n){
        stuID = n;
    }
    public void setGPA(double n){
        stuGPA = n;
    }
    public void setName(String n){
        name = n;
    }
    public void setFirst(String f){
        first = f;
    }
    public void setMiddle(String m){
        middle = m;
    }
    public void setLast(String l){
        last = l;
    }
}
