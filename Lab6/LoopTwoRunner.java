/**
 * Ariana Park
 * 9/9/16
 */
public class LoopTwoRunner
{
    public static void main(String[] args){
        LoopTwo loop2 = new LoopTwo(50);
        loop2.loadRandom();
        loop2.printArray();
        loop2.sortArray();
        loop2.printArray();
        System.out.println("Mean: " + loop2.findAverage());
        System.out.println("Median: " + loop2.getMedian());
        System.out.println("Mode: " + loop2.getMode());
    }
}