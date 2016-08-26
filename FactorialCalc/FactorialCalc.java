
public class FactorialCalc
{
    // instance variables - replace the example below with your own
    private int x;

    //constructor
    public FactorialCalc(int n)
    {
        // initialise instance variables
        x = n;
    }

    //method
    public int factorialCalc()
    {
        int count = x;
        int product = 1;
        while (count > 1)
        {
            product = product * count;
            count = count - 1;
        }
        return product;
    }
}
