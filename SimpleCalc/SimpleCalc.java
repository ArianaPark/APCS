public class SimpleCalc
{
    // instance variables - replace the example below with your own
    public int number1;
    public int number2;

    //Constructor
    public SimpleCalc(int a,int b)
    {
        // initialise instance variables
        number1 = a;
        number2 = b;
    }

    //Methods
    public int add()
    {
        int sum = number1 + number2;
        return sum;
    }
    
    public int subtract(){
        return number1 - number2;
    }
    
    public int mult(){
        return number1 * number2;
    }
    
    public int div(){
        return number1/number2;
    }
    
    public boolean isGreater()
    {
        if (number1 > number2){
            return true;
        }
        
        return false;
    }
}
