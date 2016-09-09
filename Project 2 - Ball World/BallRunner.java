
//Ariana Park
public class BallRunner{
    private BallWorld ballWorld; 
    private TGPoint entrancePoint;
    private BallBot[] ballBotArray;

    //constructors
    public BallRunner(BallWorld ballWorld, TGPoint entrancePoint, int ballBotArrayLength) {
        ballWorld = ballWorld;
        entrancePoint = entrancePoint;
        ballBotArray = new BallBot[ballBotArrayLength];
    }

    //helper method
    public int findFreeBallBotIndex(){
        int returnValue = -1;
        for(int i = 0; i < ballBotArray.length; i++) {
            if(ballBotArray[i] == null)
                returnValue = i;
        }
        if(returnValue == -1)
            return ballBotArray.length;
        else
            return returnValue;
    }

    //new run method
    public static void main(String[] args){
        //parameters
        BallWorld ballWorld = new BallWorld(200,200);
        TGPoint tgp = new TGPoint(0,0);
        int arrayLength = 10;
        BallRunner ballBotRunner = new BallRunner(ballWorld, tgp, arrayLength);
        boolean a = true;
        while(a == true){
            int freeBallBotIndex = findFreeBallBotIndex();
            if(freeBallBotIndex < ballBotArray.length){
                //
            }
        }

    }
}