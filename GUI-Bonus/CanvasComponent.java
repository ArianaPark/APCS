
/**
 * Ariana Park
 * 12/1/16
 */
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class CanvasComponent extends JComponent implements MouseListener, MouseMotionListener, ActionListener, KeyListener
{
    private int width;
    private int height;
    private int ovalW;
    private int ovalH;
    private int xCoord;
    private int yCoord;
    private int mouseX;
    private int mouseY;
    private boolean shapeSelected;
    private int animationDeltaX;
    private double animationDeltaY;
    private int gutterX;
    private int gutterY;
    private Timer animationTimer;
    private int motionSpeed;

    public CanvasComponent(int w, int h){
        setSize(w,h);
        height = h;
        width = w;
        ovalW = w-400;
        ovalH = h-400;
        xCoord = w-200;
        yCoord = h-200;
        this.addMouseListener(this);
        this.addMouseMotionListener(this);
        animationDeltaX = 1;
        animationDeltaY = 0;
        gutterX = 20;
        gutterY = 20;
        animationTimer = new Timer(10,this);
        animationTimer.start();
        motionSpeed = 1;
    }

    protected void paintComponent(Graphics g){
        g.setColor(Color.black);
        g.fillOval(xCoord,yCoord,ovalW,ovalH);
    }

    public void mousePressed(MouseEvent e){
        mouseX = e.getX();
        mouseY = e.getY();
        if(xCoord<mouseX && mouseX<(xCoord+ovalW) && yCoord<mouseY && mouseY<(yCoord+ovalH)){
            shapeSelected = true;
        } else{
            shapeSelected = false;
        }
    }

    public void mouseDragged(MouseEvent e){
        if(shapeSelected){
            int mouseToX = e.getX();
            int mouseToY = e.getY();
            xCoord = xCoord + mouseToX - mouseX;
            yCoord = yCoord + mouseToY - mouseY;
            mouseX = mouseToX;
            mouseY = mouseToY;
            repaint();
        }
    }

    public void mouseClicked(MouseEvent e){
    }

    public void mouseReleased(MouseEvent e){
    }

    public void mouseEntered(MouseEvent e){
    }

    public void mouseExited(MouseEvent e){
    }

    public void mouseMoved(MouseEvent e){
    }

    public void actionPerformed(ActionEvent e){ 
        if(!shapeSelected){
            Dimension componentSizeDimension = new Dimension(width,height);
            int distX = mouseX - xCoord;
            int distY = mouseY - yCoord;
            double slope = distY/distX;
            animationDeltaX = 1;
            animationDeltaY = slope;
            xCoord = xCoord + (animationDeltaX*motionSpeed);
            yCoord = yCoord + (int)(animationDeltaY*motionSpeed);
            repaint();
        }
    }

    public void keyTyped(KeyEvent e){
        char keyChar = e.getKeyChar();
        if(keyChar == '+'){
            motionSpeed++;
        }
        else if(keyChar == '-' && motionSpeed > 0){
            motionSpeed--;
        }
    }

    public void keyPressed(KeyEvent e){
    }

    public void keyReleased(KeyEvent e){
    }
}
