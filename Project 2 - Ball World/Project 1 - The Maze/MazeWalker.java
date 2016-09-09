//Ariana Park 8/26

public class MazeWalker
{
    // instance variable
    private int x;
    
    //constructor
    public MazeWalker()
    {
        // initialise instance variables
        x = 0;
    }

    //runner
    public static void run()
    {
        Maze maze = new Maze();
        MazeWalker mazeWalker = new MazeWalker();
        mazeWalker.anyMaze(maze.getMazeBot());
    }
    
    //mazebot
    public void anyMaze(MazeBot mazeBot){
        while(mazeBot.didNotReachGoal()){
            while(mazeBot.canMoveForward() == true)
                mazeBot.moveForward();
            mazeBot.turnRight();
            if(mazeBot.canMoveForward()){
                while(mazeBot.canMoveForward() == true)
                    mazeBot.moveForward();
            }
            else{
                mazeBot.turnLeft();
                mazeBot.turnLeft();
                while(mazeBot.canMoveForward() == true)
                    mazeBot.moveForward();
            }
        }
        
        if (mazeBot.didReachGoal()){
            mazeBot.signalSuccess();
        }
        else {
            mazeBot.signalError();
        }
    }
    
}
