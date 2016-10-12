import java.awt.*;
import java.awt.font.*;
import java.awt.geom.*;
import java.awt.image.BufferedImage;
import java.text.*;
import java.util.*;
import java.util.List; // resolves problem with java.awt.List and java.util.List

/**
 * A class that represents a picture.  This class inherits from 
 * SimplePicture and allows the student to add functionality to
 * the Picture class.  
 * 
 * @author Barbara Ericson ericson@cc.gatech.edu
 */
public class Picture extends SimplePicture 
{
    ///////////////////// constructors //////////////////////////////////

    /**
     * Constructor that takes no arguments 
     */
    public Picture ()
    {
        /* not needed but use it to show students the implicit call to super()
         * child constructors always call a parent constructor 
         */
        super();  
    }

    /**
     * Constructor that takes a file name and creates the picture 
     * @param fileName the name of the file to create the picture from
     */
    public Picture(String fileName)
    {
        // let the parent class handle this fileName
        super(fileName);
    }

    /**
     * Constructor that takes the width and height
     * @param height the height of the desired picture
     * @param width the width of the desired picture
     */
    public Picture(int height, int width)
    {
        // let the parent class handle this width and height
        super(width,height);
    }

    /**
     * Constructor that takes a picture and creates a 
     * copy of that picture
     * @param copyPicture the picture to copy
     */
    public Picture(Picture copyPicture)
    {
        // let the parent class do the copy
        super(copyPicture);
    }

    /**
     * Constructor that takes a buffered image
     * @param image the buffered image to use
     */
    public Picture(BufferedImage image)
    {
        super(image);
    }

    ////////////////////// methods ///////////////////////////////////////

    /**
     * Method to return a string with information about this picture.
     * @return a string with information about the picture such as fileName,
     * height and width.
     */
    public String toString()
    {
        String output = "Picture, filename " + getFileName() + 
            " height " + getHeight() 
            + " width " + getWidth();
        return output;

    }

    /** Method to set the blue to 0 */
    public void zeroBlue()
    {
        Pixel[][] pixels = this.getPixels2D();
        for (Pixel[] rowArray : pixels)
        {
            for (Pixel pixelObj : rowArray)
            {
                pixelObj.setBlue(0);
            }
        }
    }

    public void zeroRed()
    {
        Pixel[][] pixels = this.getPixels2D();
        for (Pixel[] rowArray : pixels)
        {
            for (Pixel pixelObj : rowArray)
            {
                pixelObj.setRed(0);
            }
        }
    }

    public void zeroGreen()
    {
        Pixel[][] pixels = this.getPixels2D();
        //     for (Pixel[] rowArray : pixels)
        //     {
        //       for (Pixel pixelObj : rowArray)
        //       {
        //         pixelObj.setGreen(0);
        //       }
        //     }
        for (int i = 0; i < pixels.length; i++)
        {
            for (int j = 0; j < pixels[i].length; j++)
            {
                pixels[i][j].setGreen(0);
            }
        }
    }

    /** Method that mirrors the picture around a 
     * vertical mirror in the center of the picture
     * from left to right */
    public void mirrorVertical()
    {
        Pixel[][] pixels = this.getPixels2D();
        Pixel left = null;
        Pixel right = null;
        int width = pixels[0].length;
        for(int i=0; i<pixels.length; i++){
            for(int j=0; j<width/2; j++){
                left = pixels[i][j];
                right = pixels[i][width -1 -j];
                right.setColor(left.getColor());
            }
        }
    }

    //right to left
    public void mirrorVertical2(){
        Pixel[][] pixels = this.getPixels2D();
        Pixel left = null;
        Pixel right = null;
        int width = pixels[0].length;
        for(int i=0; i<pixels.length; i++){
            for(int j=0; j<width/2; j++){
                left = pixels[i][j];
                right = pixels[i][width -1 -j];
                left.setColor(right.getColor());
            }
        }
    }

    //top to bottom
    public void mirrorHorizontal(){
        Pixel[][] pixels = this.getPixels2D();
        Pixel top = null;
        Pixel bottom = null;
        int height = pixels.length;
        for(int i=0; i<height/2; i++){
            for(int j=0; j<pixels[0].length; j++){
                top = pixels[i][j];
                bottom = pixels[height -1 -i][j];
                bottom.setColor(top.getColor());
            }
        }
    }

    //bottom to top
    public void mirrorHorizontal2(){
        Pixel[][] pixels = this.getPixels2D();
        Pixel top = null;
        Pixel bottom = null;
        int height = pixels.length;
        for(int i=0; i<height/2; i++){
            for(int j=0; j<pixels[0].length; j++){
                top = pixels[i][j];
                bottom = pixels[height -1 -i][j];
                top.setColor(bottom.getColor());
            }
        }
    }

    public void keepOnlyBlue(){
        Pixel[][] pixels = this.getPixels2D();
        for(int i=0; i<pixels.length; i++){
            for(int j=0; j<pixels[i].length; j++){
                pixels[i][j].setGreen(0);
                pixels[i][j].setRed(0);
            }
        }
    }

    public void keepOnlyGreen(){
        Pixel[][] pixels = this.getPixels2D();
        for(int i=0; i<pixels.length; i++){
            for(int j=0; j<pixels[i].length; j++){
                pixels[i][j].setBlue(0);
                pixels[i][j].setRed(0);
            }
        }
    }

    public void keepOnlyRed(){
        Pixel[][] pixels = this.getPixels2D();
        for(int i=0; i<pixels.length; i++){
            for(int j=0; j<pixels[i].length; j++){
                pixels[i][j].setGreen(0);
                pixels[i][j].setBlue(0);
            }
        }
    }

    public void negate(){
        Pixel[][] pixels = this.getPixels2D();
        int green = -1;
        int red = -1;
        int blue = -1;
        for(int i=0; i<pixels.length; i++){
            for(int j=0; j<pixels[i].length; j++){
                green = 255 -  pixels[i][j].getGreen();
                red = 255 - pixels[i][j].getRed();
                blue = 255 - pixels[i][j].getBlue();
                pixels[i][j].setGreen(green);
                pixels[i][j].setRed(red);
                pixels[i][j].setBlue(blue);
            }
        }
    }

    public void grayscale(){
        Pixel[][] pixels = this.getPixels2D();
        int sum = 0;
        int average = 0;
        for(int i=0; i<pixels.length; i++){
            for(int j=0; j<pixels[i].length; j++){
                sum = pixels[i][j].getRed() + pixels[i][j].getGreen() + pixels[i][j].getBlue();
                average = sum/3;
                pixels[i][j].setRed(average);
                pixels[i][j].setGreen(average);
                pixels[i][j].setBlue(average);
            }
        }
    }

    public void fixUnderwater(){
        Pixel[][] pixels = this.getPixels2D();
        for(int i=0; i<pixels.length; i++){
            for(int j=0; j<pixels[i].length; j++){
                pixels[i][j].setRed(pixels[i][j].getRed() + 60);
                pixels[i][j].setGreen(pixels[i][j].getGreen() - 60);
                pixels[i][j].setBlue(pixels[i][j].getBlue() - 60);
            }
        }
    }


    /** Mirror just part of a picture of a temple */
    public void mirrorTemple()
    {

    }

    /** copy from the passed fromPic to the
     * specified startRow and startCol in the
     * current picture
     * @param fromPic the picture to copy from
     * @param startRow the start row to copy to
     * @param startCol the start col to copy to
     */
    public void copy(Picture fromPic,int startRow, int startCol)
    {

    }

    /** Method to create a collage of several pictures */
    public void createCollage()
    {

    }

    /** Method to show large changes in color 
     * @param edgeDist the distance for finding edges
     */
    public void edgeDetection(int edgeDist)
    {

    }

    /* Main method for testing - each class in Java can have a main 
     * method 
     */
    public static void main(String[] args) 
    {
        Picture beach = new Picture("beach.jpg");
        beach.explore();
        beach.zeroGreen();
        beach.explore();
    }

} // this } is the end of class Picture, put all new methods before this
