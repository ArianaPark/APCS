
/**
 *Ariana Park
 *9/9/16
 */
public class LoopOne{
    //instance variable
    private int[] list;
    
    //constructor
    public LoopOne(){
        list = new int[10];
    }
    
    //methods
    public void loadArray(){
        for(int i = 0; i < list.length; i++){
            list[i] = (i+1)*5;
        }
    }
    
    public void printArray(){
        for(int i=0; i < list.length; i++){
            System.out.print(list[i] + "\t");
        }
    }
}
