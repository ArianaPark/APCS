
/**
 * Ariana Park
 * 11/30/16
 */
import javax.swing.*;
public class MySwingApplication implements Runnable
{
    JFrame jFrame;
    public void run(){
        jFrame = new JFrame("Window");
    }
    
    public static void main() {
        MySwingApplication mySwingApplicationSwing = new MySwingApplication();
        javax.swing.SwingUtilities.invokeLater(mySwingApplicationSwing);
    }
}
