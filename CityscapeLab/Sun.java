import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.Dimension;

/**
 * Write a description of class Sun here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Sun
{
    /** description of instance variable x (add comment for each instance variable) */
   private int xLeft;
   private int yTop;
    /**
     * Default constructor for objects of class Car
     */
    public Sun()
    {
        xLeft=500;
        yTop= 30;
    }

    /**
     * Draws the sun
     *
     * @param    g2 the graphics context
 
     */
    public void draw(Graphics2D g2)
    {
 
       
        Ellipse2D.Double Sun1
        =new Ellipse2D.Double(75,75,100,100);
        
        g2.draw(Sun1);


    }

}
