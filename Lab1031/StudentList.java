
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
        if(index!=-1){
            students[index] = stu;
        } else{
            System.out.println("You can't add this student. The student list is already full.");
        }
    }

    public void printStuList(){
        int length = 0;
        for(int i=0; i<students.length;i++){
            if(students[i]!=null){
                length++;
            }
        }
        for(int i=0; i<length; i++){
            System.out.println("Name: "+students[i].getName());
            System.out.println("ID #: "+students[i].getID());
            System.out.println("GPA: "+students[i].getGPA());
        }
    }

    public void deleteStudent(String str){
        int index = -1;
        for(int i=0; i<students.length;i++){
            if(students[i]!=null && students[i].getName() == str){
                index = 1;
            } 
        }
        if(index!=-1){
            students[index] = null;
        }
    }

    public Student[] getSL(){
        return students;
    }
}
