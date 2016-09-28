
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
        int[] newArray = sl.sortArray2D();
        for(int i=0; i<newArray.length; i++){
            System.out.print(newArray[i] + "\t");
        }
        System.out.println();
        System.out.println(sl.getMean2D());
    }
}
