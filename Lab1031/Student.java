
/**
 *Ariana Park
 *10/28/16
 */
public class Student implements Comparable<Student>
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
    
    public int compareTo(Student a){
        Student b = this;
        int aid = a.getID();
        int bid = b.getID();
        if(aid<bid){
            return -1;
        } else if(aid==bid){
            return 0;
        } else{
            return 1;
        }
    }
    
    public Student[] insertSort(){
        
    }
    
    public Student[] selectSort(){
        
    }
}
