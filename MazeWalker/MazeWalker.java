public class MazeWalker
{
    // instance variables - replace the example below with your own
    private int x;

    public MazeWalker()
    {
        // initialise instance variables
        x = 0;
    }
    
    public void walkMaze(MazeBot mazeBot) {
    mazeBot.moveForward();
    mazeBot.moveForward();
    mazeBot.turnLeft();
    mazeBot.moveForward();
    mazeBot.moveForward();
    mazeBot.moveForward();
    mazeBot.turnRight();
    mazeBot.moveForward();
    mazeBot.moveForward();
    mazeBot.turnRight();
    mazeBot.moveForward();
    mazeBot.moveForward();
    mazeBot.moveForward();
    mazeBot.moveForward();
    mazeBot.turnLeft();
    mazeBot.moveForward();
    mazeBot.moveForward();
    mazeBot.moveForward();
    mazeBot.turnLeft();
    mazeBot.moveForward();
    mazeBot.moveForward();
    mazeBot.turnRight();
    mazeBot.moveForward();
    mazeBot.moveForward();
}

}