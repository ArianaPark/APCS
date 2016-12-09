
/**
 * Ariana Park
 * 11/30/16
 */
import javax.swing.*;
public class MySwingApplication implements Runnable
{
    JFrame jFrame;
    CanvasComponent canvasComponent;
    public void run(){
        jFrame = new JFrame("Window");
        jFrame.setSize(450,450);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        canvasComponent = new CanvasComponent(450,450);
        jFrame.add(canvasComponent);
        jFrame.setVisible(true);
        jFrame.addKeyListener(canvasComponent);
    }
    
    public static void main(){
        MySwingApplication mySwingApplicationSwing = new MySwingApplication();
        javax.swing.SwingUtilities.invokeLater(mySwingApplicationSwing);
    }
}
