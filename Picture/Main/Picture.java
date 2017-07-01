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
  
  /** Method that mirrors the picture around a 
    * vertical mirror in the center of the picture
    * from right to left */
  public void mirrorVerticalRightToLeft()
  {
    Pixel[][] pixels = this.getPixels2D();
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    int width = pixels[0].length;
    for (int row = 0; row < pixels.length; row++)
    {
      for (int col = 0; col < width / 2; col++)
      {
        leftPixel = pixels[row][col];
        rightPixel = pixels[row][width - 1 - col];
        leftPixel.setColor(rightPixel.getColor());
      }
    } 
  }
  
    /**
     * Method that mirrors the picture around a vertical mirror in the center of
     * the picture from left to right
     */
    public void mirrorVertical()
    {
        Pixel[][] pixels = this.getPixels2D();
        Pixel leftPixel = null;
        Pixel rightPixel = null;
        int width = pixels[0].length;
        for ( int row = 0; row < pixels.length; row++ )
        {
            for ( int col = 0; col < width / 2; col++ )
            {
                leftPixel = pixels[row][col];
                rightPixel = pixels[row][width - 1 - col];
                rightPixel.setColor( leftPixel.getColor() );
            }
        }
    }

  
  /** Mirror just part of a picture of a temple */
  public void mirrorTemple()
  {
    int mirrorPoint = 276;
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    int count = 0;
    Pixel[][] pixels = this.getPixels2D();
    
    // loop through the rows
    for (int row = 27; row < 97; row++)
    {
      // loop from 13 to just before the mirror point
      for (int col = 13; col < mirrorPoint; col++)
      {
        
        leftPixel = pixels[row][col];      
        rightPixel = pixels[row]                       
                         [mirrorPoint - col + mirrorPoint];
        rightPixel.setColor(leftPixel.getColor());
      }
    }
  }
  
   /** Mirror just part of a picture of a snowman */
    public void mirrorArms()
    {
        Pixel topPixel = null;
        Pixel botPixel = null;
        Pixel[][] pixels = this.getPixels2D();

        // loop through the rows
        for ( int row = 155; row < 191; row++ )
        {
            // loop through the columns
            for ( int col = 98; col < 169; col++ )
            {
                topPixel = pixels[row][col];
                botPixel = pixels[191 - row + 191][col];
                botPixel.setColor( topPixel.getColor() );
            }
        }

        // loop through the rows
        for ( int row = 155; row < 191; row++ )
        {
            // loop through the columns
            for ( int col = 238; col < 296; col++ )
            {
                topPixel = pixels[row][col];
                botPixel = pixels[191 - row + 191][col];
                botPixel.setColor( topPixel.getColor() );
            }
        }
    }

   /** Mirror just the gull */
    public void mirrorGull()
    {
        int mirrorPoint = 350;
        Pixel leftPixel = null;
        Pixel rightPixel = null;
        Pixel[][] pixels = this.getPixels2D();

        // loop through the rows
        for ( int row = 225; row < 332; row++ )
        {
            // loop from 13 to just before the mirror point
            for ( int col = 219; col < mirrorPoint; col++ )
            {
                leftPixel = pixels[row][col];
                rightPixel = pixels[row][mirrorPoint - col + mirrorPoint];
                rightPixel.setColor( leftPixel.getColor() );
            }
        }
    }

/**
     * Method that mirrors the picture around a horizontal mirror in the center
     * of the picture from bottom to top
     */
    public void mirrorHorizontalBotToTop()
    {
        Pixel[][] pixels = this.getPixels2D();
        Pixel topPixel = null;
        Pixel bottomPixel = null;
        int height = pixels.length;
        for ( int row = 0; row < height; row++ )
        {
            for ( int col = 0; col < pixels[0].length; col++ )
            {
                topPixel = pixels[row][col];
                bottomPixel = pixels[height - 1 - row][col];
                topPixel.setColor( bottomPixel.getColor() );
            }
        }
    }
  
    
    /**
     * Method that mirrors the picture around a horizontal mirror in the center
     * of the picture from top to bottom
     */
    public void mirrorHorizontal()
    {
        Pixel[][] pixels = this.getPixels2D();
        Pixel topPixel = null;
        Pixel bottomPixel = null;
        int height = pixels.length;
        for ( int row = 0; row < height; row++ )
        {
            for ( int col = 0; col < pixels[0].length; col++ )
            {
                topPixel = pixels[row][col];
                bottomPixel = pixels[height - 1 - row][col];
                bottomPixel.setColor( topPixel.getColor() );
            }
        }
    }
    
   public void mirrorDiagonal() 
   { Pixel[][] pixels = this.getPixels2D();
     Pixel pixel1 = null; Pixel pixel2 = null;
     int width = pixels[0].length; 
    for (int row = 0; row < pixels.length; row++) 
    { for (int col = 0; col < pixels[0].length; col++) { 
   if (col < pixels.length)
    { pixel1 = pixels[row][col];
    pixel2 = pixels[col][row]; pixel1.setColor(pixel2.getColor()); }
    }
   } 
}

  /** copy from the passed fromPic to the
    * specified startRow and startCol in the
    * current picture
    * @param fromPic the picture to copy from
    * @param startRow the start row to copy to
    * @param startCol the start col to copy to
    */
      public void copy( Picture fromPic, int startRow, int startCol )
    {
        Pixel fromPixel = null;
        Pixel toPixel = null;
        Pixel[][] toPixels = this.getPixels2D();
        Pixel[][] fromPixels = fromPic.getPixels2D();
        for ( int fromRow = 0, toRow = startRow; fromRow < fromPixels.length
            && toRow < toPixels.length; fromRow++, toRow++ )
        {
            for ( int fromCol = 0, toCol = startCol; fromCol < fromPixels[0].length
                && toCol < toPixels[0].length; fromCol++, toCol++ )
            {
                fromPixel = fromPixels[fromRow][fromCol];
                toPixel = toPixels[toRow][toCol];
                toPixel.setColor( fromPixel.getColor() );
            }
        }
    }

  public void myCollage()
  {
    Picture flower1 = new Picture("flower1.jpg");
    Picture flower2 = new Picture("flower2.jpg");
    this.copy(flower1,0,0);
    this.copy(flower2,100,0);
    this.copy(flower1,200,0);
    Picture flowerNoBlue = new Picture(flower2);
    flowerNoBlue.zeroBlue();
    this.copy(flowerNoBlue,300,0);
    this.copy(flower1,400,0);
    this.copy(flower2,500,0);
    this.mirrorVertical();
    this.write("collage.jpg");
  }
  
     /**
     * copy from the passed fromPic to the specified startRow and startCol in
     * the current picture
     * 
     * @param fromPic
     *            the picture to copy from
     * @param fromStartRow
     *            the row to start coping from in the from picture
     * @param fromStartCol
     *            the column to start copying from in the from picture
     * @param fromEndRow
     *            the row to stop before in the from picture
     * @param fromEndCol
     *            the column to stop before in the from picture
     * @param toStartRow
     *            the row to start copying to
     * @param toStartCol
     *            the column to start copying to
     */
    public void copy(
        Picture fromPic,
        int fromStartRow,
        int fromStartCol,
        int fromEndRow,
        int fromEndCol,
        int toStartRow,
        int toStartCol )
    {
        Pixel fromPixel = null;
        Pixel toPixel = null;
        Pixel[][] toPixels = this.getPixels2D();
        Pixel[][] fromPixels = fromPic.getPixels2D();
        for ( int fromRow = fromStartRow, toRow = toStartRow; fromRow <= fromEndRow
            && toRow < toPixels.length; fromRow++, toRow++ )
        {
            for ( int fromCol = fromStartCol, toCol = toStartCol; fromCol <= fromEndCol
                && toCol < toPixels[0].length; fromCol++, toCol++ )
            {
                fromPixel = fromPixels[fromRow][fromCol];
                toPixel = toPixels[toRow][toCol];
                toPixel.setColor( fromPixel.getColor() );
            }
        }
    }
  
  /** Method to show large changes in color 
    * @param edgeDist the distance for finding edges
    */
  public void edgeDetection(int edgeDist)
  {
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    Pixel[][] pixels = this.getPixels2D();
    Color rightColor = null;
    for (int row = 0; row < pixels.length; row++)
    {
      for (int col = 0; 
           col < pixels[0].length-1; col++)
      {
        leftPixel = pixels[row][col];
        rightPixel = pixels[row][col+1];
        rightColor = rightPixel.getColor();
        if (leftPixel.colorDistance(rightColor) > 
            edgeDist)
          leftPixel.setColor(Color.BLACK);
        else
          leftPixel.setColor(Color.WHITE);
      }
    }
  }
  
      /**
     * Method to show large changes in color
     * 
     * @param edgeDist
     *            the distance for finding edges
     */
    public void edgeDetection2( int edgeDist )
    {
        Picture copy = new Picture( this );
        Pixel leftPixel = null;
        Pixel rightPixel = null;
        Pixel[][] pixels = this.getPixels2D();
        Color rightColor = null;

        for ( int row = 0; row < pixels.length; row++ )
        {
            for ( int col = 0; col < pixels[0].length - 1; col++ )
            {
                leftPixel = pixels[row][col];
                rightPixel = pixels[row][col + 1];
                rightColor = rightPixel.getColor();
                if ( leftPixel.colorDistance( rightColor ) > edgeDist )
                {
                    leftPixel.setColor( Color.BLACK );
                }
                else
                {
                    leftPixel.setColor( Color.WHITE );
                }
            }
        }
    }
    
    public void keepOnlyBlue()
    {
        Pixel[][] pixels = getPixels2D();
        for ( Pixel[] row : pixels )
        {
            for ( Pixel pixel : row )
            {
                pixel.setRed( 0 );
                pixel.setGreen( 0 );
            }
        }
    }
    
    public void negate()
    {
        Pixel[][] pixels = this.getPixels2D();
        for ( Pixel[] row : pixels )
        {
            for ( Pixel pixel : row )
            {
                pixel.setRed( 255 - pixel.getRed() );
                pixel.setGreen( 255 - pixel.getGreen());
                pixel.setBlue( 255 - pixel.getBlue());
            }
        }
    }
    
     public void grayscale()
    {
        Pixel[][] pixels = this.getPixels2D();
        for ( Pixel[] row : pixels )
        {
            for ( Pixel pixel : row )
            {
                int avg = (int)( ( pixel.getRed() + pixel.getGreen() + pixel.getBlue() ) / 3 );
                pixel.setRed( avg );
                pixel.setBlue( avg );
                pixel.setGreen( avg );
            }
        }
    }
    
        /**
     * Hide a black and white message in the current picture by changing the red
     * to even and then setting it to odd if the message pixel is black
     * 
     * @param messagePict
     *            the picture with a message
     */
    public void encode( Picture messagePict )
    {

        Pixel[][] messagePixels = messagePict.getPixels2D();
        Pixel[][] currPixels = this.getPixels2D();
        Pixel currPixel = null;
        Pixel messagePixel = null;
        int count = 0;
        for ( int row = 0; row < this.getHeight(); row++ )
        {
            for ( int col = 0; col < this.getWidth(); col++ )
            {
                // if the current pixel red is odd make it even
                currPixel = currPixels[row][col];
                if ( currPixel.getRed() % 2 == 1 )
                    currPixel.setRed( currPixel.getRed() - 1 );
                messagePixel = messagePixels[row][col];
                if ( messagePixel.colorDistance( Color.BLACK ) < 50 )
                {
                    currPixel.setRed( currPixel.getRed() + 1 );
                    count++;
                }
            }
        }
        System.out.println( count );
    }
    
       /**
     * Method to decode a message hidden in the red value of the current picture
     * 
     * @return the picture with the hidden message
     */
    public Picture decode()
    {
        Pixel[][] pixels = this.getPixels2D();
        int height = this.getHeight();
        int width = this.getWidth();
        Pixel currPixel = null;
        Pixel messagePixel = null;
        Picture messagePicture = new Picture( height, width );
        Pixel[][] messagePixels = messagePicture.getPixels2D();
        int count = 0;
        for ( int row = 0; row < this.getHeight(); row++ )
        {
            for ( int col = 0; col < this.getWidth(); col++ )
            {
                currPixel = pixels[row][col];
                messagePixel = messagePixels[row][col];
                if ( currPixel.getRed() % 2 == 1 )
                {
                    messagePixel.setColor( Color.BLACK );
                    count++;
                }
            }
        }
        System.out.println( count );
        return messagePicture;
    }
    
  /* Main method for testing - each class in Java can have a main 
   * method 
   */
  public static void main(String[] args) 
  {
    Picture beach = new Picture("beach.jpg");
    beach.explore();
    beach.negate();
    beach.explore();
  }
  
    /**
     * Method to replace the blue background with the pixels in the newBack
     * picture
     * 
     * @param newBack
     *            the picture to copy from
     */
    public void chromakey( Picture newBack )
    {
        Pixel fromPixel = null;
        Pixel toPixel = null;
        Pixel[][] toPixels = this.getPixels2D();
        Pixel[][] fromPixels = newBack.getPixels2D();
        for ( int row = 0; row < this.getHeight(); row++ )
        {
            for ( int col = 0; col < this.getWidth(); col++ )
            {
                toPixel = toPixels[row][col];
                if ( toPixel.getBlue() > toPixel.getRed() )
                {
                    fromPixel = fromPixels[row][col];
                    toPixel.setColor( fromPixel.getColor() );
                }
            }
        }
    }
  
} 
