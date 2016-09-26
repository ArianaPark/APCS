// A+ Computer Science
// www.apluscompsci.com

//Matrix output example one 

import static java.lang.System.*;
import java.util.Arrays;

public class MatrixOutOne
{
	public static void main(String args[])
	{
	    // +++++++++  Array
	    int[] nums = {2, 7, 8, 5, 6, 1}; // another way to create an array
		out.println("nums = " + nums);
		out.println("nums[3] = " + nums[3]);
		out.println(Arrays.toString(nums));
		// +++++++++  Matrix or 2D Array
		int[][] mat = {{5,7},{5,3,4,6},{0,8,9}};
		out.println();
		out.println("mat[1] = " + mat[1]);
		out.println("mat[1][3] = " + mat[1][3]);
		out.println(Arrays.toString(mat[0]));	
		out.println(Arrays.toString(mat[1]));
	}
}
