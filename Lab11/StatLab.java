
/**
 *Ariana Park
 *9/27/16
 */
import java.util.Arrays;
public class StatLab{
    int[][] mat;
    
    public StatLab(int[][] matrix){
        mat = matrix;
    }
    
    public void loadArray2D(){
        for(int i=0; i<mat.length; i++){
            for(int j=0; j<mat[i].length; j++){
                mat[i][j] = (int)(Math.random()*7 + 7);
            }
        }
    }
    
    public void printArray2D(){
        for(int i=0; i<mat.length; i++){
            for(int j=0; j<mat[i].length; j++){
                System.out.print(mat[i][j] + "\t");
            }
            System.out.println();
        }
    }
    
    /**
    public int[] sortArray2D(){
        // 1- make it 1d array
        // 2- sort
        int[] list = new int[mat.length*mat[0].length];
        for(int i=0; i<mat.length; i++){
            for(int j=0; j<mat[i].length; j++){
                list[i+j] = mat[i][j];
            }
        }
        return list.Array.sort();//fix
    }
    */
    
    public int getMean2D(){
        int sum = 0;
        for(int i=0; i<mat.length; i++){
            for(int j=0; j<mat[i].length; j++){
                sum += mat[i][j];
            }
        }
        return sum;
    }
}
