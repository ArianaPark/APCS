/**
 * This class contains class (static) methods
 * that will help you test the Picture class 
 * methods.  Uncomment the methods and the code
 * in the main to test.
 * 
 * @author Barbara Ericson 
 */
public class PictureTester
{
    /** Method to test zeroGreen */
    public static void testZeroGreen()
    {
        Picture dt = new Picture("beach.jpg");
        dt.explore();
        dt.zeroGreen();
        dt.explore();
    }

    public static void testZeroRed()
    {
        Picture dt = new Picture("beach.jpg");
        dt.explore();
        dt.zeroRed();
        dt.explore();
    }

    public static void testZeroBlue()
    {
        Picture dt = new Picture("beach.jpg");
        dt.explore();
        dt.zeroBlue();
        dt.explore();
    }

    public static void testKeepOnlyBlue()
    {
        Picture dt = new Picture("beach.jpg");
        dt.explore();
        dt.keepOnlyBlue();
        dt.explore();
    }

    public static void testKeepOnlyRed()
    {
        Picture dt = new Picture("beach.jpg");
        dt.explore();
        dt.keepOnlyRed();
        dt.explore();
    }

    public static void testKeepOnlyGreen()
    {
        Picture dt = new Picture("beach.jpg");
        dt.explore();
        dt.keepOnlyGreen();
        dt.explore();
    }

    public static void testNegate(){
        Picture dt = new Picture("beach.jpg");
        dt.explore();
        dt.negate();
        dt.explore();
    }

    public static void testGrayscale(){
        Picture dt = new Picture("beach.jpg"); 
        dt.explore(); 
        dt.grayscale(); 
        dt.explore(); 
    }
    
    public static void testFixUnderwater(){
        Picture dt = new Picture("water.jpg");
        dt.explore();
        dt.fixUnderwater();
        dt.explore();
    }

    /** Method to test mirrorVertical, left to right */
    public static void testMirrorVertical()
    {
        Picture caterpillar = new Picture("caterpillar.jpg");
        caterpillar.explore();
        caterpillar.mirrorVertical();
        caterpillar.explore();
    }
    
    //right to left
    public static void testMirrorVertical2(){
        Picture moon = new Picture("moon-surface.jpg");
        moon.explore();
        moon.mirrorVertical2();
        moon.explore();
    }
    
    //top to bottom
    public static void testMirrorHorizontal(){
        Picture cookie = new Picture("smallCookie.jpg");
        cookie.explore();
        cookie.mirrorHorizontal();
        cookie.explore();
    }
    
    //bottom to top
    public static void testMirrorHorizontal2(){
        Picture cookie = new Picture("smallCookie.jpg");
        cookie.explore();
        cookie.mirrorHorizontal2();
        cookie.explore();
    }

    /** Method to test mirrorTemple */
    public static void testMirrorTemple()
    {
        Picture temple = new Picture("temple.jpg");
        temple.explore();
        temple.mirrorTemple();
        temple.explore();
    }

    /** Method to test the collage method */
    public static void testCollage()
    {
        Picture canvas = new Picture("640x480.jpg");
        canvas.createCollage();
        canvas.explore();
    }

    /** Method to test edgeDetection */
    public static void testEdgeDetection()
    {
        Picture swan = new Picture("swan.jpg");
        swan.edgeDetection(10);
        swan.explore();
    }

    /** Main method for testing.  Every class can have a main
     * method in Java */
    public static void main(String[] args)
    {
        // uncomment a call here to run a test
        // and comment out the ones you don't want
        // to run
        //testZeroGreen();
        //testZeroRed();
        //testZeroBlue();
        //testKeepOnlyBlue();
        //testKeepOnlyRed();
        //testKeepOnlyGreen();
        //testNegate();
        //testGrayscale();
        //testFixUnderwater();
        //testMirrorVertical();
        //testMirrorVertical2();
        //testMirrorHorizontal();
        //testMirrorHorizontal2();
        //testMirrorTemple();
        //testMirrorArms();
        //testMirrorGull();
        //testMirrorDiagonal();
        //testCollage();
        //testCopy();
        //testEdgeDetection();
        //testEdgeDetection2();
        //testChromakey();
        //testEncodeAndDecode();
        //testGetCountRedOverValue(250);
        //testSetRedToHalfValueInTopHalf();
        //testClearBlueOverValue(200);
        //testGetAverageForColumn(0);
    }
}