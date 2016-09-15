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
        //
    }
    
    public int getMode(){
        //
    }
}