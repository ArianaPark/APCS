
/**
 * Ariana Park
 * 9/21/16
 */
import java.util.Arrays;
public class ReverseArray
{
    public static void main(String[] args){
        int[] myArray = {1,2,3,5,7,11};
        ReverseArray ra = new ReverseArray();
        System.out.println(Arrays.toString(myArray));
        System.out.println(Arrays.toString(ra.reverseArray(myArray)));
    }
    
    //method
    public int[] reverseArray(int[] list){
        int[] revList = new int[list.length];
        for(int i = 0; i < list.length; i++){
            revList[i] = list[list.length-1-i];
        }
        return revList;
    }
}
