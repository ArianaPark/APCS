//Ariana Park
public class SimpleCalcRunner
{
    public static void main(String[] args){
        int n1 = 7;
        int n2 = 13;
        SimpleCalc sc = new SimpleCalc(n1,n2);
        System.out.println("Numbers: " + n1 + ", " + n2);
        System.out.println("The sum is: " + sc.add());
        System.out.println("The difference is: " + sc.subtract());
        System.out.println("The product is: " + sc.mult());
        System.out.println("The quotient is: " + sc.div());
        System.out.println("n1 is greater than n2: " + sc.isGreater());
    }
}

