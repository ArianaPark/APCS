
/**
 * Write a description of class Student here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Student
{
    private int stuID;
    private double stuGPA;
    private String stuName;
    
    public Student(int id, double gpa, String name){
        stuID = id;
        stuGPA = gpa;
        stuName = name;
    }
    
    public int getID(){
        return stuID;
    }
    public double getGPA(){
        return stuGPA;
    }
    public String getName(){
        return stuName;
    }
    
    public void setID(int n){
        stuID = n;
    }
    public void setGPA(double n){
        stuGPA = n;
    }
    public void setName(String n){
        stuName = n;
    }
}
