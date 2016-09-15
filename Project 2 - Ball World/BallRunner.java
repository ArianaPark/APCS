
//Ariana Park
public class BallRunner{
    private  BallWorld ballWorld; 
    private  TGPoint entrancePoint;
    private  BallBot[] ballBotArray;

    //constructors
    public BallRunner(BallWorld ballWorld, TGPoint entrancePoint, int ballBotArrayLength) {
        this.ballWorld = ballWorld;
        this.entrancePoint = entrancePoint;
        ballBotArray = new BallBot[ballBotArrayLength];   
    }

    //helper method
    public  int findFreeBallBotIndex(){
        int returnValue = ballBotArray.length;
        for(int i = 0; i < ballBotArray.length; i++) {
            if(ballBotArray[i] == null)
                return i;//problem here?
            else{
                return ballBotArray.length;
            }
        }
        return returnValue;
    }
    
    public void makeBallBots(){
        BallBot ballBot;
        while(true){
            int freeBallBotIndex = findFreeBallBotIndex();
            System.out.print(freeBallBotIndex);
            System.out.print((freeBallBotIndex < ballBotArray.length));
            if(freeBallBotIndex < ballBotArray.length){
                ballBot = new BallBot(ballWorld,entrancePoint, (int)(Math.random()*360), 20);
                ballBotArray[freeBallBotIndex] = ballBot;
            }

            for(int index = 0; index < ballBotArray.length; index++){
                if(ballBotArray[index] != null && index < ballBotArray.length){//should stop from being null and should be in range/bounds
                    if(ballBotArray[index].canMoveForward(ballWorld)){//object is required, should be ballBot
                        ballBotArray[index].moveForward();
                    }
                    else{
                        double currentHeading = ballBotArray[index].getHeading();
                        ballBotArray[index].setHeading(Math.random()*360);
                    }
                }
            }
        }
    }

    //new run method
    public static void main(String[] args){
        //parameters
        BallWorld ballWorld = new BallWorld(600,600);
        TGPoint tgp = new TGPoint(0,0);
        int arrayLength = 10;
        BallRunner ballBotRunner = new BallRunner(ballWorld, tgp, arrayLength);
        
        ballBotRunner.makeBallBots();
    }
}