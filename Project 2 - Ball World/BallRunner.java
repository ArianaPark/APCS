
//Ariana Park
public class BallRunner{
    private static BallWorld ballWorld; 
    private static TGPoint entrancePoint;
    private static BallBot[] ballBotArray;

    //constructors
    public BallRunner(BallWorld ballWorld, TGPoint entrancePoint, int ballBotArrayLength) {
        ballWorld = ballWorld;
        entrancePoint = entrancePoint;
        ballBotArray = new BallBot[ballBotArrayLength];   
    }

    //helper method
    public static int findFreeBallBotIndex(){
        int returnValue = -1;
        for(int i = 0; i < ballBotArray.length; i++) {
            if(ballBotArray[i] == null)
                returnValue = i;//problem here?
            else{
                returnValue = ballBotArray.length;
            }
        }
        return returnValue;
    }

    //new run method
    public static void main(String[] args){
        //parameters
        BallWorld ballWorld = new BallWorld(200,200);
        TGPoint tgp = new TGPoint(0,0);
        int arrayLength = 10;
        BallRunner ballBotRunner = new BallRunner(ballWorld, tgp, arrayLength);
        while(true){
            int freeBallBotIndex = findFreeBallBotIndex();
            if(freeBallBotIndex < ballBotArray.length){
                BallBot ballBot = new BallBot(ballWorld, entrancePoint, (int)(Math.random()*360), 20);
                ballBotArray[freeBallBotIndex] = ballBot;
            }

            for(int index = 0; index < ballBotArray.length; index++){
                if(ballBotArray[index] != null){//should stop from being null
                    if(ballBotArray[index].canMoveForward(ballWorld)){//object is required, should be ballBot
                        ballBotArray[index].moveForward();
                    }
                    else{
                        double currentHeading = ballBotArray[index].getHeading();
                        ballBotArray[index].setHeading( (currentHeading + 65) % 360);
                    }
                }
            }
        }
    }
}