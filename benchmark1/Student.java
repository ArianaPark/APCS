
/**
 *Ariana Park
 *10/28/16
 */

import java.util.ArrayList;

public class Student
{
    private int stuID;
    private double stuGPA;
    private String first;
    private String middle;
    private String last;
    
    public Student(int id, double gpa, String first, String middle, String last){
        stuID = id;
        stuGPA = gpa;
        first = first;
        middle = middle;
        last = last;
    }
    
    public String fullName(String a, String b, String c){
        return c + ", " + a + " " + b;
    }
    
    //getters
    public int getID(){
        return stuID;
    }
    public double getGPA(){
        return stuGPA;
    }
    public String getName(){
        return fullName(first,middle,last);
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
