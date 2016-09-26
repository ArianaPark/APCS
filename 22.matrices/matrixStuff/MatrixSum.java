//A+ Computer Science
// www.apluscompsci.com

//Matrix sum example 

import static java.lang.System.*;

public class MatrixSum
{

    public static int sumMat( int[][] mat )
    {
        int sum = 0;
        for(int i = 0; i < mat.length; i++){
            for(int j = 0; j < mat[i].length; j++){
                sum += mat[i][j];
            }
        }
        return sum;
    }

    public static void main(String args[])
    {
        int[][] twoDRay = {{5,7},{5,3,4,6},{0,8,9}};
        System.out.println( sumMat( twoDRay ) );
    }
}