//Ariana Park
public class FactorialCalcRunner
{
    public static void main(String[] args){
        int number = 12;
        FactorialCalc fc = new FactorialCalc(number);
        System.out.println("Number: " + number);
        System.out.println("Factorial: " + fc.factorialCalc());
    }
}