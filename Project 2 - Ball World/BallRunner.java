
//Ariana Park
public class BallRunner{
    public static void main(String[] args){
        BallWorld ballWorld = new BallWorld(200,200); 
        TGPoint tgp = new TGPoint(0,0);
        BallBot ballBot = new BallBot(ballWorld, tgp, 0, 25);
        boolean a = true;
        while(a == true){
            if(ballBot.canMoveForward(BallWorld)){
                //parameter wrong FIX IT
                double currentHeading = ballBot.getHeading();
                ballBot.setHeading( (currentHeading + 90) % 360);
            }
            else{
                ballBot.moveForward();
            }
        }
    }
}