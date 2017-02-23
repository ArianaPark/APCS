
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
        for(int i=0; i<students.length;i++){//never getting in here
            if(students[i]!=null && students[i].getName() == str){
                index = i;
                System.out.println("change index to i");
            } 
        }
        if(index!=-1){
            students[index] = null;
        }
    }

    public Student[] getSL(){
        return students;
    }
    
    public Student[] insertSort(Student[] list){
        Student temp;
        for(int i=0;i<list.length;i++){
            for(int j = i;j>0;j--){
                if(list[j].getID()<list[j-1].getID()){
                    temp=list[j];
                    list[j] = list[j-1];
                    list[j-1]=temp;
                }
            }
        }
        return list;
    }
    
    public Student[] selectSort(Student[] list){
        for(int i = 0;i<list.length-1;i++){
            int index = i;
            for(int j = i+1;j<list.length;j++){
                if(list[j].getID()<list[index].getID()) index = j;
            }
            Student smallerID = list[index];
            list[index] = list[i];
            list[i] = smallerID;
        }
        return list;
    }
    
    public boolean binarySearch(int key, Student[] list){
        int low = 0;
        int high = list.length-1;
        while(low<=high){
            int mid = (low+high)/2;
            if(list[mid].getID()==key) return true;
            if(list[mid].getID()<key) low = mid+1;
            if(list[mid].getID()>key) high = mid-1;
        }
        return false;
    }
}
