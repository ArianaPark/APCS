
/**
 * Write a description of class Flip here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Random;
import java.util.Arrays;
public class Flip
{
    public Flip(){}

    public static String flipCoin(){
        Random r = new Random();
        int n = (int)(r.nextDouble()*3);
        if(n==0 || n==1){
            return "heads";
        } else {
            return "tails";
        }
    }

    public static boolean arePermutations(int[] a, int[] b){
        int count = 0;
        for(int i=0;i<a.length;i++){
            for(int j=0;j<b.length;j++){
                if(a[i]==b[j]){
                    count++;
                }
            }
        }
        if(count==a.length){
            return true;
        }
        return false;
    }
}
