
/**
 * Quiz 3
 */
public class Quiz3
{

    public Quiz3()
    {
        //  +++++++++++++++++++++++++++++++++++++++  Question One
        int[] pumpkins;
        int[] penguins = new int[6]; // located at Adress @B3412
        penguins[penguins.length - 2] = 6;

        //System.out.println(pumpkins);
        System.out.println(penguins);
        for(int i = 0; i < penguins.length; i++){
            System.out.print(penguins[i]);
            //System.out.print(pumpkins[i]);
        }
        System.out.println();

        //  +++++++++++++++++++++++++++++++++++++++  Question Two

        int[] numbers = new int[8]; // Located at Address ???????
        int[] nums = numbers;
        System.out.println(numbers);
        System.out.println(nums);
        numbers[nums.length - 2] = 4;
        nums[0] = 4;
        nums[0] = numbers[0];
        numbers[nums.length%3] = numbers.length/3;
        for(int i = 0; i < numbers.length; i++){
            //System.out.print(numbers[i]);
            System.out.print(nums[i]);
        }

        //  +++++++++++++++++++++++++++++++++++++++  Question Three
        //         int[] n = new int[3];
        //         for(int i = n.length-1; i >= 0; i--){
        //             System.out.println("Element " + i + " has value:\t" + n[i] );
        //         }
        //  +++++++++++++++++++++++++++++++++++++++  Question Fo
        //         (On the back of your paper) Write a method named countSevens that will 
        //         take in an array of ints named bob, and return the number of sevens in the array.  
        //         If no sevens exist, it will return -1.

        
    }

    public static void main(String[] args){
        Quiz3 q3 = new Quiz3();
    }

}
