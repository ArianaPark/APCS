
//Ariana Park
public class BallRunner{
    private BallWorld ballWorld; 
    private TGPoint entrancePoint;
    private BallBot[] ballBotArray;

    //constructors
    public BallRunner(BallWorld ballWorld, TGPoint entrancePoint, int ballBotArrayLength) {
        this.ballWorld = ballWorld;
        this.entrancePoint = entrancePoint;
        ballBotArray = new BallBot[ballBotArrayLength];   
    }

    //methods
    public  int findFreeBallBotIndex(){
        int returnValue = ballBotArray.length;
        for(int i = 0; i < ballBotArray.length; i++) {
            if(ballBotArray[i] == null){
                returnValue = i;
            }
        }
        return returnValue;
    }

    public double distanceBetweenPoints(TGPoint p1, TGPoint p2){//activity 3
        double argument = Math.pow((p1.x - p2.x),2) + Math.pow((p1.y - p2.y),2);
        double dbp = Math.sqrt(argument);
        return dbp;
    }

    public boolean entranceClear(){//activity 3
        for(int i = 0; i < ballBotArray.length; i++){
            if(ballBotArray[i] != null){
                double distance = distanceBetweenPoints(entrancePoint, ballBotArray[i].getPoint());
                if(ballBotArray[i].getRadius()*2 > distance){
                    return false;
                }
            }
        }
        return true;
    }

    public BallBot ballBotToBounceOff(BallBot ballBot){//activity 4
        TGPoint point = ballBot.getPoint();
        TGPoint nextPoint = ballBot.forwardPoint();
        BallBot otherBallBot = ballBot; //parameter ->otherBallBot
        for(int i = 0; i < ballBotArray.length; i++){
            if(otherBallBot != null && ballBotArray[i] != null && otherBallBot != ballBotArray[i]){//make sure bots not null and not same ballBot
                double currentDistance = distanceBetweenPoints(otherBallBot.getPoint(), ballBotArray[i].getPoint());//distance btwn bots
                if(currentDistance <= (otherBallBot.getRadius() + ballBotArray[i].getRadius())){ //check if touching
                    double nextDistance = distanceBetweenPoints(nextPoint, ballBotArray[i].getPoint());
                    if(nextDistance <= currentDistance){//check if will get closer when they move
                        return otherBallBot;
                    }
                }
            }
        }
        return null;
    }
    
    //ballbot method
    public void makeBallBots(){
        BallBot ballBot;
        while(true){
            if(entranceClear()){
                int freeBallBotIndex = findFreeBallBotIndex();
                if(freeBallBotIndex < ballBotArray.length){//creates ballbot
                    ballBot = new BallBot(ballWorld, entrancePoint, (int)(Math.random()*360), (int)(Math.random()*50)+1);
                    ballBot.setColor((int)(Math.random()*32));
                    ballBot.setPixelsPerSecond((int)(Math.random()*200)+5);
                    ballBotArray[freeBallBotIndex] = ballBot;
                }
            }

            for(int index = 0; index < ballBotArray.length; index++){
                if(ballBotArray[index] != null && index < ballBotArray.length){//should stop from being null and should be in range/bounds
                    if(ballBotArray[index].canMoveForward(ballWorld) && ballBotToBounceOff(ballBotArray[index]) == null){
                        //^^^checks ballbot can more forward and won't hit another ballbot/Activity 4
                        ballBotArray[index].moveForward();
                    }
                    else{
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