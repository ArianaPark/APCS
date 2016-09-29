
/**
 * Ariana Park
 * 9/29/16
 */
public class COERunner
{
    public static void main(String[] args){
        CountOddEven coe = new CountOddEven(5,13);
        coe.loadArray();
        coe.printArray();
        coe.countEven();
        coe.countOdd();
        System.out.println(coe.getEven());
        System.out.println(coe.getOdd());
    }
}
