
/**
 *Ariana Park
 *10/28/16
 */
public class StudentList
{
    private Student[] students;
    
    public StudentList(int n){
        students = new Student[n];
    }
    
    public void addStudent(Student stu){
        int index = -1;
        for(int i=students.length-1; i>=0; i--){
            if(students[i]==null){
                index = i;
            }
        }
        students[index] = stu;
    }
    
    public Student[] getSL(){
        return students;
    }
}
