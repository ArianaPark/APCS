
/**
 *Ariana Park
 *9/27/16
 */
public class StatLabRunner{
    public static void main(String[] args){
        int[][] matrix = new int[3][3];
        StatLab sl = new StatLab(matrix);
        sl.loadArray2D();
        sl.printArray2D();
        //System.out.println(sl.sortArray2D());
        System.out.println(sl.getMean2D());
    }
}
