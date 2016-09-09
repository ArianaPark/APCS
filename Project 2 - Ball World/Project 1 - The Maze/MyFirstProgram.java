//Ariana Park
/**
 * public class MyFirstProgram
{
    public static void run()
    {
        Maze maze = new Maze();
        MazeWalker mazeWalker = new MazeWalker();
        mazeWalker.walkMaze(maze.getMazeBot());
        
        
    }
}
*/

/**
 * activity 4 code
public void walkMaze(MazeBot mazeBot) 
    {
        while(mazeBot.canMoveForward() == true)
                mazeBot.moveForward();
        mazeBot.turnLeft();
        while(mazeBot.canMoveForward() == true)
                mazeBot.moveForward();
        mazeBot.turnRight();
        while(mazeBot.canMoveForward() == true)
                mazeBot.moveForward();
        mazeBot.turnRight();
        while(mazeBot.canMoveForward() == true)
                mazeBot.moveForward();
        mazeBot.turnLeft();
        while(mazeBot.canMoveForward() == true)
                mazeBot.moveForward();
        mazeBot.turnLeft();
        while(mazeBot.canMoveForward() == true)
                mazeBot.moveForward();
        mazeBot.turnRight();
        while(mazeBot.canMoveForward() == true)
                mazeBot.moveForward();

        if (mazeBot.didReachGoal()){
            mazeBot.signalSuccess();
        }

        else {
            mazeBot.signalError();
        }

    }
 */