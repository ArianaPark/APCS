
/**
 *Ariana Park
 *9/29/16
 */
public class CountOddEven{
    private int[][] matrix;
    private int even;
    private int odd;
    
    public CountOddEven(int a, int b){
        matrix = new int[a][b];
    }
    
    public void loadArray(){
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[i].length;j++){
                matrix[i][j] = (int)(Math.random()*21);
            }
        }
    }
    
    public void printArray(){
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[i].length;j++){
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }
    
    public void countEven(){
        int es = 0;
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[i].length;j++){
                if((matrix[i][j]%2) == 0){
                    es++;
                }
            }
        }
        even = es;
    }
    
    public void countOdd(){
        int length = matrix.length*matrix[0].length;
        odd = length - even;
    }
    
    public int getEven(){
        return even;
    }
    
    public int getOdd(){
        return odd;
    }
}
