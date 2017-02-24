

public class Range implements NumberGroup
{
    private int[] list;
    
    public Range(int min, int max){
        int length = max-min;
        list = new int[length];
        for(int i=0;i<length;i++){
            list[i] = min+i;
        }
    }
    
    public boolean contains(int x){
        for(int i=0;i<list.length;i++){
            if(list[i]==x) return true;
        }
        return false;
    }
}
