/**
 * Ariana Park
 * 9/9/16
 */
import java.util.Arrays;

public class LoopTwo{
    //instance variable
    private int[] list;
    
    //constructor, n=length of array
    public LoopTwo(int n){
        list = new int[n];
    }
    
    //methods
    public void loadRandom(){ //what is wrong here?
        for(int i = 0; i < list.length; i++){
            int randNum = (int)(Math.random() * list.length) + 1;//RANDOM NOT WORKING
            list[i] = randNum;
        }
    }
    
    public void printArray(){
        for(int i = 0; i < list.length; i++){
            if((i+1) % 10 == 0){
                System.out.println(list[i]);
            }
            else{
                System.out.print(list[i] + "\t");
            }
        }
    }
    
    public void sortArray(){
        Arrays.sort(list);
    }
    
    public double findAverage(){
        double sum = 0.0;
        for(int i = 0; i < list.length; i++){
            sum = sum + list[i];
        }
        double average = sum/list.length;
        return average;
    }
    
    public double getMedian(){
        sortArray();
        int index1 = list.length/2;
        int index2;
        if(list.length%2 == 0){
            index2 = list.length/2 - 1;
            return (list[index1] + list[index2]) / 2;
        }else{
            return list[index1];
        }
    }
    
    public int getMode(){
        int commonNum = -1;
        int counter1 = 0;
        for(int i = 0; i < list.length; i++){
            int counter2 = 0;
            for(int x = 0; x < list.length; x++){
                if(list[x] == list[i]){
                    counter2++;
                }
            }
            if(counter1 < counter2){//if number before less common than latest number
                commonNum = counter2;
            }
        }
        return commonNum;
    }
}