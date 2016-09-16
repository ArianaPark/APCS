
/**
 * Nested For-Loop Examples
 */
public class NestedForLoop
{

    public static void main(String[] args){
        NestedForLoop loopOne = new NestedForLoop();
    }

    public NestedForLoop(){
      nestedOne();
      //nestedTwo();
      //nestedThree();
    }

    public void nestedOne(){
        int rows = 5;
        int cols = 2;
        System.out.print("\t rows = " + rows + "\t cols = " + cols + "\n");
        System.out.print("\n\t");
        for(int i = 0; i < rows; i++){
             for(int j = 0; j < cols; j++){
                 System.out.print("i = " + i + ", j = " + j + "\t");
                }	
                System.out.print("\n\t Inner Loop Complete");
                System.out.print("\n\t");
        }
        System.out.print("\n\t Outer Loop Complete");
    }
    
    public void nestedTwo(){
        int rows = 10;   
        System.out.print("\n");
        for(int i = 0; i < rows; i++){
            System.out.print("\t");
            int j;
             for(j = 0; j <= i; j++){
                 System.out.print("-*-");
                }	
               // System.out.print("Inner Complete: i = " +i + ", j = " + j + "\n" );
               System.out.print("\n");
        }
        System.out.print("\n\t Outer Loop Complete");
    }
    
    public void nestedThree(){
        int rows = 10;   
        System.out.print("\n");
        for(int i = rows; i >= 0; i--){
            System.out.print("\t");
            int j;
             for(j = 0; j <=  i; j++){
                 System.out.print("-*-");
                }	
                System.out.print("Inner Complete: i = " +i + ", j = " + j + "\n" );
        }
        System.out.print("\n\t Outer Loop Complete");
    }
}
