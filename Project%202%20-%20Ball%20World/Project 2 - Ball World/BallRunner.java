
//Ariana Park
public class BallRunner{
    private BallWorld ballWorld; 
    private TGPoint entrancePoint;
    private BallBot[] ballBotArray;

    //constructor
    public BallRunner(BallWorld ballWorld, TGPoint entrancePoint, int ballBotArrayLength) {
        ballWorld = ballWorld;
        entrancePoint = entrancePoint;
        ballBotArray = new BallBot[ballBotArrayLength];
    }
    
    //method
    public int findFreeBallBotIndex(){
        for(int i = 0; i < ballBotArray.length; i++) {
            
        }
    }
    
}